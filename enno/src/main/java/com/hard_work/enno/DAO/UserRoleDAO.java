package com.hard_work.enno.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hard_work.enno.Model.UserRole;

public interface UserRoleDAO extends JpaRepository<UserRole, Integer> {

}
