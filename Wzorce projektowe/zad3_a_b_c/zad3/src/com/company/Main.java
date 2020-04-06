package com.company;

public class Main {

    public static void main(String[] args) {

        private Strategia strategia;

        public void cenaPromocji(double pom)
        {
            strategia.obliczaniePromocji(pom);
        }

        //Tworzenie obiektowe obserwujacych
        Kuchnia kuchnia1=new Kuchnia("kuchnia1");
        Kuchnia kuchnia2=new Kuchnia("kuchnia2");
        Kuchnia kuchnia3=new Kuchnia("kuchnia3");

        //obiekt obserwowany
        Kiosk kiosk=new Kiosk();

        //dodanie obiektow obserwowanych
        kiosk.dodajObserwatora(kuchnia1);
        kiosk.dodajObserwatora(kuchnia2);
        kiosk.dodajObserwatora(kuchnia3);

        kiosk.stanZamowienia();

        kiosk.usunObserweratora(kuchnia1);

        kiosk.stanZamowienia();

    }
}
