package pozitielement;

import java.util.Scanner;

public class Pozitielement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for(int i = 0; i<5; i++) {
            System.out.println("Please, insert " + (i+1) + " number: ");
            numbers[i] = scanner.nextInt();
            }


    }
}
