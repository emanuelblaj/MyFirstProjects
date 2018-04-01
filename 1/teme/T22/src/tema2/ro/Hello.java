package tema2.ro;

import java.util.Scanner;

public class Hello {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = scanner.nextLine();
        System.out.println(name+ " ,welcome to SDA!");
    }
}
