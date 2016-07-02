package models;

public class Hamburger {
	private Double price;
	private String meat;
	
	public Hamburger(){
		price = 5.0;
		meat = "Beef";
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getMeat() {
		return meat;
	}
	
	public void setMeat(String meat) {
		this.meat = meat;
	}
	
	public String getReciept(){
		return "This is a hamburger. The meat is: "+meat+"\n"
				+ "The price is: "+ price;
	}
}
