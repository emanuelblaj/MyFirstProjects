package exercitiul1;
/* Stiind ca X factorial, notat X! este egal cu X * (X -1) * (X-2) .. * 3 * 2 * 1,*/
     /*   Cititi de la tastatura un numar intreg X si afisati X!
        Eg:
        Input:
        X = 5
        Output:
        X! = 120 */

import java.util.Scanner;


public class Exercitiul1 {

    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("X= ");

        int x = scanner.nextInt();

        int fact = 1;
        for (int i = 1; i<=x ; i++) {
           fact = fact *i;
        }
        System.out.println("!X =  " +fact);

    }
}
