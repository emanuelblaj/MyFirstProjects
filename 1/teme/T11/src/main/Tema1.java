package main;

public class Tema1 {

    static Integer a = 24;
    static Integer b = 27;
    static Integer c = 54;
    static Integer Max, min ;


    public static void main (String[] args) {

        System.out.println( "Maximul este:" + maxTreiNumere());
        System.out.println("Minimul este:" + minTreiNumere());
        min = minTreiNumere();
        Max = maxTreiNumere();

    }
    static Integer minTreiNumere(){

        if(a<b){
            return a;

        } else if(b>c){
            return b;
        }
        else{
            return c;
        }}
    static Integer maxTreiNumere() {
        if(a>b) {
            return a;

        }
        else if(b>c){
            return b;
        }
        else{
            return c;
        }
    }
}

