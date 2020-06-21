package com.core.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.core.myexp1.MyTest1;

class UnitTest1 {

	@Test
	void test() {
	//	fail("Not yet implemented");
		
		MyTest1 mytest = new MyTest1();
		
		MyTest1 mynew = new MyTest1();
	
		assertEquals("av", mynew.check2());
		//mytest.createTest1();
		
	System.out.println(mytest.createTest2());
		
	//	assertEquals(12, mytest.createTest1());
		
		assertEquals("{key1=fizer}", mytest.createTest2());
	}

}
