package org.jaxtools.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.jaxtools.service.util.ServiceEntity;

public class User implements Serializable, ServiceEntity {

	private static final long serialVersionUID = 1L;

	@NotNull
	private Long id;
	
	@NotNull
	private String fullname;
	
	@NotNull
	private String username;
	
	@NotNull
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

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
	
}
