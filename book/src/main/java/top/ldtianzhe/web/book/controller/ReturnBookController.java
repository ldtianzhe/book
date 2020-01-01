package top.ldtianzhe.web.book.controller;

import top.ldtianzhe.web.book.annotation.LoginRequired;
import top.ldtianzhe.web.book.common.JsonData;
import top.ldtianzhe.web.book.model.BookInfo;
import top.ldtianzhe.web.book.model.LendReturnList;
import top.ldtianzhe.web.book.service.BookInfoService;
import top.ldtianzhe.web.book.service.ReturnBookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.List;

/**
 * @Auther: ldtianzhe
 * @Description:
 */
@RestController
@RequestMapping("/book")
public class ReturnBookController {

    @Resource
    private ReturnBookService returnBookService;

    @Resource
    private BookInfoService bookInfoService;


    /**
     * @param bookId
     * @return : JsonData
     * @description: 根据图书id查询图书及借阅者信息
     */
    @PostMapping("/bookInfoAndUserByBookId")
    @LoginRequired
    public JsonData selectBookInfoAndUserByBookId(Integer bookId) throws ParseException {

        List<LendReturnList> lendReturnLists = returnBookService.selectBookInfoAndUserByBookId(bookId);
        if (lendReturnLists.size() == 0) {
            return JsonData.fail("记录不存在");
        } else {
            return JsonData.success(lendReturnLists);
        }
    }


    /**
     * @param lendReturnList
     * @return : JsonData
     * @description: 还书   超期罚款||损毁罚款  未完成
     */
    @PostMapping("/returnBook")
    @LoginRequired
    public JsonData returnBook(LendReturnList lendReturnList) throws ParseException {
        int i = returnBookService.returnBook(lendReturnList);
        //更新图书状态为正常
        BookInfo bookInfo = BookInfo.builder()
                .bookId(lendReturnList.getBookId())
                .bookState(0).build();
        bookInfoService.updateBookInfo(bookInfo);
        if (i > 0) {
            return JsonData.success(i, "还书成功");
        } else {
            return JsonData.fail("还书失败");
        }
    }
}
