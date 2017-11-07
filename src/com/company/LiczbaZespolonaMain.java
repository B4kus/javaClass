package com.company;

public class LiczbaZespolonaMain {


    public static void main(String[] args) {

        LiczbaZespolona obj, obj2;

        obj = new LiczbaZespolona(2,5);
        obj2 = new LiczbaZespolona(5,1);
        obj.dodawanie(obj2);
        obj.odejmownaie(obj2);
        obj.mnozenie(obj2);
        obj.dzielnie(obj2);

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
        System.out.println("Nowa para liczb to: " + wynikRzecz + " + " + wynikUro + "i");

    }
    void odejmownaie(LiczbaZespolona obj2){
        int wynikRecz, wynikUro;
        wynikRecz = this.liczbaRzeczy - obj2.liczbaRzeczy;
        wynikUro = this.liczbaUro = obj2.liczbaUro;
        System.out.println("Nowa para liczb to: " + wynikRecz + " - " + wynikUro + "i");

    }

    void mnozenie(LiczbaZespolona obj2){
        int wynikRzecz, wynikUro;
        wynikRzecz = this.liczbaRzeczy * obj2.liczbaRzeczy - this.liczbaUro * obj2.liczbaUro;
        wynikUro = this.liczbaRzeczy * obj2.liczbaUro + this.liczbaUro * obj2.liczbaRzeczy;
        System.out.println("Nowa para liczb to: " + wynikRzecz + " * " + wynikUro + "i" );



    }

    void dzielnie(LiczbaZespolona obj2){
        int wynikRzecz, wynikUro, wynikUlamka;
        if (obj2.liczbaRzeczy == 0  && obj2.liczbaUro == 0){
            System.out.println("Ups blad, nie dzielimy przez zero");
        }else{
           wynikRzecz = this.liczbaRzeczy * obj2.liczbaUro + this.liczbaUro * obj2.liczbaRzeczy;
           wynikUro = this.liczbaUro * obj2.liczbaRzeczy - this.liczbaRzeczy * obj2.liczbaUro;
           wynikUlamka = obj2.liczbaRzeczy * obj2.liczbaRzeczy + obj2.liczbaUro + obj2.liczbaUro;
           System.out.println("Wynik dzielenia: " + wynikRzecz + "/" + wynikUlamka + " + "+ wynikUro + "/" + wynikUlamka + "i");


        }
    }


}