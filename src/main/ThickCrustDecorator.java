package main;

import models.Pizza;

public class ThickCrustDecorator extends PizzaDecorator {
	public ThickCrustDecorator(Pizza pizza){
		this.pizza = pizza;
	}
	
	@Override
	public String getReciept(){
		pizza.setCrust("Thick");
		pizza.setPrice(pizza.getPrice()+1.0);
		return pizza.getReciept();
	}
}
