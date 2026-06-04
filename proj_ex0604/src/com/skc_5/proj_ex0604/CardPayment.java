package com.skc_5.proj_ex0604;

class CardPayment extends Payment {
	@Override
	void pay(int amount) {
		System.out.println("카드 결제: " + amount);
	}
}
