package com.neu.sunit.configuration;

import com.neu.sunit.configuration.dto.Course;
import com.neu.sunit.configuration.service.CourseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ConfigurationApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationApplication.class, args);

		/*ApplicationContext context
				= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		CourseService courseService
				= (CourseService)context.getBean(
				"courseService");

		Course course = (Course)context.getBean("course");
		// Adding New Course
//		Course course = new Course();
//		course.setId(1);
//		course.setCourse_name("Java");
//		course.setCourse_duration(7);
//		course.setCourse_fees(40000);

		courseService.addNewCourse(course);
		System.out.println("Course Name:"
				+ course.getCourse_name());
		System.out.println("Course Duration:"
				+ course.getCourse_duration()
				+ "Months");
		System.out.println("Course Fees:"
				+ course.getCourse_fees());*/
	}
}