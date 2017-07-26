package com.example;

public class Teacher extends School {
    String firstName;
    String lastName;
    String Id;
    int grade;

    public Teacher(String firstName, String lastName, String id, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        Id = id;
        this.grade = grade;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getId() {
        return Id;
    }

    @Override
    public void setId(String id) {
        Id = id;
    }

    @Override
    public int getGrade() {
        return grade;
    }

    @Override
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
