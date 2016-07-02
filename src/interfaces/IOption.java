package interfaces;

public interface IOption<T> {
	public <U> U visit(IOptionVisitor<T,U> visitor);
}
