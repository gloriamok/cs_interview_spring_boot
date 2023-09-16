package com.cs_interview_spring_boot.cs_interview_spring_boot.service.impl;

import com.cs_interview_spring_boot.cs_interview_spring_boot.exception.ResourceNotFoundException;
import com.cs_interview_spring_boot.cs_interview_spring_boot.model.Interview;
import com.cs_interview_spring_boot.cs_interview_spring_boot.payload.InterviewDto;
import com.cs_interview_spring_boot.cs_interview_spring_boot.repository.InterviewRepository;
import com.cs_interview_spring_boot.cs_interview_spring_boot.service.InterviewService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InterviewServiceImpl implements InterviewService {
    private InterviewRepository interviewRepository;
    private ModelMapper mapper;

    public InterviewServiceImpl(InterviewRepository interviewRepository, ModelMapper mapper) {
        this.interviewRepository = interviewRepository;
        this.mapper = mapper;
    }

    private InterviewDto mapToDto(Interview interview) {
        InterviewDto interviewDto = mapper.map(interview, InterviewDto.class);
        return interviewDto;
    }

    private Interview mapToModel(InterviewDto interviewDto) {
        Interview interview = mapper.map(interviewDto, Interview.class);
        return interview;
    }


    @Override
    public InterviewDto createInterview(InterviewDto interviewDto) {
        Interview interview = mapToModel(interviewDto);
        Interview newInterview = interviewRepository.save(interview);
        return mapToDto(newInterview);
    }

    @Override
    public List<InterviewDto> getAllInterview() {
        List<Interview> interviewList = interviewRepository.findAll();
        return interviewList.stream().map(interview -> mapToDto(interview)).collect(Collectors.toList());
    }

    @Override
    public InterviewDto getInterviewById(Integer id) {
        Interview interview = interviewRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Interview","id",id));
        return mapToDto(interview);
    }

}
