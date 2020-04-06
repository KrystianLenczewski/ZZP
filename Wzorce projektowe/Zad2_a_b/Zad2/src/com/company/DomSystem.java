package com.company;

public class DomSystem implements SwiatloInterface,DrzwiInterface,OgrzewanieInterface {


    @Override
    public Boolean sterowanieSwiatlem(String czynnosc) {

        if(czynnosc=="wlacz")return true;
        else return false;
    }

    @Override
    public Boolean sterowanieDrzwiami(String s) {
        if(s.equalsIgnoreCase("otworz"))return true;
        else return false;
    }

    @Override
    public Boolean dostepDoDrzwi(String s) {
        if(s.equalsIgnoreCase("odblokuj"))return true;
        else return false;
    }

    @Override
    public Boolean sterowanieOgrzewaniem(String czynnosc) {
        if(czynnosc.equalsIgnoreCase("wlacz"))return true;
        else return false;

    }

    @Override
    public int ustawStalaTemperature(int temperatura) {
        return temperatura;
    }
}
