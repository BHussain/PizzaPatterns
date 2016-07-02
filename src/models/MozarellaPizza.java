package models;

import java.util.ArrayList;

public class MozarellaPizza  extends Pizza{
	public MozarellaPizza(){
		price = 3.0;
		crust = "thin";
		type = "mozarella";
		toppings = new ArrayList<>();
		toppings.add("Cheese");
	}
}
