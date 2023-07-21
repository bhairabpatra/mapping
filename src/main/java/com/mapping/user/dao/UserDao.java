package com.mapping.user.dao;


import com.mapping.user.entiry.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
}
