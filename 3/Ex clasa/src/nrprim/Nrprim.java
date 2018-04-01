package nrprim;
import java.util.Scanner;

public class Nrprim {

    public static void printArray (int []myArray) {
        for(int k = 0; k < myArray.length; k++) {
            System.out.print(myArray[k]+ " ");
        }
    }
         public static void printFirstNPrime (int n) {

            int primesFound = 0;
            int i = 2;
             int [] primes= new int[n];
            while(primesFound < n) {
                int divisors = 0;

//                System.out.println("Testam n " +i);
//                for (int j = 2; j < i; j++) {
//                    if (i % j == 0) {
//                        divisors++;
//                    }
                int j = 2;
                while ( j <= (i/2) && divisors == 0  ) {
                  if(i % j == 0 ) {
                      divisors++;
                  }
                  j++;
                   }
//                   System.out.println("divisors " + divisors);
                //                   System.out.println("divisors " + divisors);

                if (divisors == 0) {
//                    System.out.println("Numarul " + i + " este prim");

                  primes[primesFound] = i; /* Afisare ray*/
                    primesFound++;
                }
                i++;
            }
            System.out.print("Numere prime gasite : " );
             printArray(primes);
            }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter n: ");
        int n = scanner.nextInt();
        System.out.println("Determining first " +n + " primes." );

        printFirstNPrime(n);
    }
}
