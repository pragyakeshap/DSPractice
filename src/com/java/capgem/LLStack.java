package com.java.capgem;

import java.util.LinkedList;

public class LLStack {
	
	
	
	public void push(LinkedList<String> myStack, String str) {
		System.out.println("Adding : "+str);
		myStack.add(str);
	}
	
	public String peek(LinkedList<String> myStack) {
		int size  = myStack.size();
		if(size > 0) {
			String top = myStack.get(size -1);
			System.out.println("Top element is  : "+top);			
			return top;
		}else {
			System.out.println("Stack is empty");
			return "";
		}
	}
	
	public String pop(LinkedList<String> myStack) {
		int size  = myStack.size();
		if(size > 0) {
			String e = myStack.get(size -1);
			myStack.remove(size-1);			
			System.out.println("Removing : "+e);
			return e;
		}else {
			System.out.println("Stack is empty");
			return "";
		}
	}

	public static void main(String[] args) {
		LLStack st = new LLStack();
		LinkedList<String> myStack = new LinkedList<>();
		
		// LinkedList itself has push , pop and peek methods which behave same as that of a Stack
		
		/*myStack.push("Pragya");
		myStack.push("Test");
		myStack.push("LL");
		myStack.peek();
		myStack.push("Stack");
		myStack.push("Test");
		myStack.pop();
		myStack.peek();
		myStack.pop();
		myStack.peek();
		myStack.pop();
		myStack.peek();
		myStack.pop();
		myStack.peek();
		myStack.push("Keshap");
		myStack.push("Java");
		myStack.pop();
		myStack.peek();*/
		
		
		st.push(myStack,"Pragya");
		st.push(myStack,"Test");
		st.push(myStack,"LL");
		st.peek(myStack);
		st.push(myStack,"Stack");
		st.push(myStack,"Test");
		st.pop(myStack);
		st.peek(myStack);
		st.pop(myStack);
		st.peek(myStack);
		st.pop(myStack);
		st.peek(myStack);
		st.pop(myStack);
		st.peek(myStack);
		st.push(myStack,"Keshap");
		st.push(myStack,"Java");
		st.pop(myStack);
		st.peek(myStack);
	}
	
}
