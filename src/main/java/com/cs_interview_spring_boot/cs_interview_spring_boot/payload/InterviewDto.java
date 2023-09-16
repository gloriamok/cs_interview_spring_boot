package com.cs_interview_spring_boot.cs_interview_spring_boot.payload;

import lombok.Data;

@Data
public class InterviewDto {
    private Integer id;
    private String subject;
    private String question;
    private String answer;
    private String keyword;
}
