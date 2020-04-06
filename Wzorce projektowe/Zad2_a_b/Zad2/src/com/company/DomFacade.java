package com.company;

public class DomFacade {

    private DomSystem dom;

    public DomFacade()
    {
        dom=new DomSystem();
    }
    public String sprawdzOswietlenie(String pom)
    {


        if(dom.sterowanieSwiatlem(pom))
        {
            return "Wlaczono oswietlenie";
        }
        else return "Wyłaczono oswietlenie";

    }
    public void sprawdzOgrzewanie(String ogrzewanie,int temp)
    {
        System.out.println(dom.ustawStalaTemperature(temp));
        if(dom.sterowanieOgrzewaniem(ogrzewanie))
        {
            System.out.println("Wlaczono ogrzewanie");
        }
        else
        {
            System.out.print("Wylaczono ogrzewanie");
        }
    }
    public String sprawdzDrzwi(String sterowanie,String dostep)
    {
        if(dom.sterowanieDrzwiami(sterowanie)&& dom.dostepDoDrzwi(dostep))
        {
            return "Odblokowano oraz otworzono drzwi";
        }
        else
        {
            return "Drzwi sa zablokowane i/lub zamkniete";
        }
    }
}
