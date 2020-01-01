package top.ldtianzhe.web.book.service.impl;

import com.google.common.base.Preconditions;
import top.ldtianzhe.web.book.dao.BookTypeMapper;
import top.ldtianzhe.web.book.exception.ParamException;
import top.ldtianzhe.web.book.model.BookType;
import top.ldtianzhe.web.book.service.BookTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: ldtianzhe
 * @Description:
 */
@Service("bookTypeService")
public class BookTypeServiceImpl implements BookTypeService {

    @Resource
    private BookTypeMapper bookTypeMapper;

    /**
     * @return : java.util.List<BookType>
     * @description: 查询所有图书分类信息
     */
    @Override
    public List<BookType> queryAllBookType() {
        return bookTypeMapper.queryAllBookType();
    }

    /**
     * @param bookTypeId
     * @return : BookType
     * @description: 通过id查询图书分类信息
     */
    @Override
    public List<BookType> selectBookTypeListByBookTypeId(Integer bookTypeId) {
        return bookTypeMapper.selectBookTypeListByBookTypeId(bookTypeId);
    }

    /**
     * @param bookType
     * @return : int
     * @description: 新增分类
     */
    @Override
    public int saveBookType(BookType bookType) {
        if (checkBookTypeNameExist(bookType.getBookTypeName(), bookType.getBookTypeId())) {
            throw new ParamException("分类名称已经存在");
        }
        BookType bookTypes = BookType.builder().bookTypeName(bookType.getBookTypeName())
                .bookTypeParentId(bookType.getBookTypeParentId())
                .bookTypeNote(bookType.getBookTypeNote())
                .build();
        return bookTypeMapper.insertSelective(bookTypes);
    }

    /**
     * @param bookType
     * @return : int
     * @description: 修改分类
     */
    @Override
    public int updateBookType(BookType bookType) {
        if (checkBookTypeNameExist(bookType.getBookTypeName(), bookType.getBookTypeId())) {
            throw new ParamException("分类名称已经存在");
        }
        BookType before = bookTypeMapper.selectByPrimaryKey(bookType.getBookTypeId());
        Preconditions.checkNotNull(before, "需更新分类不存在");
        BookType after = BookType.builder().bookTypeId(bookType.getBookTypeId())
                .bookTypeName(bookType.getBookTypeName())
                .bookTypeParentId(bookType.getBookTypeParentId())
                .bookTypeNote(bookType.getBookTypeNote())
                .build();
        return bookTypeMapper.updateByPrimaryKeySelective(after);
    }

    /**
     * @param bookTypeId
     * @return : int
     * @description: 删除分类
     */
    @Override
    public int deleteBookType(Integer bookTypeId) {
        BookType before = bookTypeMapper.selectByPrimaryKey(bookTypeId);
        Preconditions.checkNotNull(before, "需删除的分类不存在");
        return bookTypeMapper.deleteByPrimaryKey(bookTypeId);
    }


    /**
     * @param bookTypeName
     * @param bookTypeId
     * @return : boolean
     * @description: check分类名称是否存在
     */
    public boolean checkBookTypeNameExist(String bookTypeName, Integer bookTypeId) {
        return bookTypeMapper.countByBookTypeName(bookTypeName, bookTypeId) > 0;
    }
}
