package top.ldtianzhe.web.book.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

/**
 * @Auther: luhailiang
 * @Date: 2019-03-26 22:05
 * @Description: RoleModel
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Role {

    private Integer roleId;
    private String roleName;
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date roleCreateTime;
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date roleLastModifyTime;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getRoleCreateTime() {
        return roleCreateTime;
    }

    public void setRoleCreateTime(Date roleCreateTime) {
        this.roleCreateTime = roleCreateTime;
    }

    public Date getRoleLastModifyTime() {
        return roleLastModifyTime;
    }

    public void setRoleLastModifyTime(Date roleLastModifyTime) {
        this.roleLastModifyTime = roleLastModifyTime;
    }
}
