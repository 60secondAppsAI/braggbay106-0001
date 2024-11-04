package com.braggbay106.dao;

import java.util.List;

import com.braggbay106.dao.GenericDAO;
import com.braggbay106.domain.Bid;





public interface BidDAO extends GenericDAO<Bid, Integer> {
  
	List<Bid> findAll();
	






}


