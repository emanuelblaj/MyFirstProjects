 package numereprime;

import java.util.Scanner;

public class Numereprime {
  public static void printArray(int[]myArray) {
      for (int a = 0; a < myArray.length; a++) {
          System.out.println(myArray[a] + " ");
      }
  }
   public static boolean testPrim (int x) {
       int i = 2;
       int contordiv = 0;
       while(i <= (x/2) &&  contordiv == 0 ) {
         if(x % i == 0) {
             contordiv++;
         }i++;
       }
       return contordiv == 0 ;
   }
    public static void printNr(int n, int m) {
   int primeFound = 0;
   int[]a = new int[n];
   int contorPrime = 0;
   int i = m;

   while(contorPrime < n) {
       if(testPrim(i) == true) {
           a[contorPrime] = i;
           contorPrime++;
       }
       i++;
   }System.out.println("Numerele prime gasite sunt : ");
   printArray(a);
   }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println(" Introduceti valoarea n : ");
       int n = scanner.nextInt() ;

       System.out.println(" Introduceti valoarea lui m : ");
       int m =scanner.nextInt();

       int [] a = new int[n];   // declaram zona de memorie (un vector)
      System.out.println(" Determinam " +n+ " numere prime");
        printNr(n,m);
    }
}
