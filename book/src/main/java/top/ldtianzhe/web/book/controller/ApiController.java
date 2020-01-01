package top.ldtianzhe.web.book.controller;

import top.ldtianzhe.web.book.common.JsonData;
import top.ldtianzhe.web.book.model.*;
import top.ldtianzhe.web.book.service.BookInfoService;
import top.ldtianzhe.web.book.service.BookTypeService;
import top.ldtianzhe.web.book.service.LendBookService;
import top.ldtianzhe.web.book.service.UserService;
import top.ldtianzhe.web.book.util.Md5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;
import top.ldtianzhe.web.book.model.BookInfo;
import top.ldtianzhe.web.book.model.BookType;
import top.ldtianzhe.web.book.model.LendReturnList;
import top.ldtianzhe.web.book.model.User;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * @author ldtianzhe
 * @description
 * @date 2019/12/30
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @Resource
    private UserService userService;

    @Resource
    private BookInfoService bookInfoService;

    @Resource
    private BookTypeService bookTypeService;

    @Resource
    private LendBookService lendBookService;

    @PostMapping("/user/login")
    public JsonData login(@RequestParam(value = "userName") String userName,
                          @RequestParam(value = "userPassword") String userPassword,
                          HttpServletRequest request,
                          HttpSession session) throws Exception {

        if (StringUtils.isEmpty(userName)) {
            return JsonData.fail("用户名不能为空！");
        }
        if (StringUtils.isEmpty(userPassword)) {
            return JsonData.fail("密码不能为空！");
        }
        User user = userService.findUserByUserName(userName);
        if (user == null) {
            return JsonData.fail("用户不存在！");
        }
        if (user.getUserState() == 0) {
            return JsonData.fail("账号已被禁用！请联系管理员！");
        }
        if (Md5Util.md5(userPassword, Md5Util.SALT).equals(user.getUserPassword())) {
            return JsonData.success(user);
        } else {
            return JsonData.fail("用户名或密码错误！");
        }
    }

    @GetMapping("/books")
    public JsonData getList(){
        List<BookInfo> bookInfoList = bookInfoService.selectBookInfoLists();
        return JsonData.success(bookInfoList);
    }

    @GetMapping("/books/{id}")
    public JsonData getBook(@PathVariable("id") int bookId){
        //JSONArray data = JSONArray.parseArray(JSON.toJSONString(bookInfoService.selectBookInfoById(bookId)));
        List<BookInfo> bookInfos = bookInfoService.selectBookById(bookId);
        for (BookInfo bookInfo : bookInfos) {
            if (bookInfo.getBookState()==1){
                bookInfo.setStatus("借出");
            }else {
                bookInfo.setStatus("在馆");
            }
            List<BookType> bookTypeList = bookTypeService.selectBookTypeListByBookTypeId(bookInfo.getBookType());
            for (BookType bookType : bookTypeList) {
                bookInfo.setTypes(bookType.getBookTypeName());
            }
        }
        return JsonData.success(bookInfos);
    }

    @GetMapping("/lendReturnRecords/{id}" )
    public JsonData getLendInfo(@PathVariable("id") Long userId) {
        List<LendReturnList> lendReturnLists = lendBookService.selectLendReturnRecordByuserId(userId);
        return JsonData.success(lendReturnLists);
    }

}
