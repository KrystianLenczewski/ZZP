package com.company;

public class Kuchnia implements KuchniaObserwator {


    private String nazwa;
    public Kuchnia(String nazwa)
    {

        this.nazwa=nazwa;
    }
    @Override
    public void stanZamowienia(){
        System.out.println("Nazwa:"+nazwa );
    }

}
