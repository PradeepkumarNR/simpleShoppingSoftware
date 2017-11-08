package com.siq.simpleshoppingsoftware.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.siq.simpleshoppingsoftware.source.SimpleShopping;

public class testOneItemofDifferentPrices {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void ShouldcalculateTotalPriceWhen3differentPrices() {

		SimpleShopping simpleshopping = new SimpleShopping();
		simpleshopping.item = 1;
		int price1 = 2;
		int price2 = 4;
		int price3 = 5;

		simpleshopping.cumulativepricelist[0] = price1;
		simpleshopping.cumulativepricelist[1] = price2;
		simpleshopping.cumulativepricelist[2] = price3;
		
		
		assertEquals(11, simpleshopping.calculateprice());
	}

}
