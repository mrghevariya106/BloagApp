package com.maypatel.blog.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
@NoArgsConstructor
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name ="user_name", nullable = false, length = 100)
	private String name;
	
//	@Column(name ="user_email", nullable = false, length = 100)
	private String email;
	
//	@Column(name ="user_password", nullable = false, length = 100)
	private String password;
	
//	@Column(name ="user_about", nullable = false, length = 100)
	private String about;
	
}
