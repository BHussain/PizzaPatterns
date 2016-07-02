package models;

import java.util.ArrayList;

public class PepperoniPizza extends Pizza{
	public PepperoniPizza(){
		price = 4.0;
		type = "Pepperoni";
		crust = "thin";
		toppings = new ArrayList<>();
		toppings.add("pepperoni");
	}
}
