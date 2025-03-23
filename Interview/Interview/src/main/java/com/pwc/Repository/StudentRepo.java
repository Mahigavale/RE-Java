package com.pwc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pwc.Entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {

}
