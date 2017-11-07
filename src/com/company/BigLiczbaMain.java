package com.company;

public class BigLiczbaMain {

    public static void main(String[] args) {
    BigLiczba obj;

    obj = new BigLiczba(21312);
    obj.testPodzielnosci(4);


    }
}


class BigLiczba{

    int liczba;


    BigLiczba(int liczba){
        this.liczba = liczba;

    }

    void testPodzielnosci(int n){
        if(this.liczba % n == 0){
            System.out.println("Liczba jest podzeilna przez " + n);


        }else{
            System.out.println("Liczba nie jest podzielna przez " + n );

        }

    }




}
