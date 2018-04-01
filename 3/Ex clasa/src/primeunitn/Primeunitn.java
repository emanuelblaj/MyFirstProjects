package primeunitn;

import java.util.Scanner;
// prints out all prime numbers until N

public class Primeunitn {

    public static void isPrimeNumber(int number) {

        int divizori = 0;

        for (int j = 2; j < number; j++) {


            if (number % j == 0) {
                divizori = divizori + 1;
            }
        }
        if (divizori == 0)
            System.out.println(number + " este numar prim ");

    }


    public static void showPrimesUnitN(int n) {
        for (int i = 2; i < n; i++) {
            isPrimeNumber(i);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu n: ");
        int n = scanner.nextInt();

        System.out.println("n= " + n);

        showPrimesUnitN(n);

    }
}


