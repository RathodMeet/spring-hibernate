package com.mvc.controller;

public interface UserDao {
		
		public long save(User user);
		
		public User getUserById(long id);
}
