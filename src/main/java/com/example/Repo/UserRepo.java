package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.User;


public interface UserRepo extends CrudRepository<User,Integer> {

}
