package core;

public interface IStack {
	boolean isFull();
	boolean isEmpt();
	int getSize();
	void pushElement(Object elm);
	Object top();
	boolean typeCheck(Object a);
	String message();
}
