package main;

import java.util.List;

import interfaces.IOption;
import interfaces.Iterator;
import models.None;
import models.Pizza;
import models.Some;

public class IOptionIterator implements Iterator<Pizza>{
	private List<Pizza> pizzas;
	private Integer index;
	
	public IOptionIterator(List<Pizza> pizzas){
		this.pizzas = pizzas;
		index = 0;
	}
	
	@Override
	public IOption<Pizza> next() {
		// TODO Auto-generated method stub
		if(index<pizzas.size()){
			IOption<Pizza> result = new Some<>(pizzas.get(index));
			index++;
			return result;
		}else {
			return new None<Pizza>();
		}
	}
	
}
