package top.ldtianzhe.web.book.service;

import top.ldtianzhe.web.book.model.Permission;
import top.ldtianzhe.web.book.model.User;

import java.util.List;

/**
 * @Auther: ldtianzhe
 * @Description: PermissionService
 */
public interface PermissionService {

    /**
     * @param user
     * @return : java.util.List<Permission>
     * @description: 获取用户权限信息
     */
    List<Permission> queryPermissionsByUser(User user);

    /**
     * @return : java.util.List<Permission>
     * @description: 获取所有权限列表
     */
    List<Permission> queryAll();

    /**
     * @param roleId
     * @return : void
     * @description: 通过角色id删除角色权限表的关联关系
     */
    void deleteRolePermissionRsByRoleId(Integer roleId);

    /**
     * @param roleId
     * @return : java.util.List<java.lang.Integer>
     * @description: 通过角色id查询已经分配的权限信息
     */
    List<Integer> queryPermissionIdsByRoleId(Integer roleId);
}
