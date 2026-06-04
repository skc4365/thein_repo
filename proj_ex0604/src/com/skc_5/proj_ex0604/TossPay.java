package com.skc_5.proj_ex0604;

class TossPay extends Payment {
	@Override
	void pay(int amount) {
		System.out.println("토스페이 결제: " + amount);
	}
}
