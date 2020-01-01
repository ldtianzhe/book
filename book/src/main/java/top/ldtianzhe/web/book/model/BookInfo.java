package top.ldtianzhe.web.book.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * @Auther: ldtianzhe
 * @Description: BookInfoModel
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class BookInfo {
    private Integer bookId;

    private String bookIsbn;

    private String bookName;

    private String bookAuthor;

    private String bookPublish;

    private BigDecimal bookPrice;

    private Integer bookState;

    private Integer bookType;

    private Integer bookShelf;

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date bookCreateTime;

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date bookLastModifyTime;

    private String bookIntroduction;

    private String types;

    private String status;


    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublish() {
        return bookPublish;
    }

    public void setBookPublish(String bookPublish) {
        this.bookPublish = bookPublish;
    }

    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Integer getBookState() {
        return bookState;
    }

    public void setBookState(Integer bookState) {
        this.bookState = bookState;
    }

    public Integer getBookType() {
        return bookType;
    }

    public void setBookType(Integer bookType) {
        this.bookType = bookType;
    }

    public Integer getBookShelf() {
        return bookShelf;
    }

    public void setBookShelf(Integer bookShelf) {
        this.bookShelf = bookShelf;
    }

    public Date getBookCreateTime() {
        return bookCreateTime;
    }

    public void setBookCreateTime(Date bookCreateTime) {
        this.bookCreateTime = bookCreateTime;
    }

    public Date getBookLastModifyTime() {
        return bookLastModifyTime;
    }

    public void setBookLastModifyTime(Date bookLastModifyTime) {
        this.bookLastModifyTime = bookLastModifyTime;
    }

    public String getBookIntroduction() {
        return bookIntroduction;
    }

    public void setBookIntroduction(String bookIntroduction) {
        this.bookIntroduction = bookIntroduction;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
