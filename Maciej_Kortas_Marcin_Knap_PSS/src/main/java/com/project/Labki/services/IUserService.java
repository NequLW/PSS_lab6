package com.project.Labki.services;

import java.util.List;

import com.project.Labki.model.User;

public interface IUserService {
	void save(User user);
	List<User> findAll() ;
	List<User> findById(Long userId) ;
	void updatePassword(long userId, String newPassword);
	boolean deleteById(long user_id);
	List<User> getAllUsersByRoleName(String roleName);

	List<User> findByEmail(String email);
}
