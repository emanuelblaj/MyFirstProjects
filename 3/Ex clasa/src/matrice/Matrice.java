package matrice;

import java.util.Scanner;

public class Matrice {
    public static void  sumColumns(int size, int[][] myMatrix) {

        for(int j = 0; j < size; j++) {
//           iterem prin coloane
            int sumC= 0;
           double avgL = 0;
            for(int i = 0; i < size;i++) {
                sumC = sumC + myMatrix[i][j];
                 avgL = sumC/size;
            }
            System.out.println("Suma elementelor de pe coloana " +(j+1)+" este " +sumC);
            System.out.println("Media elementelor de pe coloana " +(j+1)+" este " +avgL);
        }

    }



    public static void  sumLines(int size, int[][] myMatrix) {

        for(int i = 0; i < size; i++) {
            int sumL = 0;
            int avgL = 0;
            for(int j = 0; j < size;j++) {
               sumL = sumL + myMatrix[i][j];
            }
            System.out.println("Suma elementelor de pe linia " +(i+1)+" este " +sumL);
        }

    }
    public static void printMatrix(int [][] myMatrix) {
        for(int i = 0; i < myMatrix.length; i++) {
            for(int j = 0; j < myMatrix[i].length;j++) {
                System.out.print(myMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
       System.out.println("Enter matrix size : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Reading matrix " + n +" x " +n);
        int[][] a = new int[n][n];
        for (int i = 0; i< n ;i++) {
            for(int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }

        }

        printMatrix(a);
        sumLines(n, a);
        sumColumns(n, a);

    }
}
