package com.braggbay106.dao;

import java.util.List;

import com.braggbay106.dao.GenericDAO;
import com.braggbay106.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


