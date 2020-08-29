package com.alwaysup.budgetmanager.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Earning or Spending Entry
 * 
 * @author AlwaysUP
 */
@Entity
public class Entry {
	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "id_generator")
	@SequenceGenerator(name = "id_generator", sequenceName = "ENTRY_ID_SEQ")
	private int id;
	private Category entryCategory;
	private float value;

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
	 * @return the entryCategory
	 */
	public Category getEntryCategory() {
		return entryCategory;
	}

	/**
	 * @param entryCategory the entryCategory to set
	 */
	public void setEntryCategory(Category entryCategory) {
		this.entryCategory = entryCategory;
	}

	/**
	 * @return the value
	 */
	public float getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(float value) {
		this.value = value;
	}
}
