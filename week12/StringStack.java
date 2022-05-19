package week12;

import java.util.Iterator;

public class StringStack implements StackInterface{
	private String[] element;
	private int top;
	
	public StringStack(int capacity) {
		element = new String[capacity];
		top = -1;
	}
	
	@Override
	public int length() {
		return top;
	}

	@Override
	public String pop() {
		if (top == -1) {
			System.out.println("스택이 비어있거든요!!");
			return null;
		}
		return element[top--];
	}

	@Override
	public boolean push(String ob) {
		if(top == element.length - 1)
		{
			System.out.println("스택이 Full이 거든요");
			return false;
		}
		else {
			element[++top] = ob;
			return true;
		}
		
	}
	public void print() {
		for (int i = top; i >= 0; i--) {
			System.out.println(element[i]);
		}
	}
}
