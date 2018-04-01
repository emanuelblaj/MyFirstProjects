package numar;
import java.util.Scanner;


public class atribuirenumere {


    public static class Cincinume {
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);

            int number1 = 10;
            int number2 = 20;

            System.out.print("Type your 3 number: ");
            int number3 = scanner.nextInt();
            System.out.print("Type your 4 number: ");
            int number4 = scanner.nextInt();
            System.out.print("Type your 5 number: ");
            int number5 = scanner.nextInt();
            System.out.println("Hey, here are your numbers: " +number1+ "," +number2+ "," +number3+ "," +number4+ " si " +number5);
        }
    }

}
