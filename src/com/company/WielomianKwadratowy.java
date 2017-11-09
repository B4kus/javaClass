package com.company;

public class WielomianKwadratowy {

    public static void main(String[] args) {

        WieloKwadratowy obj, obj2;
        obj = new WieloKwadratowy(3,5,3);
        obj2 = new WieloKwadratowy(5,1,2);
        obj.dodawanie(obj2);
        obj.mnozenie(obj2);

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

    void mnozenie(WieloKwadratowy obj2){
        System.out.println("Wynik mnozenia dwoch wielomianow to: " + this.a * obj2.a + "x*x*x*x" + " + " + ((this.a * obj2.b) + (this.b * obj2.a)) + "x*x*x" + " + "+
                ((this.a * obj2.c) + (this.b * obj2.b) + (this.c * obj2.a)) + "x*x" + " + " + (this.b * obj2.c + this.c * obj2.b) + " x " + " + " + (this.c * obj2.c ));

    }


}









