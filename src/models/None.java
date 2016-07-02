package models;

import interfaces.IOption;
import interfaces.IOptionVisitor;

public class None<T> implements IOption<T> {
	public None(){}

	@Override
	public <U> U visit(IOptionVisitor<T, U> visitor) {
		// TODO Auto-generated method stub
		return visitor.onNone();
	}
}
