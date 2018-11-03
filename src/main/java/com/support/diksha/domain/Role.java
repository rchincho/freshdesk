package com.support.diksha.domain;

public enum Role {
	ADMIN(1), AGENT(2);
	
	private Integer value;

	private Role(Integer value) {
		this.value = value;
	}
}
