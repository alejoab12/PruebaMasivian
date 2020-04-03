package com.masivian.prueba;

import java.util.ArrayList;
import java.util.List;

public class NumberPrime {

    public List<Page> calculatePrimes(int rows,int columns,int max) {
        List<Page> pages = new ArrayList<>();
        int j = 1;
        int aux = rows* columns;
        int countPages = (int) Math.ceil(Double.valueOf(max) / Double.valueOf(aux));
        int totalCount = 0;
        for (int t = 1; t <= countPages; t++) {
            Page page = new Page(rows, columns, t);
            int k = 0;
            int col = 0;
            int row = 0;
            while (k < aux && totalCount < max) {
                if (isPrime(j)) {
                    if (row >= rows) {
                        row = 0;
                        col++;
                    }
                    page.addValue(row, col, j == 1 ? 2 : j);
                    if (row < rows) {
                        row++;
                    }
                    k++;
                    totalCount++;
                }
                j += 2;
            }
            pages.add(page);
        }
        return pages;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
