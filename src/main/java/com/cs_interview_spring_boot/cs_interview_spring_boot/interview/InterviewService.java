package com.cs_interview_spring_boot.cs_interview_spring_boot.interview;

import com.cs_interview_spring_boot.cs_interview_spring_boot.interview.InterviewDto;

import java.util.List;

public interface InterviewService {
    InterviewDto createInterview(InterviewDto interviewDto);
    List<InterviewDto> getAllInterview();
    InterviewDto getInterviewById(Integer id);
    List<InterviewDto> getInterviewsByUserId(Integer userId);
    InterviewDto updateInterview(Integer id, InterviewDto interviewDto);

    String deleteInterviewById(Integer id);
}
