package com.cs_interview_spring_boot.cs_interview_spring_boot.user;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
}
