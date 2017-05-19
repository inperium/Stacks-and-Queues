package controller;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import model.Customer;
import model.PapersToGrade;

public class StacksAndQueuesController {
	
	private Queue<Customer> customerQueue;
	private Stack<PapersToGrade> papersToGrade;
	
	public StacksAndQueuesController(){
		this.customerQueue = new LinkedList<Customer>();
		this.papersToGrade = new Stack<PapersToGrade>();
	}
	
	public void start(){
		
		//Tests the Queue
		testQueue();
		
		//Tests the Stack
		testStack();
	}
	
	private void testQueue(){
		this.customerQueue.add(new Customer("Adam", 91));
		System.out.println("The first costumer is " + customerQueue.peek().getName());
		
		this.customerQueue.add(new Customer("Dodge", 1));
		this.customerQueue.add(new Customer("Oiler", 20));
		
		System.out.println("The costumer removed was " + customerQueue.remove().getName());
		System.out.println("The costumer removed was " + customerQueue.remove().getName());
		System.out.println("The costumer removed was " + customerQueue.remove().getName());
		
		this.customerQueue.add(new Customer("Luke", 01));
		System.out.println("First person in the queue is " + customerQueue.peek().getName());
		System.out.println("The costumer removed was " + customerQueue.remove().getName());
		
		this.customerQueue.add(new Customer("Fable", 818));
		System.out.println("The costumer removed was " + customerQueue.remove().getName());
	}
	
	private void testStack(){
		papersToGrade.push(new PapersToGrade("Worksheet", 15));
		papersToGrade.push(new PapersToGrade("Test", 20));
		papersToGrade.push(new PapersToGrade("Quiz", 4));
		papersToGrade.push(new PapersToGrade("Homework", 46));
		
		System.out.println("The first item on the stack of papers to grade is " + papersToGrade.peek().getName());
		System.out.println("The item removed from the stack is " + papersToGrade.pop().getName());
	}
}
