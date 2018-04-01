package ifelse;

import java.util.Scanner;

public class Ifelsestatemenet {
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

           if(number2<number1){
               System.out.println(number2);
           }
        if(number3<number1){
            System.out.println(number3);
        }
        if(number4<number1){
            System.out.println(number4);
        }
        if(number5<number1){
            System.out.println(number5);
        }

    }

}
