package top.ldtianzhe.web.book.service;

import top.ldtianzhe.web.book.model.Role;

import java.util.List;
import java.util.Map;

/**
 * @Auther: ldtianzhe
 * @Description: RoleService
 */
public interface RoleService {


    /**
     * @param role
     * @return : int
     * @description: 新增角色
     */
     int saveRole(Role role);


    /**
     * @param role
     * @return : int
     * @description: 更新角色
     */
     int updateRole(Role role);


    /**
     * @param roleId
     * @return : int
     * @description: 根据id删除角色
     */
     int deleteRole(Integer roleId);


    /**
     * @param userId
     * @return : void
     * @description: 通过用户id删除用户角色表的关联关系
     */
     void deleteRoleUserRsByUserId(Long userId);


    /**
     * @param roleId
     * @return : void
     * @description: 通过角色id删除用户角色表的关联关系
     */
     void deleteRoleUserRsByRoleId(Integer roleId);


    /**
     * @param map
     * @return : java.util.List<Role>
     * @description: 查询角色列表
     */
     List<Role> selectRoleList(Map<String, Object> map);


    /**
     * @param map
     * @return : int
     * @description: 查询角色总数
     */
     int getTotalRole(Map<String, Object> map);


    /**
     * @param userId
     * @return : java.util.List<Role>
     * @description: 根据用户id查找角色集合
     */
     List<Role> findByUserId(Long userId);


    /**
     * @param map
     * @return : int
     * @description: 为角色分配权限
     */
     int insertRolePermissions(Map<String, Object> map);
}
