package com.company;

public class WielomianKwadratowy {

    public static void main(String[] args) {

        WieloKwadratowy obj, obj2;
        obj = new WieloKwadratowy(3,5,9);
        obj2 = new WieloKwadratowy(5,1,7);
        obj.dodawanie(obj2);

    }

}

class WieloKwadratowy {

    int a;
    int b;
    int c;

    WieloKwadratowy(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;


    }

    void dodawanie(WieloKwadratowy obj2){
        int wynikA, wynikB, wynikC;

        wynikA = this.a + obj2.a;
        wynikB = this.b + obj2.b;
        wynikC = this.c + obj2.c;
        System.out.println("Wynik dodawanie dwoch wielomianow to: " + wynikA + "x*x" + " + " + wynikB + "x" + " + "+ wynikC);



    }


}









