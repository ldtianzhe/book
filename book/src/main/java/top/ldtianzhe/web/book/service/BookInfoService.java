package top.ldtianzhe.web.book.service;

import top.ldtianzhe.web.book.model.BookInfo;

import java.util.List;
import java.util.Map;

/**
 * @Auther: ldtianzhe
 * @Description: BookInfoService
 */
public interface BookInfoService {


    /**
     * @param bookInfo
     * @return : int
     * @description: 新增图书
     */
    int saveBookInfo(BookInfo bookInfo);

    /**
     * @param bookInfo
     * @return : int
     * @description: 编辑图书
     */
    int updateBookInfo(BookInfo bookInfo);


    /**
     * @param bookId
     * @return : int
     * @description: 删除图书
     */
    int deleteBookInfo(Integer bookId);


    /**
     * @param map
     * @return : java.util.List<BookInfo>
     * @description: 查询图书列表
     */
    List<BookInfo> selectBookInfoList(Map<String, Object> map);

    /**
     * @param map
     * @return : int
     * @description: 查询图书列表总数
     */
    int getTotalBook(Map<String, Object> map);

    /**
     * @param bookId
     * @return : java.util.List<BookInfo>
     * @description: 根据id查询图书
     */
    List<BookInfo> selectBookById(Integer bookId);


    /**
     * @param bookId
     * @return : BookInfo
     * @description: 根据id查询图书
     */
    BookInfo selectBookInfoById(Integer bookId);

    List<BookInfo> selectBookInfoLists();
}
