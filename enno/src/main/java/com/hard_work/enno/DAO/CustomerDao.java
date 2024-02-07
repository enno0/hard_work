package com.hard_work.enno.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hard_work.enno.model.Customer;



public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
