package com.cs_interview_spring_boot.cs_interview_spring_boot.repository;

import com.cs_interview_spring_boot.cs_interview_spring_boot.model.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewRepository extends JpaRepository<Interview, Integer> {

}
