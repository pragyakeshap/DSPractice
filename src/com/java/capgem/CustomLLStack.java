package com.java.capgem;

public class CustomLLStack {

	Node top;
	int size =0;
	
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	/*CustomLLStack() {
		top = new Node(0);
		size ++;
	}*/

	CustomLLStack(int data) {
		top = new Node(data);
		size ++;
	}

	public static void main(String[] args) {

		CustomLLStack s = new CustomLLStack(9);
		s.push(1);
		s.peek();
		s.pop();
		s.push(2);
		s.peek();
		s.push(3);
		s.push(4);
		s.peek();
		s.pop();
		s.push(5);
		s.peek();
		s.peek();
		s.push(6);
		s.pop();
		s.push(7);
		s.peek();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();

	}

	public void push(int d) {
		System.out.println("Adding : " + d);
		if (size == 0) {
			new CustomLLStack(d);
		} else {
			Node n = new Node(d);
			n.next = top;
			top = n;
			size++;
		}
	}

	public int pop() {
		
		if (size == 0) {
			System.out.println("No element to be popped");
			return -1;
		} else {
			int d = top.data;
			System.out.println("Popping : "+d);
			top = top.next;
			size--;
			return d;
		}
	}

	public int peek() {
		if (size == 0) {
			System.out.println("No element to be peeked");
			return -1;
		} else {
			int d = top.data;
			System.out.println("Peeked element : " + d);
			return d;
		}
	}

	/*public int size() {
		int size = 0;
		if (top == null) {
			return 0;
		} else {			
			while (top.next != null) {
				top = top.next;
				size++;
			}
		}
		return size;
	}*/
}
