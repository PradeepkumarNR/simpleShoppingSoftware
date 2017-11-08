package com.siq.simpleshoppingsoftware.source;

public class SimpleShopping {
	public int item;
	public int totalprice;
	public int cumulativepricelist[] = new int[100];

	public int calculateprice() {

		for (int i = 0; i < cumulativepricelist.length; i++) {

			totalprice = totalprice + cumulativepricelist[i];

		}

		return totalprice * item;
	}

}
