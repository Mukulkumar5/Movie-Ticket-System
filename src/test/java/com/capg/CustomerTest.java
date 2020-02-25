package com.capg;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.onlinemovieticket.controller.Customer;

public class CustomerTest {

	@Test
	public void test() {
		Customer cust= new Customer();
		boolean val = cust.chooseCity("1");
	//	System.out.println(b);
		assertEquals(true, val);
	}

}
