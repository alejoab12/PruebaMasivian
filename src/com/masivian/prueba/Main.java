package com.masivian.prueba;


public class Main {


    public static void main(String[] args) {
        int arrayPrimes[] = new int[Constants.MAX + 1];
        arrayPrimes[0] = 2;
        calculatePrimes(arrayPrimes);
        printPrimes(arrayPrimes);
    }

    private static void printPrimes(int[] arrayPrimes) {
        int pageNumber = 1;
        int pageOffSet = 0;
        while (pageOffSet <= Constants.MAX - 1) {
            System.out.print(Constants.TEXT1.concat(Integer.toString(Constants.MAX))
                    .concat(Constants.TEXT2).concat(Integer.toString(pageNumber)).concat(Constants.LINE));
            for (int rowOffSet = pageOffSet; rowOffSet <= pageOffSet + Constants.RR - 1; rowOffSet++) {
                for (int C = 0; C <= Constants.CC - 1; C++) {
                    if (rowOffSet + C * Constants.RR <= Constants.MAX) {
                        System.out.printf(Constants.FORMAT, arrayPrimes[rowOffSet + C * Constants.RR]);
                    }
                }
                System.out.println();
            }
            System.out.println(Constants.TAB);
            pageNumber++;
            pageOffSet += Constants.RR * Constants.CC;
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    private static void calculatePrimes(int[] arrayPrime) {
        int j = 1;
        int k = 1;
        while (k < Constants.MAX) {
            j += 2;
            if (isPrime(j)) {
                arrayPrime[k] = j;
                k++;
            }
        }
    }

}
