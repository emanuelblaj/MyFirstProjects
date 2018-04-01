package maimare;

import java.util.Scanner;

public class osuta {

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

        int sum = number1+number2+number3+number4+number5;
        if(sum>100){
            System.out.println("Este mai mare decat 100.");
        }else{
            System.out.println("Suma nu este mai mare decat 100.");
        }

    }
}
