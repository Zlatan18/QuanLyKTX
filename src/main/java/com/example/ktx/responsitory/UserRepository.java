package com.example.ktx.responsitory;

import com.example.ktx.entity.User;
import com.example.ktx.entity.Zoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
}
