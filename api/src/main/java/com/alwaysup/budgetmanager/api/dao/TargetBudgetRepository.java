package com.alwaysup.budgetmanager.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alwaysup.budgetmanager.api.model.TargetBudget;

/**
 * DAO for TargetBudget
 * 
 * @author AlwaysUP
 *
 */
@Repository
public interface TargetBudgetRepository extends CrudRepository<TargetBudget, Integer> {

}
