package cincinume;

import java.util.Scanner;

public class Cincinume {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your 1 name: ");
        String name1 = scanner.nextLine();
        System.out.print("Type your 2 name: ");
        String name2 = scanner.nextLine();
        System.out.print("Type your 3 name: ");
        String name3 = scanner.nextLine();
        System.out.print("Type your 4 name: ");
        String name4 = scanner.nextLine();
        System.out.print("Type your 5 name: ");
        String name5 = scanner.nextLine();
        System.out.println("Hey "+name1+ "," +name2+ "," +name3+ "," +name4+ " si " +name5+" ,welcome to SDA!");
    }
}
