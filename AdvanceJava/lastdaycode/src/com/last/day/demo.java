package com.last.day;

import java.util.Iterator;
import java.util.*;

class Stack {
	int cap = 5;
	int top = -1;
	int stack[] = new int[cap];

	// isEmpty()
	// isFull()
	// size()
	// fundamental fun
	int size() {
		return cap;
	}

	boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	boolean isFull() {
		if (top == size()-1) {
			return true;
		} else {
			return false;
		}
	}

	void push(int data) {
		if (isFull()) {
			System.out.println("stack is Overflow");
		} else {
			top = ++top;
			stack[top] = data;
			System.out.println("pushed succusfully...");
		}
	}

	void pop() {
		if (isEmpty()) {
			System.out.println("stack is underflow");
		} else {
			int pop = stack[top--];
			System.out.println("pop element is " + pop);
		}
	}

	void Displaystack() {
		for (int i = top; i >= 0; i--) {
			System.out.println(" | " + stack[i] + " | ");
		}
	}
	// LIFO
	// FILO
	// Push()
	// PoP()
	// Peek()
	// traverse()or //search()
	// display();

	public void peek() {

		if (isEmpty()) {
			System.out.println("boss no element in stack");
		} else {
			System.out.println("peek element is " + stack[top]);
		}

	}

}

public class demo {
	public static void main(String[] args) {
		Stack s = new Stack();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("enter your choice");
			System.out.println("1.push\n2.pop\n3.peek\n4.display\n5.exite");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("enter data into push");
				int data = sc.nextInt();
				s.push(data);
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.peek();
				break;
			case 4:
				s.Displaystack();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("wrong choice..:-)");

			}
		}
	}
}
