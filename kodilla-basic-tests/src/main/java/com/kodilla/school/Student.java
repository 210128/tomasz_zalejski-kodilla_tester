package com.kodilla.school;

public class Student {
    private String name;
    private Grades maths;
    private Grades physic;
    private Grades geography;
    private Grades history;

    public Student(String name) {
        this.name = name;
        this.maths = new Grades();
        this.physic = new Grades();
        this.geography = new Grades();
        this.history = new Grades();

    }

    public void addMathGrade(int grade) {

        if (grade > 0 && grade < 7) {
            this.maths.add(grade);
        }
    }

    public void addPhysicGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.physic.add(grade);
        }
    }

    public void addGeographyGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.geography.add(grade);
        }
    }

    public void addHistoryGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.history.add(grade);
        }
    }

    public double getMathAverage() {
        return this.maths.getAverage();
    }

    public double getPhysicAverage() {
        return this.physic.getAverage();
    }

    public double getGeographyAverage() {
        return this.geography.getAverage();
    }

    public double getHistoryAverage() {
        return this.history.getAverage();
    }
    public double getAverage(){
        double averageSum = this.geography.getAverage() + this.history.getAverage() + this.maths.getAverage() + this.physic.getAverage();
        return averageSum/4;
    }
}
