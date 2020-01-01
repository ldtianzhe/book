package top.ldtianzhe.web.book.service;

import top.ldtianzhe.web.book.model.User;

import java.util.List;
import java.util.Map;

/**
 * @Auther: ldtianzhe
 * @Description: UserService
 */
public interface UserService {

    /**
     * @param userId
     * @return : User
     * @description: 根据用户id查询用户
     */
     User findUserByUserId(Long userId);


    /**
     * @param userName
     * @return : User
     * @description: 根据用户名查询用户
     */
     User findUserByUserName(String userName);


    /**
     * @param user
     * @return : int
     * @description: 新增用户
     */
     int saveUser(User user);

    /**
     * @param user
     * @return : int
     * @description: 更新用户
     */
     int updateUser(User user);

    /**
     * @param userId
     * @return : int
     * @description: 根据id删除用户
     */
     int deleteUser(Long userId);


    /**
     * @param map
     * @return : java.util.List<User>
     * @description: 查询用户列表
     */
     List<User> selectUserList(Map<String, Object> map);


    /**
     * @param map
     * @return : int
     * @description: 查询用户总数
     */
     int getTotalUser(Map<String, Object> map);

    /**
     * @param map
     * @return : int
     * @description: 为用户分配角色
     */
     int insertUserRoles(Map<String, Object> map);
}
