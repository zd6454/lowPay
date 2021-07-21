package com.cof.server.utils;


import javax.xml.bind.annotation.XmlRootElement;

import com.cof.server.bean.Orders;

import java.util.List;

/**
 * @author huang
 */
@XmlRootElement
public class OrdersGrid {
    private int current;//当前页面号
    private int rowCount;//每页行数
    private int total;//总行数
    private List<Orders> rows;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Orders> getRows() {
        return rows;
    }

    public void setRows(List<Orders> rows) {
        this.rows = rows;
    }
}

