package com.CapG.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CapG.Model.User;
import com.CapG.Repository.UserRepository;
@Service
public class UserServiceimpl implements UserService
{


	@Autowired
	UserRepository repo;
	
	public User login(String username,String password)
	{
		User user=repo.findByUsernameAndPassword(username,password);
		return user;
	}
	
	public User addUser(User Reg)
	{
		User registration= repo.save(Reg);
		return Reg;
	}

	@Override
	public User updateUser(User user) {
		return repo.save(user);
	}
		
		
		
			

	}
