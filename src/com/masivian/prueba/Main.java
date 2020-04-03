package com.masivian.prueba;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Page> pages = new NumberPrime().calculatePrimes(Constants.TOTAL_ROWS,Constants.TOTAL_COLUMNS,Constants.TOTAL_PRIMES);
        PrintI print = new PrintConsole();
        print.Print(pages,Constants.TOTAL_ROWS,Constants.TOTAL_COLUMNS,Constants.TOTAL_PRIMES);
    }
}
