package com.example.srping.security.repository;

import com.example.srping.security.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

// CRUD 함수를 JpaRepository가 들고 있음.
// @Repository라는 어노테이션이 없어도 IoC 된다. JpaRepository를 상속했기 때문에
public interface UserRepository extends JpaRepository<User, Long> {

    // findBy 규칙 -> Username 문법
    // SELECT * FROM user WHERE username = 1?;
    public User findByUsername(String username);
}
