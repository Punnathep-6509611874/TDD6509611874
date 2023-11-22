package core;

import java.util.ArrayList;


public class Stack implements IStack {
	private ArrayList<Object> elm;
	private int size;
	private boolean check;
	
	public Stack() {
		size = 0;
		elm = new ArrayList<>();
		check = true;
	}
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpt() {
		if(size == 0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public void pushElement(Object newElm) {
		// TODO Auto-generated method stub
			elm.add(newElm);
			size++;
	}

	@Override
	public Object top() {
		// TODO Auto-generated method stub
		if(size == 0) {
			return null;
		}else {
			return elm.get(size - 1);
		}
	}
	
	public boolean typeCheck(Object a) {
		if(a.getClass() != elm.get(0).getClass() && size >= 2) {
			return false;
		}else {
			return true;
		}
	}
	
	public String message() {
		if(check == true) {
			return "";
		}else {
			return "All elements in the stack must be of the same type.";
		}
	}

}
