package main;

import interfaces.IOptionVisitor;
import models.Pizza;

public class RecieptPrinter implements IOptionVisitor<Pizza, String>{

	@Override
	public String onSome(Pizza value) {
		// TODO Auto-generated method stub
		return value.getReciept();
	}

	@Override
	public String onNone() {
		// TODO Auto-generated method stub
		return "Not a pizza";
	}

}
