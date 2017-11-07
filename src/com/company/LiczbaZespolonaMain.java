package com.company;

public class LiczbaZespolonaMain {


    public static void main(String[] args) {

        LiczbaZespolona obj, obj2;

        obj = new LiczbaZespolona(2,5);
        obj2 = new LiczbaZespolona(5,1);
        obj.dodawanie(obj2);
        obj.odejmownaie(obj2);

    }
}


class LiczbaZespolona{
    int liczbaRzeczy;
    int liczbaUro;


    LiczbaZespolona(int liczbaRzeczy, int liczbaUro){
        this.liczbaRzeczy = liczbaRzeczy;
        this.liczbaUro = liczbaUro;


    }
/*
    LiczbaZespolona dodawanie(LiczbaZespolona obj2){
        int wynikPierwszy, wynikDrugi;
        LiczbaZespolona wynik = null;
        wynik.liczbaRzeczy = this.liczbaRzeczy + obj2.liczbaRzeczy;
        wynik.liczbaUro = this.liczbaUro + obj2.liczbaUro;

        return wynik;



    }

*/
    void dodawanie(LiczbaZespolona obj2){
        int wynikRzecz, wynikUro;
        wynikRzecz = this.liczbaRzeczy + obj2.liczbaRzeczy;
        wynikUro = this.liczbaUro + obj2.liczbaUro;
        System.out.println("Nowa para liczb to: " + wynikRzecz + " " + wynikUro );

    }
    void odejmownaie(LiczbaZespolona obj2){
        int wynikRecz, wynikUro;
        wynikRecz = this.liczbaRzeczy - obj2.liczbaRzeczy;
        wynikUro = this.liczbaUro = obj2.liczbaUro;
        System.out.println("Nowa para liczb to: " + wynikRecz + " " + wynikUro );

    }


}