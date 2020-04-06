package com.company;

public class DomSerwis extends OswietlenieDecorator {
    public DomSerwis(Oswietlenie oswietlenieDecorator) {
        super(oswietlenieDecorator);
    }
    @Override
    public void zarzadzanieOswietleniem()
    {
        oswietlenieDecorator.zarzadzanieOswietleniem();
    }
}
