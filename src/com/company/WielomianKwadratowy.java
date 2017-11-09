package com.company;

public class WielomianKwadratowy {

    public static void main(String[] args) {

        WieloKwadratowy obj, obj2;
        obj = new WieloKwadratowy(-5,6,-2);
        obj2 = new WieloKwadratowy(5,1,2);
        obj.dodawanie(obj2);
        obj.mnozenie(obj2);
        obj.miejsceZerwo();

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
    void miejsceZerwo(){
        int delta;
        double miejsceJeden, miejsceDwa, miejsceZero;
        delta = this.b * this.b - 4 * this.a * this.c;
        System.out.println(delta);
        if (delta > 0) {
            miejsceJeden = (-this.b + Math.sqrt(delta)) / (2 * this.a);
            miejsceDwa = (-this.b - Math.sqrt(delta)) / (2 * this.a);
            System.out.println("Miejsca zerwo funkcji to: " + miejsceJeden + " oraz " + miejsceDwa);
        }else if (delta == 0){
            miejsceZero = - this.b/(2 * this.a);
            System.out.println("Miejsce zero funkcji to: " + miejsceZero);
        }else {
            System.out.println("Brak miejsc zerowych funkcji.");
        }
    }


}









