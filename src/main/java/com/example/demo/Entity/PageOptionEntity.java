package com.example.demo.Entity;

public class PageOptionEntity {
    private int currentPage;
    private int pageSize;
    private int total;
    private int limit;

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotal() {
        return total;
    }
    public int getLimit () {
        return currentPage * pageSize;
    }
}
