package media;

import java.util.Scanner;

public class Media {
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

        int max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        if (number4 > max) {
            max = number4;
        }
        if (number5 > max) {
            max = number5;
        }
        System.out.println("Maximul este " +max);
    }
}
