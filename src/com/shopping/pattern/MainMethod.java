package com.shopping.pattern;

public class MainMethod {

	public static void main(String[] args) {

		// Factory desgin pattern
		Message createMessage = MessageFactoryImpl.createMessage("email");

		System.out.println("Message : " + createMessage.getContent());

		Message createMessage2 = MessageFactoryImpl.createMessage("outlook");

		System.out.println("Message : " + createMessage2.getContent());

	}

}
