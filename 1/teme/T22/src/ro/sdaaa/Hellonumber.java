package ro.sdaaa;
import java.util.Scanner;

public class Hellonumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome " + args[0] +" " + args[1]+  " to SDA ");
    }
}
