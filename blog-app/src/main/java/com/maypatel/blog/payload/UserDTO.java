package com.maypatel.blog.payload;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserDTO {

	private int id;
	private String name;
	private String email;
	private String password;
	private String about;
}
