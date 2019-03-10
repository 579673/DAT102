package no.hvl.dat102.infixtopostfix;

import java.util.Scanner;

import no.hvl.dat102.kap3.stack.ArrayStack;
import no.hvl.dat102.kap3.stack.StackADT;

public class InfixToPostfix {
	private StackADT<String> stack = new ArrayStack<String>();
	private final static char ADD = '+';
	private final static char SUBTRACT = '-';
	private final static char MULTIPLY = '*';
	private final static char DIVIDE = '/';
	
	public String convert(String infix) {
		Scanner parser = new Scanner(infix);
		StringBuilder postfix = new StringBuilder();
		String current;
		while (parser.hasNext()) {
			current = parser.next();
			if (isOperator(current))
				if (!stack.isEmpty() && 
						(priorityOf(current) < priorityOf((String)stack.peek())))
					stack.push(current);
				else {
					postfix.append(stack.pop());
					stack.push(current);
				}
		}
		return "";
	}
	private int priorityOf(String c) {
		if (c.equals(ADD)||c.equals(SUBTRACT))
			return 2;
		return 1;
	}
	private boolean isOperator(String c) {
		return (c.equals(ADD) || c.equals(SUBTRACT) ||
				c.equals(MULTIPLY) || c.equals(DIVIDE));
	}
}
