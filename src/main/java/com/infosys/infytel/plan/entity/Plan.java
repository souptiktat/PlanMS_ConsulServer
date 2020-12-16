package com.infosys.infytel.plan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "plan")
@Data
public class Plan {
	
	@Id
	@Column(name = "plan_id", nullable = false)
	Integer planId;
	
	@Column(name = "plan_name", nullable = false)
	String planName;
	
	@Column(name = "local_rate", nullable = false)
	Integer localRate;
	
	@Column(name = "national_rate", nullable = false)
	Integer nationalRate;

}
