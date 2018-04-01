package suma;
import java.util.Scanner;
public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int avg = 0;

        for(int i = 0; i<5;i++) {
            System.out.println("Type your number " +(i+1)+ " : ");
            numbers[i] = scanner.nextInt();
        }
        for(int i = 0; i<5; i++) {
            sum = sum + numbers[i] ;
            avg = sum/numbers[i];
            if(numbers[i]>max){
                max = numbers[i];
            }
            if(numbers[i]<min) {
                min = numbers[i];
            }
        }
        System.out.println("Suma celor cinci numere este egala cu " + sum);
        System.out.println("Maximul este  " + max);
        System.out.println("Minimul este  " + min);
        System.out.println("Media este  " + avg);


    }
}
