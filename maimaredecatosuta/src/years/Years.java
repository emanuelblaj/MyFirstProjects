package years;
import java.util.Scanner;

public class Years {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Scrie luna: ");
        int month = scanner.nextInt();

        System.out.print("Scrie anul: ");
        int year = scanner.nextInt();

        if(month == 1||month ==3||month ==5||month ==7||month ==8||month ==10||month ==12) {
            System.out.println("Luna are 31 de zile.");
        }
        if(month == 4||month ==6||month ==9||month ==11) {
            System.out.println("Luna are 30 de zile");
        }
        int dayCount = 0;
        if(month==2) {

        }
        else{
            System.out.print("Luna este invalida.");

        }


        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayCount = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                dayCount = 30;
                break;

            case 2:
                if (year % 4 != 0) System.out.println("Luna are 28 de zile.");
                else if (year % 100 != 0) {
                    System.out.println("Luna are 29 de zile.");
                } else if (year % 400 != 0) {
                    System.out.println("Luna are 28 de zile.");
                    break;
                }
                    default:
        }

    }
}
