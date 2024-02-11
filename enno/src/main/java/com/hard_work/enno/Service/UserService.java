package com.hard_work.enno.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hard_work.enno.DAO.UserDAO;
import com.hard_work.enno.model.My_User;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public void addUser(My_User user) {
        userDAO.save(user);
    }

    public Optional<My_User> getUserById(int id) {
        return userDAO.findById(id);
    }

    public List<My_User> getAllUsers() {
        return userDAO.findAll();
    }

    public void deleteUser(int id) {
        userDAO.deleteById(id);
    }

    public void updateUser(My_User user) {
        userDAO.save(user);
    }

}