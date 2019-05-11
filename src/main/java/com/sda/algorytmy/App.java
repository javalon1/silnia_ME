package com.sda.algorytmy;

/**
 * Hello world!
 *
 */
public class App {

    public static double ciag(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 0.5;
        }
        if (n < 2) {
            return -ciag(n - 1) * ciag(n - 2);
        }

        public static int ciag2(int n){
            if(n == 1){
                return -1;
            }
            return -ciag2(n-1) * n -3;

        }


        {
            public static int silnia(int n){
            System.out.println(n);
            System.out.println(ciag(5));
            if (n < 2) {
                return 1;
            }

            return n * silnia(n - 1);
        }

            public static void main (String[]args ){
            System.out.println(silnia);
            int wynik = 1;
            System.out.println(silnia(5));


            /*int silnia = 5;*/
            for (int i = 1; i <= silnia; i++) {
                wynik = wynik * i;

            }
            System.out.println("Silnia: " + wynik);
        }

        }
    }
}
