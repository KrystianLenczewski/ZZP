package com.company;

import java.util.Scanner;

public class Main {

    private DomFacade domFacade=new DomFacade();
    private static Main dom=new Main();

    public static void main(String[] args) {
        dom.pokazMenu();

}

        void pokazMenu() {
            System.out.println("Witaj w serwisie domu");
            System.out.println("--------MENU-----------");
            System.out.println("1.Sterowanie swiatlem");
            System.out.println("2.Sterowanie drzwiami");
            System.out.println("3.Sterowanie ogrzewaniem");
            System.out.println("4.Koniec");

            System.out.println("Wybierz:");
            Scanner scaner = new Scanner(System.in);
            int wybor;
            do{
                 wybor = scaner.nextInt();

                switch (wybor) {

                    case 1:
                        dom.pokazStanOswietlenia("wlacz");
                        break;
                    case 2:
                        dom.pokazStanDrzwi("otworz", "odblokuj");
                        break;
                    case 3:
                        dom.pokazStanOgrzewania("wlacz", 22);
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        dom.pokazMenu();

                }
            }while(wybor!=0);

    }



    void pokazStanOswietlenia(String pom)
    {
        System.out.println(domFacade.sprawdzOswietlenie(pom));
    }
    void pokazStanDrzwi(String otworzZamknij,String zablokujOdblokuj)
    {
        System.out.println(domFacade.sprawdzDrzwi(otworzZamknij,zablokujOdblokuj));
    }
    void pokazStanOgrzewania(String ogrzewanie,int temp)
    {
        domFacade.sprawdzOgrzewanie(ogrzewanie,temp);

    }
}
