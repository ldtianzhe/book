package top.ldtianzhe.web.book.service.impl;

import com.google.common.base.Preconditions;
import top.ldtianzhe.web.book.dao.BookInfoMapper;
import top.ldtianzhe.web.book.model.BookInfo;
import top.ldtianzhe.web.book.service.BookInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Auther: ldtianzhe
 * @Description: BookInfoServiceImpl
 */
@Service("bookInfoService")
public class BookInfoServiceImpl implements BookInfoService {

    @Resource
    private BookInfoMapper bookInfoMapper;

    /**
     * @param bookInfo
     * @return : int
     * @description: 新增图书
     */
    @Override
    public int saveBookInfo(BookInfo bookInfo) {
        BookInfo bookInfos = BookInfo.builder().bookIsbn(bookInfo.getBookIsbn())
                .bookName(bookInfo.getBookName())
                .bookAuthor(bookInfo.getBookAuthor())
                .bookPublish(bookInfo.getBookPublish())
                .bookPrice(bookInfo.getBookPrice())
                .bookState(bookInfo.getBookState())
                .bookType(bookInfo.getBookType())
                .bookShelf(bookInfo.getBookShelf())
                .bookIntroduction(bookInfo.getBookIntroduction()).build();
        return bookInfoMapper.insertSelective(bookInfos);
    }

    /**
     * @param bookInfo
     * @return : int
     * @description: 编辑图书
     */
    @Override
    public int updateBookInfo(BookInfo bookInfo) {

        BookInfo before = bookInfoMapper.selectByPrimaryKey(bookInfo.getBookId());
        Preconditions.checkNotNull(before, "需更新的图书不存在");
        BookInfo after = BookInfo.builder().bookId(bookInfo.getBookId())
                .bookIsbn(bookInfo.getBookIsbn())
                .bookName(bookInfo.getBookName())
                .bookAuthor(bookInfo.getBookAuthor())
                .bookPublish(bookInfo.getBookPublish())
                .bookPrice(bookInfo.getBookPrice())
                .bookState(bookInfo.getBookState())
                .bookType(bookInfo.getBookType())
                .bookShelf(bookInfo.getBookShelf())
                .bookIntroduction(bookInfo.getBookIntroduction()).build();
        return bookInfoMapper.updateByPrimaryKeySelective(after);
    }

    /**
     * @param bookId
     * @return : int
     * @description: 删除图书
     */
    @Override
    public int deleteBookInfo(Integer bookId) {
        BookInfo before = bookInfoMapper.selectByPrimaryKey(bookId);
        Preconditions.checkNotNull(before, "需删除的图书不存在");
        return bookInfoMapper.deleteByPrimaryKey(bookId);
    }

    /**
     * @param map
     * @return : java.util.List<BookInfo>
     * @description: 查询图书列表
     */
    @Override
    public List<BookInfo> selectBookInfoList(Map<String, Object> map) {
        return bookInfoMapper.selectBookInfoList(map);
    }

    /**
     * @param map
     * @return : int
     * @description: 查询图书列表总数
     */
    @Override
    public int getTotalBook(Map<String, Object> map) {
        return bookInfoMapper.getTotalBook(map);
    }

    /**
     * @param bookId
     * @return : java.util.List<BookInfo>
     * @description: 根据id查询图书
     */
    @Override
    public List<BookInfo> selectBookById(Integer bookId) {
        return bookInfoMapper.selectBookById(bookId);
    }

    /**
     * @param bookId
     * @return : BookInfo
     * @description: 根据id查询图书
     */
    @Override
    public BookInfo selectBookInfoById(Integer bookId) {
        BookInfo before = bookInfoMapper.selectByPrimaryKey(bookId);
        Preconditions.checkNotNull(before, "图书不存在");
        return bookInfoMapper.selectByPrimaryKey(bookId);
    }

    @Override
    public List<BookInfo> selectBookInfoLists() {
        return bookInfoMapper.selectBookInfoLists();
    }


}
