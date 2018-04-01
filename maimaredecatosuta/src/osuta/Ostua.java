package osuta;

import java.util.Scanner;


public class Ostua {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your 1 number: ");
        int number1 = scanner.nextInt();
        System.out.print("Type your 2 number: ");
        int number2 = scanner.nextInt();
        System.out.print("Type your 3 number: ");
        int number3 = scanner.nextInt();
        System.out.print("Type your 4 number: ");
        int number4 = scanner.nextInt();
        System.out.print("Type your 5 number: ");
        int number5 = scanner.nextInt();


        if (number1 % 2 == 0) {
            System.out.println(number1+" este numar par");
        }
       if(number2 % 2 == 0) {
            System.out.println(number2+ " este numar par");
        }
        if(number3 % 2 == 0) {
            System.out.println(number3+ " este numar par");
        }
        if(number4 % 2 == 0) {
            System.out.println(number4+ " este numar par");
        }
        if(number5 % 2 == 0) {
            System.out.println(number5+ " este numar par");
        }

    }
}
