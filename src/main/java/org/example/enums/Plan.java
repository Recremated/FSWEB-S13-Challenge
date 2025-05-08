package org.example.enums;

public enum Plan {
    BASIC("Basic",300),
    STANDARD("Standard",600),
    PREMIUM("Premium", 900),
    GOLD("Gold", 1800);

    private final String name;
    private final int price;

    Plan(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return name + " plan's monthly price is " + price + '₺';
    }

}
