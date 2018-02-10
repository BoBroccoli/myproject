package com.example.model;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User implements Serializable{
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	@Column(name="Email")
	private String Email;
	@Column(name="password")
	private String password;
	public String getEmail() {
		return Email;
	}
	public String getPassword() {
		return password;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(int id, String email, String password) {
		super();
		this.id = id;
		Email = email;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
