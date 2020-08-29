package com.alwaysup.budgetmanager.api.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * User: Client
 * 
 * @author AlwaysUP
 */

@Entity
public class User {
	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "id_generator")
	@SequenceGenerator(name = "id_generator", sequenceName = "USER_ID_SEQ")
	@Column(name = "user_id")
	private int id;
	private String name;
	@OneToMany
	@JoinColumn(name = "user_id")
	private Set<TargetBudget> budgets;

	public User() {
		
	}

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the budgets
	 */
	public Set<TargetBudget> getBudgets() {
		return budgets;
	}

	/**
	 * @param budgets the budgets to set
	 */
	public void setBudgets(Set<TargetBudget> budgets) {
		this.budgets = budgets;
	}
}
