package com.example.recycleview.model;

public class Student {

    private String mName;
    private int birthYear;

    public Student() {
    }

    public Student(String mName, int birthYear) {
        this.mName = mName;
        this.birthYear = birthYear;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
