package org.jaxtools.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jaxtools.service.util.ServiceEntity;

public class Issue implements Serializable, ServiceEntity {

	private static final long serialVersionUID = 1L;

	@NotNull
	private Long id;
	
	@NotNull
	private Long projectId;
	
	@NotNull
	@Size(min = 2, max = 20)
	private String title;
	
	@NotNull
	@Size(min = 2, max = 250)
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	
}
