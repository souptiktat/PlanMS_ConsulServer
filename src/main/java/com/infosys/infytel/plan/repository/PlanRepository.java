package com.infosys.infytel.plan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.infytel.plan.entity.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer>{

	Plan getByPlanId(Integer planId);
}
