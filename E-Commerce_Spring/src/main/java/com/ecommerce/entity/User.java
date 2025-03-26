package com.ecommerce.entity;


import com.ecommerce.dto.UserDto;
import com.ecommerce.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private String name;

    private UserRole role;

    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] img;


    
    
    public User() {
		super();
		// TODO Auto-generated constructor stub
	}




	public User(Long id, String email, String password, String name, UserRole role, byte[] img) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.role = role;
		this.img = img;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public UserRole getRole() {
		return role;
	}




	public void setRole(UserRole role) {
		this.role = role;
	}




	public byte[] getImg() {
		return img;
	}




	public void setImg(byte[] img) {
		this.img = img;
	}




	public UserDto getUserDto() {
        UserDto userDto = new UserDto();
        userDto.setId(id);
        userDto.setName(name);
        userDto.setEmail(email);
        userDto.setReturnedImg(img);
        userDto.setRole(role);
        return userDto;
    }
}
