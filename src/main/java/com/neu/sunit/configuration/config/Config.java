package com.neu.sunit.configuration.config;

import com.neu.sunit.configuration.dto.Course;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan
@Configuration
public class Config {

    @Bean(name="course2")
    public Course getCourse() {
        return new Course(2,"Spring",400.0,3.5);
    }

}
