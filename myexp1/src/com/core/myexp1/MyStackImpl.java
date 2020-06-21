package com.core.myexp1;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MyStackImpl<T extends Object> {
	private int stackSize;
	private int first;
	private T[] stackArr;
	@SuppressWarnings("unchecked")
	MyStackImpl(int size)
	{
		this.stackSize = size;
		this.stackArr = (T[]) new Object[stackSize];
		this.first = -1;
	}
	
	
	
	public void push(T entry) 
	{
	
		this.stackArr[++first] = entry;
	}
	
	public T pop() 
	{
	  T entry = null;
		try {
			entry = this.stackArr[first--];
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entry;
	}
	
	public T peek()
	{
		T entry = null;
		try {
			entry = this.stackArr[first];
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return entry;
	}
	
	public T get(int index) 
	{
	  T entry = null;
	  
	  System.out.println("Length :" + stackArr.length);
		
	  if (stackArr.length - 1 > index)
	  {
	  
	  try {
			entry = this.stackArr[index];
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	  return entry;
	}
	
	
}
