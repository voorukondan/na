// Write your code here
package com.example.school.model;

public class Student {
    private int StudentId;
    private String studentName;
    private String gender;
    private int standard;
    public Student(int studentId, String studentName, String gender, int standard) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.standard = standard;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;

    }

    public int getStudentId() {
        return studentId;
    }

    public void getStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void getGender() {
        return gender;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getStandard() {
        return standard;
    }

}