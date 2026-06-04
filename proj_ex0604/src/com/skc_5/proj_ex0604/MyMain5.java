package com.skc_5.proj_ex0604;

class MyMain5 {

	public static void main(String[] args) {
		Payment p1 = new CardPayment();
		Payment p2 = new TossPay();

		p1.pay(10000);
		p2.pay(20000);
	}

}
