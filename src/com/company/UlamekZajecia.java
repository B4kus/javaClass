package com.company;

public class UlamekZajecia {

    public static void main(String[] args)
    {
        Ulamek obj, obj2, obj3;

        obj = new Ulamek(8,4);
        obj2 = new Ulamek(3,7);
        obj3 = new Ulamek(3,2);
        obj.dodawanie(obj2);
        obj.odejmowanie(obj2);
        obj.mnozenie(obj2);
        obj.odwroc();
        obj.skroc();


        double wynikDziesietny = obj.rozDziesietne();
        System.out.println("Rozwiniecie dziesietne ulamka to: " + wynikDziesietny);


    }
}

class Ulamek {
    int licznik;
    int mianownik;


    Ulamek(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;


    }

    void dodawanie(Ulamek obj2) {
        int wynikLicznik, wynikMianownik;
        if (this.mianownik == obj2.mianownik) {
            wynikLicznik = this.licznik + obj2.licznik;
            wynikMianownik = this.mianownik;
            System.out.println("Wynik dodawania ułamków to:" + " " + wynikLicznik + " " + wynikMianownik);
        } else {
            wynikLicznik = (this.licznik * obj2.mianownik) + (this.mianownik * obj2.licznik);
            wynikMianownik = this.mianownik * obj2.mianownik;
            System.out.println("Wynik dodawania ułamków to:" + " " + wynikLicznik + " " + wynikMianownik);
        }
    }

    void odejmowanie(Ulamek obj2) {
        int wynikLicznika, wynikMianownika;
        if (this.mianownik == obj2.mianownik) {
            wynikLicznika = this.licznik - obj2.licznik;
            wynikMianownika = this.mianownik;
            System.out.println("Wynik dodawania ułamków to:" + " " + wynikLicznika + " " + wynikMianownika);
        } else {
            wynikLicznika = (this.licznik * obj2.mianownik) - (this.mianownik * obj2.licznik);
            wynikMianownika = this.mianownik * obj2.mianownik;
            System.out.println("Wynik dodawania ułamków to:" + " " + wynikLicznika + " " + wynikMianownika);
        }


    }

    void mnozenie(Ulamek obj2) {
        int wynikLicznika, wynikMianownika;
        wynikLicznika = this.licznik * obj2.licznik;
        wynikMianownika = this.mianownik * obj2.mianownik;
        System.out.println("Wynik mnożenia ułamków to:" + " " + wynikLicznika + " " + wynikMianownika);

    }

    double rozDziesietne() {
        double wynik;
        double nowyMianownik = (double) mianownik;
        wynik = licznik / nowyMianownik;

        return wynik;


    }

    void odwroc() {

        int odwLicznik, odwMianownik;
        odwLicznik = mianownik;
        odwMianownik = licznik;
        System.out.println("Odwrotnosc ulamka to:" + " " + odwLicznik + " " + odwMianownik);


    }

    int nwd() {

        while (licznik != mianownik) {
            if (licznik > mianownik) {

                licznik -= mianownik;

            } else {

                mianownik -= licznik;

            }
        }
        return licznik;
    }


    void skroc() {
        int wynikLicznika, wynikMianownika;
        wynikLicznika = licznik / nwd();
        wynikMianownika = mianownik / nwd();
        if(wynikMianownika == 1){
            System.out.println("Ulamek po skruceniu ma postac " + " " + wynikLicznika);


        }else {
            System.out.println("Ulamek po skruceniu ma postac " + " " + wynikLicznika + " " + wynikMianownika);
        }
    }

}