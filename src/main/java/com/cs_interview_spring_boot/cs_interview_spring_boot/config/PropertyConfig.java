package com.cs_interview_spring_boot.cs_interview_spring_boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:env.properties")
public class PropertyConfig {
}
