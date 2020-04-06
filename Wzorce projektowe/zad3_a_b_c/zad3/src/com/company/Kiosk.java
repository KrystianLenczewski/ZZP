package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Kiosk {
    private LinkedList<Integer>zamowienie=new LinkedList<Integer>();

    ArrayList<KuchniaObserwator>kuchniaList=new ArrayList<KuchniaObserwator>();


    private class PolecenieZamow implements Polecenie
    {
        private int nrZamowienia;
        public PolecenieZamow(int l){nrZamowienia=l;}


        @Override
        public void zamow() {
        zamowienie.add(nrZamowienia);
        }
    }

    public void dodajObserwatora(KuchniaObserwator kuchnia)
    {
        kuchniaList.add(kuchnia);
    }
    public void usunObserweratora(KuchniaObserwator kuchnia)
    {
        kuchniaList.remove(kuchnia);
    }
    public void stanZamowienia()
    {

    }

}
