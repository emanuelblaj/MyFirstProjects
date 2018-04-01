package cincinume2;

import java.util.Scanner;

public class Cincinume2 {
    public static class Hellonumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Type your name: ");
            String name1 = "Cristi";
            String name2 = scanner.nextLine();
            String name3 = scanner.nextLine();
            String name4 = scanner.nextLine();
            String name5 = scanner.nextLine();
            System.out.println("Hey " + name1 + "," + name2 + "," + name3 + "," + name4 + " si " + name5 + " ,welcome to SDA!");
        }
    }
}
