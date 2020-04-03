package com.masivian.prueba;

import java.util.List;
import java.util.Objects;

public class PrintConsole implements PrintI {
    @Override
    public void Print(List<Page> pages,int rows,int columns,int max) {
        pages.forEach(page -> {
            System.out.print(Constants.TEXT1.concat(Integer.toString(max))
                    .concat(Constants.TEXT2).concat(Integer.toString(page.indexPage)).concat(Constants.LINE));
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    Integer prime=page.getMatrizPage()[i][j];
                    if(Objects.nonNull(prime)) {
                        System.out.printf(Constants.FORMAT, prime);
                    }
                }
                System.out.println();
            }
        });
    }
}

