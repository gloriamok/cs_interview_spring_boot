package com.cs_interview_spring_boot.cs_interview_spring_boot.interview;

import com.cs_interview_spring_boot.cs_interview_spring_boot.interview.InterviewDto;
import com.cs_interview_spring_boot.cs_interview_spring_boot.interview.InterviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interviews")
public class InterviewController {

    private InterviewService interviewService;

    public InterviewController(InterviewService interviewService) {
        this.interviewService = interviewService;
    }

    @PostMapping
    public ResponseEntity<InterviewDto> createInterview(@RequestBody InterviewDto interviewDto) {
        return new ResponseEntity<>(interviewService.createInterview(interviewDto),HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<InterviewDto>> getAllInterview() {
        return ResponseEntity.ok(interviewService.getAllInterview());
    }

    @GetMapping("/{id}")
    public ResponseEntity<InterviewDto> getInterviewById(@PathVariable Integer id) {
        return ResponseEntity.ok(interviewService.getInterviewById(id));
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<InterviewDto>> getInterviewsByUserId(@PathVariable Integer userId) {
        return ResponseEntity.ok(interviewService.getInterviewsByUserId(userId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<InterviewDto> updateInterview(@PathVariable Integer id, @RequestBody InterviewDto interviewDto) {
        return ResponseEntity.ok(interviewService.updateInterview(id, interviewDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteInterview(@PathVariable Integer id) {
        return ResponseEntity.ok(interviewService.deleteInterviewById(id));
    }

}
