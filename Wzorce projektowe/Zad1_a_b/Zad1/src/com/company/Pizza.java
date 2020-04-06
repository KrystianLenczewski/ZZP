package com.company;

import java.util.List;

public class Pizza {
    private Integer id;
    private String rozmiar;
    private String[] dodatki;
    private String sos;
    private String umieszczenieSosu;

    public Integer getId() {
        return id;
    }

    public String getRozmiar() {
        return rozmiar;
    }

    public String[] getDodatki() {
        return dodatki;
    }

    public String getSos() {
        return sos;
    }

    public String getUmieszczenieSosu() {
        return umieszczenieSosu;
    }


    public static class Builder {

        private Integer id;
        private String rozmiar;
        private String[] dodatki;
        private String sos;
        private String umieszczenieSosu;

        public Builder id(Integer id) {
        this.id=id;
        return this;
        }
        public Builder rozmiar(String rozmiar) {
            this.rozmiar=rozmiar;
            return this;
        }
        public Builder dodatki(String[] dodatki) {
            this.dodatki=dodatki;
            return this;
        }
        public Builder sos(String sos) {
            this.sos=sos;
            return this;
        }
        public Builder umieszczenieSosu(String umieszczenieSosu) {
            this.umieszczenieSosu=umieszczenieSosu;
            return this;
        }
        public Pizza build(){
            return new Pizza(this);
        }




    }

    private Pizza(Builder builder)
    {
        this.id=builder.id;
        this.rozmiar=builder.rozmiar;
        this.dodatki=builder.dodatki;
        this.sos=builder.sos;
        this.umieszczenieSosu=builder.umieszczenieSosu;

    }




}

