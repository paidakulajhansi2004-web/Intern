package com.example.intern.repository;

import com.example.intern.entity.Intern;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternRepository extends JpaRepository<Intern,Long> {
}