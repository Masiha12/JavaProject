package com.syntax.GroupStudy;

public class EncapsulationDemo2 {

    private String empName;
    private int empAge;

    public String getempName() {
        return empName;
    }

    public void prinDetails() {
        System.out.println("Employee Name:" + empName);

    }

    public int getempAge() {
        return empAge;
    }

    public void Info() {
        System.out.println("Employee Age:" + empAge);
    }
}
