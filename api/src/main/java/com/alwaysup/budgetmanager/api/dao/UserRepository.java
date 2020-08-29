package com.alwaysup.budgetmanager.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alwaysup.budgetmanager.api.model.User;

/**
 * DAO for User
 * 
 * @author AlwaysUP
 *
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
