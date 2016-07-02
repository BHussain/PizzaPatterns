package models;

import java.util.List;

public abstract class Pizza {
	protected Double price;
	protected String type;
	protected String crust;
	protected List<String> toppings;
	
	public Double getPrice(){
		return price;
	}
	
	public void setPrice(Double price){
		this.price = price;
	}
	
	public String getType(){
		return type;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getCrust(){
		return crust;
	}
	
	public void setCrust(String crust){
		this.crust = crust;
	}
	
	public List<String> getToppings(){
		return toppings;
	}
	
	public void setToppings(List<String> toppings){
		this.toppings = toppings;
	}
	
	public void addTopping(String topping){
		toppings.add(topping);
	}
	
	public void removeTopping(String topping){
		toppings.remove(topping);
	}
	
	public String getReciept(){
		String output = "This is a  "+ type+" pizza with a " + crust +" crust."+"\n"
						+"The toppings are: "+"\n";
		if(toppings!=null && !toppings.isEmpty()){
			for(String topping:toppings){
				output+= topping + "\n";
			}
		}
		
		output+= "Total price: " + price;
		return output;
	}
}
