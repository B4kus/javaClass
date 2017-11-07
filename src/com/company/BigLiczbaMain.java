package com.company;

public class BigLiczbaMain {

    public static void main(String[] args) {
    BigLiczba obj;

    obj = new BigLiczba(342242423);
    obj.testPodzielnosci(4);
    obj.czyLiczbaJestPierwsza();


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

    void czyLiczbaJestPierwsza(){
        if (this.liczba < 2 ){
            System.out.println("Liczba nie jest pierwsza");


        }else{
            for(int i = 2 ; i * i <= this.liczba;){
                if(this.liczba % i == 0){
                    System.out.println("False");
                    return;
                }
                System.out.println("True");
                return;
            }
        }

    }

}
