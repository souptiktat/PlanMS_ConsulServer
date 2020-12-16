package com.infosys.infytel.plan.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.infytel.plan.dto.PlanDTO;
import com.infosys.infytel.plan.service.PlanService;

@RestController
@EnableAutoConfiguration
public class PlanController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PlanService planService;
	
	@RequestMapping(value="/plans", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PlanDTO> getAllPlans() {
		logger.info("Fetching the plans");
		return planService.getAllPlans();
	}
	
	@RequestMapping(value="/plans/{planId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public PlanDTO getSpecificPlan(@PathVariable("planId") Integer planId) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		logger.info("Fetching details of plan {}" , planId);
		return planService.getSpecificPlan(planId);
	}
}
