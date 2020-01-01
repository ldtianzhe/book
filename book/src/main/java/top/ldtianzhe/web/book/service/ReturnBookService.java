package top.ldtianzhe.web.book.service;

import top.ldtianzhe.web.book.model.LendReturnList;

import java.text.ParseException;
import java.util.List;

/**
 * @Auther: ldtianzhe
 * @Description:
 */
public interface ReturnBookService {

    /**
     * @param bookId
     * @return : java.util.List<LendReturnList>
     * @description: 根据图书id查询图书及借阅者信息
     */
    List<LendReturnList> selectBookInfoAndUserByBookId(Integer bookId) throws ParseException;


    /**
     * @param lendReturnList
     * @return : int
     * @description: 还书
     */
    int returnBook(LendReturnList lendReturnList) throws ParseException;
}
