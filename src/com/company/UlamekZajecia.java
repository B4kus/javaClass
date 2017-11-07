package com.company;

public class UlamekZajecia {

    public static void main(String[] args)
    {
        Ulamek obj, obj2, obj3;

        obj = new Ulamek(6,8);
        obj2 = new Ulamek(3,7);
        obj.dodawanie(obj2);
        obj.odejmowanie(obj2);






    }
}

class Ulamek
{
    int licznik;
    int mianownik;


    Ulamek(int licznik, int mianownik)
    {
        this.licznik = licznik;
        this.mianownik = mianownik;


    }
    void dodawanie(Ulamek obj2){
        int wynikLicznik, wynikMianownik;
        if (this.mianownik == obj2.mianownik){
           wynikLicznik = this.licznik + obj2.licznik;
           wynikMianownik = this.mianownik;
           System.out.println("Wynik dodawania ułamków to:" + " " +  wynikLicznik + " " + wynikMianownik);
        }else{
            wynikLicznik = (this.licznik * obj2.mianownik) + (this.mianownik * obj2.licznik);
            wynikMianownik = this.mianownik * obj2.mianownik;
            System.out.println("Wynik dodawania ułamków to:" + " " + wynikLicznik + " " + wynikMianownik);
        }
    }
    void odejmowanie(Ulamek obj2){
        int wynikLicznika, wynikMianownika;
        if (this.mianownik == obj2.mianownik){
            wynikLicznika = this.licznik - obj2.licznik;
            wynikMianownika = this.mianownik;
            System.out.println("Wynik dodawania ułamków to:" + " " +  wynikLicznika + " " + wynikMianownika);
        }else{
            wynikLicznika = (this.licznik * obj2.mianownik) - (this.mianownik * obj2.licznik);
            wynikMianownika = this.mianownik * obj2.mianownik;
            System.out.println("Wynik dodawania ułamków to:" + " " + wynikLicznika + " " + wynikMianownika);
        }


    }






}
