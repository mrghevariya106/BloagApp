package com.maypatel.blog.services;

import java.util.List;

import com.maypatel.blog.payload.UserDTO;

public interface UserService {

	UserDTO createUser(UserDTO user);

	UserDTO updateUser(UserDTO user, int id);

	UserDTO getUserById(int userId);

	List<UserDTO> getAllUser();

	void deleteUser(int userId);
}
