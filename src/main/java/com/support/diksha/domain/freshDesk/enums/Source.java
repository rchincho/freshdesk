package com.support.diksha.domain.freshDesk.enums;

public enum Source {
	EMAIL(1), PORTAL(2), PHONE(3), CHAT(7), MOBIHELP(8), FEEDBACK_WIDGET(9), OUTBOUND_EMAIL(10);
	
	private int value;
	
	private Source(int value) {
		this.value = value;
	}
	
	public int toInt() {
		return value;
	}

	public int getValue() {
		return value;
	}

	public static Source getEnumVal(Integer val) {
		// 1:Email, 2:portal, 3:phone, 7:chat, 8:mobihelp, 9:feedback widget, 10:outbound email
		Source result = Source.EMAIL;
		switch (val) {
		case 1:
			result = Source.EMAIL;
			break;
		case 2:
			result = Source.PORTAL;
			break;
		case 3:
			result = Source.PHONE;
			break;
		case 7:
			result = Source.CHAT;
			break;
		case 8:
			result = Source.MOBIHELP;
			break;
		case 9:
			result = Source.FEEDBACK_WIDGET;
			break;
		case 10:
			result = Source.OUTBOUND_EMAIL;
			break;
		}
		return result;
	}
	
}
