package com.company;

public class Main {

    public static void main(String[] args) {
	Hamburger hamburger = new Hamburger("Basic","beef","white",4.55);
	hamburger.addHamburgerAddition1("tomato",0.75);
	hamburger.addHamburgerAddition2("cheese" , 0.90);
	hamburger.addHamburgerAddition3("egg",0.90);
	hamburger.addHamburgerAddition4("bacon" , 1);
        System.out.println("Total burger is " + hamburger.itemizeHamburger() + "$ .");

		System.out.println("***************************");
        DeluxeBurger deluxeBurger = new DeluxeBurger();

        deluxeBurger.addHamburgerAddition1("tomato",0.40);
		deluxeBurger.itemizeHamburger();
    }
}
