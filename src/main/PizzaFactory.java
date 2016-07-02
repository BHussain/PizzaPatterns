package main;

import models.Hamburger;
import models.MozarellaPizza;
import models.PepperoniPizza;
import models.Pizza;

public class PizzaFactory {
	public Pizza create(String type, String extra){
		switch(type){
		case "Mozarella":
			switch(extra){
			case "Thick crust":
				return new ThickCrustDecorator(new MozarellaPizza());
			default: return new MozarellaPizza();
			}
		case "Pepperoni":
			switch(extra){
			case "Thick crust":
				return new ThickCrustDecorator(new PepperoniPizza());
			default: return new PepperoniPizza();
			}
		case "Hamburger":
			return new HamburgerPizzaAdapter(new Hamburger());
		default:
			return null;
		}
	}
}
