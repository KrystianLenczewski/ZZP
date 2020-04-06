package com.company;

public class Main {

    public static void main(String[] args) {


        Oswietlenie oswietlenieBrama =new DomSerwis(new OswietlenieBramaWjazdowa());
        Oswietlenie oswietlenieKinoDomowe=new DomSerwis(new OswietlenieKinaDomowego());
        Oswietlenie oswietlenieOgrodowe=new DomSerwis(new OswietlenieOgrodowe());

        oswietlenieBrama.zarzadzanieOswietleniem();
        oswietlenieKinoDomowe.zarzadzanieOswietleniem();
        oswietlenieOgrodowe.zarzadzanieOswietleniem();
    }
}
