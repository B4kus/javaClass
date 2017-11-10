package com.company;

import java.awt.Rectangle;
import java.io.*;
import java.util.Objects;

public class ProgramBiblioteki {
    static double kursDolara = 3.63;
    static double kursEuro = 4.23;
    static double kursFunta = 4.77;

    public static void main(String[] args) throws IOException {

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


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wpisz Dolar aby przeliczyc dolary na zlotowki.");
        System.out.println("Wpisz Euro aby przeliczyc euro na zlotowki.");
        System.out.println("Wpisz Funt aby przeliczyc funty na zlotowki.");
        System.out.print("Podaj rodzaj waluty: ");

        try {
            String str1 = br.readLine();

            if (Objects.equals(str1, "Dolar")) {


                BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

                try {

                    System.out.print("USD: ");
                    String str = br2.readLine();
                    double x = Double.parseDouble(str);
                    System.out.println("PLN: " + x * kursDolara);
                } catch (IOException e1) {
                    System.out.println("wyjatek operacji wejscia/wyjscia");
                } catch (NumberFormatException e2) {
                    System.out.println("nieprawidlowy format liczby");
                }

            } else if (Objects.equals(str1, "Euro")) {
                BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

                try {

                    System.out.print("EUR: ");
                    String str = br2.readLine();
                    double x = Double.parseDouble(str);
                    System.out.println("PLN: " + x * kursEuro);
                } catch (IOException e1) {
                    System.out.println("wyjatek operacji wejscia/wyjscia");
                } catch (NumberFormatException e2) {
                    System.out.println("nieprawidlowy format liczby");
                }


            } else if (Objects.equals(str1, "Funt")) {
                BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

                try {

                    System.out.print("GPB: ");
                    String str = br2.readLine();
                    double x = Double.parseDouble(str);
                    System.out.println("PLN: " + x * kursFunta);
                } catch (IOException e1) {
                    System.out.println("wyjatek operacji wejscia/wyjscia");
                } catch (NumberFormatException e2) {
                    System.out.println("nieprawidlowy format liczby");
                }
            }
        }catch (IOException e1) {
            System.out.println("wyjatek operacji wejscia/wyjscia");
        } catch (NumberFormatException e2) {
            System.out.println("nieprawidlowy format danych");
        }
    }
}
