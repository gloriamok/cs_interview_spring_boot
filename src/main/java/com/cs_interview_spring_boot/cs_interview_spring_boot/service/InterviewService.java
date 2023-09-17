package com.cs_interview_spring_boot.cs_interview_spring_boot.service;

import com.cs_interview_spring_boot.cs_interview_spring_boot.payload.InterviewDto;

import java.util.List;

public interface InterviewService {
    InterviewDto createInterview(InterviewDto interviewDto);
    List<InterviewDto> getAllInterview();
    InterviewDto getInterviewById(Integer id);
    InterviewDto updateInterview(Integer id, InterviewDto interviewDto);

    void deleteInterviewById(Integer id);
}
