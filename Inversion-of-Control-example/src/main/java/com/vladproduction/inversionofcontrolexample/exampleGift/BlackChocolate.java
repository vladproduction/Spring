package com.vladproduction.inversionofcontrolexample.exampleGift;

public class BlackChocolate implements Chocolate {
    private double cacao;
    private String name;
    private double price;

    public BlackChocolate(double cacao, String name, double price) {
        this.cacao = cacao;
        this.name = name;
        this.price = price;
    }

    public void setCacao(double cacao) {
        this.cacao = cacao;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price + 50;
    }

    @Override
    public double cacao() {
        return cacao;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String toString() {
        return "BlackChocolate{"
                + "cacao=" + cacao
                + ", name=" + name +
                ", price=" + price +
                '}';
    }
}
