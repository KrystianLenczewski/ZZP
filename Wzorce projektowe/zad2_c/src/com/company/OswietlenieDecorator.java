package com.company;

public abstract class OswietlenieDecorator implements Oswietlenie{

    protected Oswietlenie oswietlenieDecorator;
    public OswietlenieDecorator(Oswietlenie oswietlenieDecorator)
    {
        this.oswietlenieDecorator=oswietlenieDecorator;
    }
    public void zarzadzanieOswietleniem()
    {
        oswietlenieDecorator.zarzadzanieOswietleniem();
    }
}
