import java.util.Scanner;

public class MainArrays {
    public static void printArray(int[] myArray) {
        for(int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i] + " ");
        }
    }
    public static int positionOfElementInArray(int[] a, int n, int e) {
        //        presupunem initial ca acesta nu exista in array
        int pozitie = -1;

//        parcurgem array si cautam elementul
//          for(int i = 0; i < n; i ++) {
//            if(a[i] == e) {
//              pozitie = i;
//         }
//        }

        // CU WHILE
        int i = 0;
        while (pozitie < 0 && i < n) {
            System.out.println("Testam pozitia " + i + " din array");
            if (a[i] == e) {
                pozitie = i;
            }
            i++;
        }
        return pozitie;

    }
    public static int[ ] removeDuplicates(int[] myArray, int n ) {
int [] myUnique = new int[n];
// numarul de elemente unice gasite
int nrOfUniqueElementsFound = 0;

for (int i = 0; i < n; i ++) {
    // elementul pe care vreau sa il caut
    int e = myArray[i];
int position = positionOfElementInArray(myArray, n, myArray[i]);
if(position == i) {
    myUnique[nrOfUniqueElementsFound] = e;
    nrOfUniqueElementsFound++;
}
}
return myUnique;

    }

    public static void main(String[] args) {

///*  Gasirea pozitiei unui element cautat intr-un array*/
        Scanner scanner = new Scanner(System.in);
        /*Citim n*/
        System.out.println("Cititi n : ");
        int n = scanner.nextInt();

//        Citim array[n]
        System.out.println("Cititi " + n + " elemente: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
//        afisam array[n]
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();

//        citim elementul cautat
        System.out.println(" ");
        System.out.println("Cititi elementul cautat: ");
        int e = scanner.nextInt();

        int pozitie = positionOfElementInArray(a, n, e);
//      afisam rezultatul cautarii
        if (pozitie>=0) {
            System.out.println("Pozitia lui " + e + " este " + pozitie);

        }else {
            System.out.println("Elementul nu exista in array.");
        }
        int[] aUnique = removeDuplicates(a, n);
        printArray(aUnique);
    }
}
