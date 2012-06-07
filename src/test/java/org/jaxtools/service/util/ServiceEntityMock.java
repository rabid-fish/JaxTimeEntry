package org.jaxtools.service.util;

public class ServiceEntityMock implements ServiceEntity {

	private Long id;
	private String value;
	
	public ServiceEntityMock(Long id) {
		this.id = id;
	}
	
	@Override
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}