package com.hard_work.enno.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hard_work.enno.Model.My_User;

public interface UserDAO extends JpaRepository<My_User, Integer> {

}
