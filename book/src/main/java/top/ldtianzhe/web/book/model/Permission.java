package top.ldtianzhe.web.book.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Auther: ldtianzhe
 * @Description: PermissionModel
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Permission {

    private Integer permissionId;
    private String permissionName;
    private String permissionUrl;
    private Integer permissionParentId;

    private String permissionIcon;
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date permissionCreateTime;
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date permissionLastModifyTime;
    //不对应数据库字段
    private boolean open = true;
    //不对应数据库字段
    private boolean checked = false;
    //不对应数据库字段
    private List<Permission> children = new ArrayList<>();
    //不对应数据库字段(easy-ui tree grid)
    private Integer _parentId;

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
    }

    public Integer getPermissionParentId() {
        return permissionParentId;
    }

    public void setPermissionParentId(Integer permissionParentId) {
        this.permissionParentId = permissionParentId;
    }

    public String getPermissionIcon() {
        return permissionIcon;
    }

    public void setPermissionIcon(String permissionIcon) {
        this.permissionIcon = permissionIcon;
    }

    public Date getPermissionCreateTime() {
        return permissionCreateTime;
    }

    public void setPermissionCreateTime(Date permissionCreateTime) {
        this.permissionCreateTime = permissionCreateTime;
    }

    public Date getPermissionLastModifyTime() {
        return permissionLastModifyTime;
    }

    public void setPermissionLastModifyTime(Date permissionLastModifyTime) {
        this.permissionLastModifyTime = permissionLastModifyTime;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public List<Permission> getChildren() {
        return children;
    }

    public void setChildren(List<Permission> children) {
        this.children = children;
    }

    public Integer get_parentId() {
        return _parentId;
    }

    public void set_parentId(Integer _parentId) {
        this._parentId = _parentId;
    }
}
