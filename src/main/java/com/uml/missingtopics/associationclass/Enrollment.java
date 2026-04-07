package com.uml.missingtopics.associationclass;

public class Enrollment {
    private final Student student;
    private final Course course;
    private final String semester;

    public Enrollment(Student student, Course course, String semester) {
        this.student = student;
        this.course = course;
        this.semester = semester;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getSemester() {
        return semester;
    }
}

