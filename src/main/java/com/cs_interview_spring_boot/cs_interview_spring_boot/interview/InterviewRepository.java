package com.cs_interview_spring_boot.cs_interview_spring_boot.interview;

import com.cs_interview_spring_boot.cs_interview_spring_boot.interview.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewRepository extends JpaRepository<Interview, Integer> {

}
