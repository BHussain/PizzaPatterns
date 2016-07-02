package main;

import models.Hamburger;
import models.Pizza;

public class HamburgerPizzaAdapter extends Pizza{
	private Hamburger burger;
	
	public HamburgerPizzaAdapter(Hamburger hamburger){
		burger = hamburger;
	}
	
	@Override
	public String getReciept(){
		return burger.getReciept();
	}
}
