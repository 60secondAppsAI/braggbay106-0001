package com.braggbay106.dao;

import java.util.List;

import com.braggbay106.dao.GenericDAO;
import com.braggbay106.domain.Category;





public interface CategoryDAO extends GenericDAO<Category, Integer> {
  
	List<Category> findAll();
	






}


