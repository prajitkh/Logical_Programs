package com.array;

import com.dependencyInjection.User;
import com.dependencyInjection.UserRepository;

public class UserService {

	private final UserRepository userRepository;

	// created thorugh Constructor injection added

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public String getUserName(String userId) {
		User user = userRepository.getUserById(userId);
		return user.getName();
	}
}
