package com.company;

import java.awt.Rectangle;

public class ProgramBiblioteki {

    public static void main(String[] args){

        Rectangle obj = new Rectangle(0,0,4,3);
        Rectangle obj2 = new Rectangle(1,1,4,3);

        Rectangle obj3 = new Rectangle(1,1,4,5);
        Rectangle obj4 = new Rectangle(2,0,2,3);

        Rectangle obj5 = new Rectangle(-3,0,6,3);

        Rectangle obj6 = new Rectangle(1,1,4,5);
        Rectangle obj7 = new Rectangle(4,-3,4,3);


        boolean czescWspolna = obj.intersects(obj2);
        System.out.println("Czesc wspolna " + czescWspolna);

        boolean zawiera = obj3.contains(obj4);
        System.out.println("Czy prostkat zawiera sie w prostkacie: " + zawiera);

        boolean zawieraPunkt = obj5.contains(2, -1);
        System.out.println("Czy punkt zawiera sie w prostkacie: " + zawieraPunkt);

        boolean zawieraDwa = obj6.intersects(obj7);
        System.out.println("Czy prostkat zawiera sie w prostkacie: " + zawieraDwa);


    }
}
