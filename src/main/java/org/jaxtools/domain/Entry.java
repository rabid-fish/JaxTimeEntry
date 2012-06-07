package org.jaxtools.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.jaxtools.service.util.ServiceEntity;

public class Entry implements Serializable, ServiceEntity {

	private static final long serialVersionUID = 1L;

	@NotNull
	private Long id;
	
	@NotNull
	private Long userId;
	
	@NotNull
	private Long issueId;
	
	@NotNull
	private Date entryDate;
	
	@NotNull
	private BigDecimal hours;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getIssueId() {
		return issueId;
	}

	public void setIssueId(Long issueId) {
		this.issueId = issueId;
	}

	public Date getEntryDate() {
		return entryDate;
	}
	
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	
	public BigDecimal getHours() {
		return hours;
	}

	public void setHours(BigDecimal hours) {
		this.hours = hours;
	}

}
