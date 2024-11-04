package com.braggbay106.dao;

import java.util.List;

import com.braggbay106.dao.GenericDAO;
import com.braggbay106.domain.Review;





public interface ReviewDAO extends GenericDAO<Review, Integer> {
  
	List<Review> findAll();
	






}


