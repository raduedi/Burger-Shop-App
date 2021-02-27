package com.company;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "Beef", "white", 15.50);
        super.addHamburgerAddition1("Chips" , 2.50);
        super.addHamburgerAddition2("Drink" , 1.75);
    }

    // By override those methods we prevent the original method being called
    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Cannot add additional items on the burger");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Cannot add additional items on the burger");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Cannot add additional items on the burger");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Cannot add additional items on the burger");
    }
}
