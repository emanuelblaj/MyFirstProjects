package parimpar;




import java.util.Scanner;

public class Parimar {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Scrie un numar: ");
            int number = scanner.nextInt();
            int rest = number%2;


            switch (rest) {
                case 0:  System.out.println(number + " este numar par");
                    ;
                    break;
                default:  System.out.println(number + " este numar impar");

            }
        }
}
