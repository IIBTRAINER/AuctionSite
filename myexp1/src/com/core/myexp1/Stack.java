package com.core.myexp1;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Stack<T extends Object> {
	private int capacity;
	private int top;
	private T[] arr;
	@SuppressWarnings("unchecked")
	Stack(int size)
	{
		this.capacity = size;
		this.arr = (T[]) new Object[capacity];
		this.top = -1;
	}
	
	
	
	public void push(T entry) 
	{
	
		this.arr[++top] = entry;
	}
	
	public T pop() 
	{
	
		
	  return arr[top--];
	}
	
	public T peek() 
	{
		System.out.println(" Removing :" + top );
	  if (!isEmpty())
		  return this.arr[top];
	  else
		  System.exit(1);
	return null;
	
		  
	}
	
	public int size()
	{
		return top + 1;
	}
	
	public Boolean isFull()
	{
		return top == capacity-1;
	}
	
	public Boolean isEmpty()
	{
		return top == -1;
	}
	
	public T retrieve(int index)
	{
		return this.arr[index];
	}

	
}
