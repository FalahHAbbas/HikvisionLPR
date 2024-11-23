package com.falah.models;

import java.util.List;

public class Page<T> {
    private List<T> items;

    private int currentPage;
    private int pageSize;
    private int rowCount;
    private int pageCount;
    private int firstRowOnPage;
    private int lastRowOnPage;


    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getFirstRowOnPage() {
        return firstRowOnPage;
    }

    public void setFirstRowOnPage(int firstRowOnPage) {
        this.firstRowOnPage = firstRowOnPage;
    }

    public int getLastRowOnPage() {
        return lastRowOnPage;
    }

    public void setLastRowOnPage(int lastRowOnPage) {
        this.lastRowOnPage = lastRowOnPage;
    }
}
