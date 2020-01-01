package top.ldtianzhe.web.book.service;

import top.ldtianzhe.web.book.model.BookType;

import java.util.List;

/**
 * @Auther: ldtianzhe
 * @Description: BookTypeService
 */
public interface BookTypeService {

    /**
     * @return : java.util.List<BookType>
     * @description: 查询所有图书分类信息
     */
    List<BookType> queryAllBookType();

    /**
     * @param bookTypeId
     * @return : BookType
     * @description: 通过id查询图书分类信息
     */
    List<BookType> selectBookTypeListByBookTypeId(Integer bookTypeId);


    /**
     * @param bookType
     * @return : int
     * @description: 新增分类
     */
    int saveBookType(BookType bookType);


    /**
     * @param bookType
     * @return : int
     * @description: 修改分类
     */
    int updateBookType(BookType bookType);

    /**
     * @param bookTypeId
     * @return : int
     * @description: 删除分类
     */
    int deleteBookType(Integer bookTypeId);


}
