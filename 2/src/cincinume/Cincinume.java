package cincinume;
import java.util.Scanner;
public class Cincinume {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];
        for(int i=0 ; i<5; i++) {
            System.out.println("Type your name number " + (i + 1)+ " : ");
            names[i] =scanner.nextLine();
        }
        System.out.println("Here is your name list: ");
        for(int i=4; i >= 0; i--){
            System.out.println((5-i) + " . " +names[i]);
        }
    }
}
