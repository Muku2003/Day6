package com.demo.day6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.day6.model.ChildModel;

public interface ChildRepo extends JpaRepository<ChildModel, Integer>{

}
