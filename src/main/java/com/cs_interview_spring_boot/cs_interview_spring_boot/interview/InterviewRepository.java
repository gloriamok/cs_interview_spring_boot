package com.cs_interview_spring_boot.cs_interview_spring_boot.interview;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InterviewRepository extends JpaRepository<Interview, Integer> {
    List<Interview> findByUserId(Integer userId);
}
