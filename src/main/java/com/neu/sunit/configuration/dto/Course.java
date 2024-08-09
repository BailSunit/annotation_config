package com.neu.sunit.configuration.dto;
public class Course {
    private int id;
    private String course_name;
    private double course_fees;
    private double course_duration;

    public Course()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    public Course(int id, String course_name,
                  double course_fees,
                  double course_duration)
    {
        super();
        this.id = id;
        this.course_name = course_name;
        this.course_fees = course_fees;
        this.course_duration = course_duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name)
    {
        this.course_name = course_name;
    }

    public double getCourse_fees() {
        return course_fees;
    }

    public void setCourse_fees(double course_fees)
    {
        this.course_fees = course_fees;
    }

    public double getCourse_duration()
    {
        return course_duration;
    }

    public void setCourse_duration(double course_duration)
    {
        this.course_duration = course_duration;
    }
}
