package com.maypatel.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maypatel.blog.modal.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
