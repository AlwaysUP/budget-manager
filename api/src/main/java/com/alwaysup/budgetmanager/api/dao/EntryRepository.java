package com.alwaysup.budgetmanager.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alwaysup.budgetmanager.api.model.Entry;

/**
 * DAO for Entry
 * 
 * @author AlwaysUP
 *
 */
@Repository
public interface EntryRepository extends CrudRepository<Entry, Integer> {

}
