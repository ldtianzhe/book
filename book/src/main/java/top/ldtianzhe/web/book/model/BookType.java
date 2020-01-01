package top.ldtianzhe.web.book.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @Auther: ldtianzhe
 * @Description: BookTypeModel
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BookType {
    private Integer bookTypeId;

    private String bookTypeName;

    private Integer bookTypeParentId;

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date bookTypeCreateTime;

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date bookTypeLastModifyTime;

    private String bookTypeNote;
    //不对应数据库字段
    private List<BookType> children = new ArrayList<>();

    public Integer getBookTypeId() {
        return bookTypeId;
    }

    public void setBookTypeId(Integer bookTypeId) {
        this.bookTypeId = bookTypeId;
    }

    public String getBookTypeName() {
        return bookTypeName;
    }

    public void setBookTypeName(String bookTypeName) {
        this.bookTypeName = bookTypeName;
    }

    public Integer getBookTypeParentId() {
        return bookTypeParentId;
    }

    public void setBookTypeParentId(Integer bookTypeParentId) {
        this.bookTypeParentId = bookTypeParentId;
    }

    public Date getBookTypeCreateTime() {
        return bookTypeCreateTime;
    }

    public void setBookTypeCreateTime(Date bookTypeCreateTime) {
        this.bookTypeCreateTime = bookTypeCreateTime;
    }

    public Date getBookTypeLastModifyTime() {
        return bookTypeLastModifyTime;
    }

    public void setBookTypeLastModifyTime(Date bookTypeLastModifyTime) {
        this.bookTypeLastModifyTime = bookTypeLastModifyTime;
    }

    public String getBookTypeNote() {
        return bookTypeNote;
    }

    public void setBookTypeNote(String bookTypeNote) {
        this.bookTypeNote = bookTypeNote;
    }

    public List<BookType> getChildren() {
        return children;
    }

    public void setChildren(List<BookType> children) {
        this.children = children;
    }
}
