package com.company;

public class WektorMain {

    public static void main(String[] args) {

        Wektor obj, obj2;

        obj = new Wektor(3,5,7);
        obj2 = new Wektor(1,6,2);

        obj.dodawanie(obj2);
        obj.odejmowanie(obj2);


    }

}

class Wektor{
    int wektorX;
    int wektorY;
    int wektorZ;

    Wektor(int wektorX, int wektorY, int wektorZ){

        this.wektorX = wektorX;
        this.wektorY = wektorY;
        this.wektorZ = wektorZ;


    }
    void dodawanie(Wektor obj2){
        int wynikX , wynikY, wynikZ;

        wynikX = this.wektorX + obj2.wektorX;
        wynikY = this.wektorY + obj2.wektorY;
        wynikZ = this.wektorZ + obj2.wektorZ;
        System.out.println("Nowe wspolrzedne wektora to: [" + wynikX + ";" + wynikY + ";"+ wynikZ + "]" );


    }

    void odejmowanie(Wektor obj2){
        int wynikX , wynikY, wynikZ;
        wynikX = this.wektorX - obj2.wektorX;
        wynikY = this.wektorY - obj2.wektorY;
        wynikZ = this.wektorZ - obj2.wektorZ;
        System.out.println("Nowe wspolrzedne wektora to: [" + wynikX + ";" + wynikY + ";"+ wynikZ + "]" );

    }

}