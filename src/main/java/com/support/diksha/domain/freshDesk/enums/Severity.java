package com.support.diksha.domain.freshDesk.enums;

public enum Severity {
	S1(1), S2(2), S3(3);
	
	private int value;

	Severity(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return this.value;
	}
}
