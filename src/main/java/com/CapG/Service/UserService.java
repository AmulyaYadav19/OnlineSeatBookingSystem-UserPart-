package com.CapG.Service;

import com.CapG.Model.User;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public interface UserService {

	public User addUser(User Reg);
	public User login(String username,String password);
	public User updateUser(User user);
}

