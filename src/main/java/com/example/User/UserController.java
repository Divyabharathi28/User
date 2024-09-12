package com.example.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.User;
import com.example.Repo.UserRepo;

@RestController
public class UserController {
	@Autowired
	private UserRepo repo;

	@GetMapping ("/users")
	public List<User> getAllUsers()
	{
		ArrayList<User> arr = new ArrayList<>();
		
		 repo.findAll().forEach(i-> arr.add(i));
		 return arr;
	}
	  @GetMapping("/user/{id}") public User getUser(@PathVariable("id") int id) {
	  return repo.findById(id).get(); }
	 
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable("id") int id)
	{
		repo.deleteById(id);
	}
	
	@PutMapping("/user/{id}")
	public User save(@RequestBody User user,@PathVariable("id")int id)
	{
		repo.save(user);
		return user;
	}
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user)
	{
		repo.save(user);
		return user;
	}
	
}
