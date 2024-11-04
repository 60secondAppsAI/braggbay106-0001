package com.braggbay106.dao;

import java.util.List;

import com.braggbay106.dao.GenericDAO;
import com.braggbay106.domain.Address;





public interface AddressDAO extends GenericDAO<Address, Integer> {
  
	List<Address> findAll();
	






}


