package com.company;

public class PromocjaZamowieniPowyzej30 implements Strategia {
    @Override
    public void obliczaniePromocji(double cena) {
        System.out.println("Zamowienie powyzej 30 zl -cena z promocja");
    }
}
