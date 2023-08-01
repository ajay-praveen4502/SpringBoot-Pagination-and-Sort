package com.example.Project3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project3.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    
}
