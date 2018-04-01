package cincinumere;

import java.util.Scanner;

public class Cincinumere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int ncount = 0; // numarul de numere pozitive
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(ncount<5){
            System.out.println("Scrie numarul : ");
            int n = scanner.nextInt();

            if(n>0){
                ncount = ncount +1;


                System.out.println( ncount+ " numar pozitiv. " );

            }else {
                System.out.println(n+ " este numar negativ.");
            }

            if(n>max) {
                max = n;

            }
            if(n<min){
                min = n;
            }

        }System.out.println();
        System.out.println("Maximul este " + max);
        System.out.println();
        System.out.println("       Minimul este " +min);



    }
}
