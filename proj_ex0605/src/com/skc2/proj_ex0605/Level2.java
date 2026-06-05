package com.skc2.proj_ex0605;

enum Level2 {
	LOW("Low level"), 
	MEDIUM("Medium level"), 
	HIGH("High level");

	// enum에서 사용할 변수
	private String description;

	// enum 생성자
	private Level2(String description) {
		this.description = description;
	}

	// enum의 게터
	public String getDescription() {
		return description;
	}
}
