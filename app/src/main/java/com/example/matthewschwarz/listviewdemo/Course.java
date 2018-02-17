package com.example.matthewschwarz.listviewdemo;

/**
 * Created by matthewschwarz on 2/15/18.
 */

public class Course {
    private String courseNumber;
    private String courseName;
    private String instructor;

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
