package com.dependencyInjection;

import com.array.UserService;

public class UserMain {
	public static void main(String[] args) {

		UserRepository userRepository = new UserRepositoryImpl();

		UserService userService = new UserService(userRepository);

		System.out.println("User 1 name: " + userService.getUserName("1"));
		System.out.println("User 2 name: " + userService.getUserName("2"));
		// System.out.println("User 3 name: " + userService.getUserName("3"));
	}
}
