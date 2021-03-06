package com.learning.cmad.user.data;

import java.util.List;

import com.learning.cmad.blog.api.Blog;
import com.learning.cmad.user.api.User;

public interface UserDAO {

	//Create
	public int createUser(User user);
	
	//Read
	public List<User> getAllUsers();
	public User getUserById(int id);
	
	//Update
	public void updateUser(User user);
	
	
	//Delete
	public void deleteUser(User user);
	public void deleteUserById(int id);

	public List<Blog> getBlogsByUserId(int id);
}
