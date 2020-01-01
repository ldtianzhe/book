package top.ldtianzhe.web.book.common;

import lombok.Data;

import java.util.List;

@Data
public class DataGridDataSource<T> {

    private int total;

    private List<T> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
