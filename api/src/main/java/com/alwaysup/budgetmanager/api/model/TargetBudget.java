package com.alwaysup.budgetmanager.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Target Budget of User by Category
 * 
 * @author AlwaysUP
 */
@Entity
public class TargetBudget {
	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "id_generator")
	@SequenceGenerator(name = "id_generator", sequenceName = "TB_ID_SEQ")
	private int id;
	private Category budgetCategory;
	private float totalBudget;
	@ManyToOne
	@JoinColumn(name = "user_id", insertable = false, updatable = false)
	private User user;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the budgetCategory
	 */
	public Category getBudgetCategory() {
		return budgetCategory;
	}

	/**
	 * @param budgetCategory the budgetCategory to set
	 */
	public void setBudgetCategory(Category budgetCategory) {
		this.budgetCategory = budgetCategory;
	}

	/**
	 * @return the totalBudget
	 */
	public float getTotalBudget() {
		return totalBudget;
	}

	/**
	 * @param totalBudget the totalBudget to set
	 */
	public void setTotalBudget(float totalBudget) {
		this.totalBudget = totalBudget;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
}
