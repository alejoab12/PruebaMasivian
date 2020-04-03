package com.masivian.prueba;

public class Page {
    int indexPage;
    private Integer[][] matrizPage;

    public Page(int rows, int columns, int indexPage) {
        this.matrizPage = new Integer[rows][columns];
        this.indexPage=indexPage;
    }

    public void addValue(int row, int col, int value) {
        this.matrizPage[row][col] = value;
    }

    public int getIndexPage() {
        return this.indexPage;
    }

    public Integer[][] getMatrizPage() {
        return this.matrizPage;
    }
}
