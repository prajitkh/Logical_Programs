package com.dependencyInjection;

import java.util.HashMap;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {

	private Map<String, User> users = new HashMap<>();

	public UserRepositoryImpl() {

		users.put("1", new User("1", "Alice"));
		users.put("2", new User("2", "Bob"));
	}

	@Override
	public User getUserById(String userId) {
		return users.get(userId);
	}
}