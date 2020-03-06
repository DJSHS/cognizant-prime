package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.models.SpeedResult;

public interface SpeedRepository extends JpaRepository<SpeedResult, Long> {
	
    @Query("SELECT * FROM SpeedResult s where s.subject_name = :subjectName") 
	public List<SpeedResult> findBySubjectName(@Param("subjectName")String subjectName);
}
