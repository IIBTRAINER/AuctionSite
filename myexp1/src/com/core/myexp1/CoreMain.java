package com.core.myexp1;

import java.util.ArrayList;

public class CoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		/*
		 * MyTest1 mytest = new MyTest1(); mytest.createTest1();
		 * 
		 * MyStackImpl impl = new MyStackImpl(10); impl.push("A"); impl.push("B");
		 * impl.push("C");
		 */
		Stack sta = new Stack(10);
		
		sta.push(2);
		sta.push(1);
		sta.push(3);
		sta.push(4);
		
		System.out.println("size :" + sta.size());
		System.out.println("before :" + sta.retrieve(3));
		System.out.println("pops :" + sta.pop());
		System.out.println("size :" + sta.size());
		
		System.out.println("after :" + sta.retrieve(3));
		
		
		
//		System.out.println("Items :" + impl.isFull());

	}

}
