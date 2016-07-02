package main;

import java.util.ArrayList;
import java.util.List;

import interfaces.Iterator;
import models.Pizza;

public class Client {
	public static void main(String[] args){
		PizzaFactory factory = new PizzaFactory();
		List<Pizza> pizzas = new ArrayList<>();
		pizzas.add(factory.create("Mozarella", ""));
		pizzas.add(factory.create("Pepperoni", ""));
		pizzas.add(factory.create("Mozarella", "Thick crust"));
		pizzas.add(factory.create("Pepperoni", "Thick crust"));
		pizzas.add(factory.create("Hamburger", ""));
		Iterator<Pizza> iterator = new IOptionIterator(pizzas);
		
		boolean done = false;
		
		while(!done){
			RecieptPrinter visitor = new RecieptPrinter();
			String result = iterator.next().visit(visitor);
			if(!result.equals("Not a pizza")){
				System.out.println(result);
			}
		}
	}
	
}
