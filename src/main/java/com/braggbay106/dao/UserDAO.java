package com.braggbay106.dao;

import java.util.List;

import com.braggbay106.dao.GenericDAO;
import com.braggbay106.domain.User;

import java.util.Optional;




public interface UserDAO extends GenericDAO<User, Integer> {
  
	List<User> findAll();
	






}


