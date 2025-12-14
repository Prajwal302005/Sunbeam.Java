package com.sunbeam;

public class student {
    int rollNo;
    String name;
    double marks;

    public student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}