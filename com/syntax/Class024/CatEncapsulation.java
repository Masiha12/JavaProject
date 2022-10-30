package com.syntax.Class024;

public class CatEncapsulation {



    public CatEncapsulation(String name, String bread, int age, double weight) {
        setName(name);
        setBread(bread);
        setAge(age);
        setWeight(weight);
    }
    String name;
    String bread;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    double weight;
}
