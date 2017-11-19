package model;

import java.util.Collection;

import org.springframework.stereotype.Service;

@Service
public class companyModel {
	
	private String username;
	private  String password;
	private Collection <String> roles;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Collection<String> getRoles() {
		return roles;
	}
	public void setRoles(Collection<String> roles) {
		this.roles = roles;
	}
	
	
	
	
	

}
