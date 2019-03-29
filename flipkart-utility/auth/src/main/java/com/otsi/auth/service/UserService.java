package com.otsi.auth.service;

import com.otsi.auth.model.User;

public interface UserService {

	void save(User user);

	User findByUsername(String username);
}
