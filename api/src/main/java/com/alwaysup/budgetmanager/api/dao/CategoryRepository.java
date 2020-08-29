package com.alwaysup.budgetmanager.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alwaysup.budgetmanager.api.model.Category;

/**
 * DAO for Category
 * 
 * @author AlwaysUP
 *
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
