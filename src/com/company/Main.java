package com.company;
import java.math.*;

import static java.lang.Math.max;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args)
    {
        Punkt obj1;
        obj1=new Punkt(3,-4);
        System.out.println("Punkt: " + obj1);

        Prostokat obj2;
        obj2=new Prostokat(3,4,obj1);
        System.out.println("Prostokat: " + obj2);

        Punkt obj3;
        obj3 = new Punkt(-2 , -4);
        System.out.println("Srodek okregu: " + obj3);

        Okrag obj4;
        obj4 = new Okrag(5,obj3);
        System.out.println("Okrag: " + obj4);

        Okrag obj5;
        obj5 = new Okrag(4, obj1);
        System.out.println("Okrag: " + obj5);

        Prostokat obj6;
        obj6 = new Prostokat(2,5,obj3);
        System.out.println("Prostokat: " + obj3);

        double poleProstokata = obj2.poleProstokata();
        System.out.println("Pole prostkata: " + poleProstokata);

        double obwodProstkata = obj2.obwodProstokata();
        System.out.println("Obwod prostkata: " + obwodProstkata);

        double poleOkregu = obj4.poleOkregu();
        System.out.println("Pole okregu: " + poleOkregu);

        double obwodOkregu = obj4.obwodOkregu();
        System.out.println("Obwod okregu: " + obwodOkregu);

        //void przesunPunkt = obj3.przesun(3,5);
        //System.out.println("Przesun: " + przesunPunkt);

        boolean zawieraProstokat = obj2.zawiera(obj3);
        System.out.println("Test " + zawieraProstokat);

        boolean zawieraOkrag = obj4.zawiera(obj1);
        System.out.println("Test " + zawieraOkrag);

        boolean przecina = obj4.przecina(obj5);
        System.out.println("Test: " + przecina);





    }
}


class Prostokat
{

    double dlugosc;
    double szerokosc;
    Punkt wierzcholekProstkata;

    Prostokat(double dlugosc,double szerokosc)
    {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.wierzcholekProstkata = new Punkt(0,0);
    }

    Prostokat(double dlugosc, double szerokosc, Punkt wierzcholekProstkata)
    {

        this.dlugosc = dlugosc;
        this.szerokosc = dlugosc;
        this.wierzcholekProstkata = wierzcholekProstkata;

    }

    double poleProstokata()
    {

        return dlugosc * szerokosc;

    }


    double obwodProstokata()
    {

        return 2 * dlugosc + 2 * szerokosc;

    }

    public String toString()
    {

        return "[dl: "+dlugosc+", sz: "+szerokosc+"]" + wierzcholekProstkata.toString();

    }

    void przesun (double dx, double dy)
    {

        this.wierzcholekProstkata.przesun(dx + wierzcholekProstkata.punktX, dy + wierzcholekProstkata.punktY);

    }

    boolean zawiera(Punkt obj1)
    {
        return (this.wierzcholekProstkata.punktX <= obj1.punktX  && this.wierzcholekProstkata.punktX >= obj1.punktX) &&
                (this.wierzcholekProstkata.punktY <= obj1.punktY && this.wierzcholekProstkata.punktY >= obj1.punktY);


    }

    //boolean przecina(Prostokat obj6)
    //{
   // }


}

class Punkt
{
    double punktX;
    double punktY;

    Punkt(double punktX, double punktY)
    {

        this.punktX = punktX;
        this.punktY = punktY;

    }

    public String toString()
    {

        return "[x: "+punktX+", y: "+punktY+"]";

    }

    void przesun(double dx, double dy)
    {

        this.punktX = dx ;
        this.punktY = dy ;

    }





}

class Okrag
{
    double promien;
    Punkt srodekOkregu;



    Okrag(double promien, Punkt srodekOkregu)
    {

        this.promien = promien;
        this.srodekOkregu = srodekOkregu;

    }

    double poleOkregu()
    {

        return promien * promien * Math.PI;

    }

    double obwodOkregu()
    {

        return 2 * promien * Math.PI;

    }

    public String toString()
    {

        return "[promien: "+promien+"]" + srodekOkregu.toString();

    }

    boolean zawiera(Punkt obj1)
    {

        return (this.srodekOkregu.punktX - obj1.punktX) * (this.srodekOkregu.punktX - obj1.punktX) + (this.srodekOkregu.punktY - obj1.punktY) +
                (this.srodekOkregu.punktY - obj1.punktY) <= promien * promien;

    }



    boolean przecina(Okrag obj5)
    {
        double odlegloscX = Math.pow(this.srodekOkregu.punktX - obj5.srodekOkregu.punktX,2);
        double odlegloscY = Math.pow(this.srodekOkregu.punktY - obj5.srodekOkregu.punktY,2);
        double pierwiastek = sqrt(odlegloscX + odlegloscY);

        return Math.abs(this.promien - obj5.promien) < Math.abs(pierwiastek) && Math.abs(pierwiastek) < this.promien + obj5.promien;

    }
}
