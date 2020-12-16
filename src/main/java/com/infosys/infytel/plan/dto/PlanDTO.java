package com.infosys.infytel.plan.dto;

import com.infosys.infytel.plan.entity.Plan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PlanDTO {

	Integer planId;
	String planName;
	Integer nationalRate;
	Integer localRate;
	
	public static PlanDTO valueOf(Plan plan) {
		PlanDTO planDTO = new PlanDTO();
		planDTO.setLocalRate(plan.getLocalRate());
		planDTO.setNationalRate(plan.getNationalRate());
		planDTO.setPlanId(plan.getPlanId());
		planDTO.setPlanName(plan.getPlanName());
		return planDTO;
	}
}
