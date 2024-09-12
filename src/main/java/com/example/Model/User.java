package com.example.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table
public class User {
	
	@Id
	@GeneratedValue
	@Column
	int id;
	@Column
	int age;
	@Column
	String name;
	@Column
	String user_type;
	
	
	public int getId()
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id=id;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	
	{
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getUser_type()
	{
		return user_type;
	}
	public void setUser_type(String user_type)
	{
		this.user_type=user_type;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + ", name=" + name + ", user_type=" + user_type + "]";
	}
	
	
}
