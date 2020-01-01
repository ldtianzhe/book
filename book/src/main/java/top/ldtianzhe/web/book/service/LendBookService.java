package top.ldtianzhe.web.book.service;

import top.ldtianzhe.web.book.model.LendReturnList;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * @Auther: ldtianzhe
 * @Description:
 */
public interface LendBookService {

    /**
     * @param lendReturnList
     * @return : int
     * @description: 借书
     */
    int lendBook(LendReturnList lendReturnList) throws ParseException;


    /**
     * @param map
     * @return : java.util.List<LendReturnList>
     * @description: 根据用户ID查询借还记录
     */
    List<LendReturnList> selectLendReturnRecordByUserId(Map<String, Object> map) throws ParseException;

    /**
     * @param map
     * @return : int
     * @description: 根据用户ID查询借还记录总数
     */
    int getTotalRecord(Map<String, Object> map);

    List<LendReturnList> selectLendReturnRecordByuserId(Long userId);
}
