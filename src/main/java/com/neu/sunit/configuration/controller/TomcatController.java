package com.neu.sunit.configuration.controller;

import com.neu.sunit.configuration.dto.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class TomcatController {

    @Autowired(required = false)
    @Qualifier("course")
    Course course;

    @GetMapping("/hello")
    public String sayHello() {
        return course.getCourse_name();
        //return IntStream.range(0, 10)
         //       .mapToObj(i -> "Hello number " + i)
          //      .collect(Collectors.toList());
    }
}