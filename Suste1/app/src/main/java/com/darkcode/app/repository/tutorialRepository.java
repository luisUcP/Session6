package com.darkcode.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darkcode.app.model.Tutorial;

public interface tutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByName(String Cerveceria);
    List<Tutorial> findByMarca(String marca);
    
}