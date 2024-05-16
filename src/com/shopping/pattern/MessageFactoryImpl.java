package com.shopping.pattern;

public class MessageFactoryImpl {

	public static Message createMessage(String message) {

		if (message.equalsIgnoreCase("email")) {
			return new EmailMessage();
		} else if (message.equalsIgnoreCase("outlook")) {
			return new OutlookMessage();
		} else {
			throw new IllegalArgumentException("invalid message type ");
		}

	}

}
