package com.core.myexp1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class MyTest1 {
	
	public int createTest1() {
	
List<String> list = new ArrayList<>();
	list.add("K");
	list.add("D");
	list.set(1, "C");
	
	System.out.println("list values " + list.toString());
	
	Stack stack = new Stack(); 
	stack.push(1);
	stack.push("abc");
	stack.pop();
	System.out.println("stack values " + stack.toString());
	
	return 12;
	

	}
	
	public String createTest2() 
	{
		
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("key1", "fizer");
		
		return hashmap.toString();
	}

	public void check1() {
		// TODO Auto-generated method stub
		
		
		
	
	}

	public String check2() {
		// TODO Auto-generated method stub
		
		System.out.println("av\n + bc");
		return "av";
		
	}
	
}


