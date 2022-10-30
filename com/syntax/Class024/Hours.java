package com.syntax.Class024;

public class Hours {
  private   String name;
   private String bread;
 private    String color;
   private int age;

    public Hours(String name, String bread, String color, int age) {
        setName(name);
        setBread(bread);
        setColor(color);
        setAge(age);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("Name can not be empty");
        }else {
            this.name = name;
        }

    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        if (bread.isEmpty()) {
            System.out.println("Bread can not be empty");
        } else {
            this.bread = bread;
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty()){
            System.out.println("Cplor can not be empty");

        }else{
            this.color = color;
        }

    }

    public int getAge() {
        return age;
    }
    void printInfo() {
        System.out.println("Name " + name + " " + bread + " " + color + " " + age);
    }
    public void setAge(int age) {
        if(age<0){
            System.out.println("Age can not be negative");

        }else{
            this.age = age;
        }


        }

    }
    class Test{
        public static void main(String[] args) {
            Hours animal=new Hours("Boon ","German","white and Black",8);
            animal.printInfo();
        }
    }
    /*public Hours(String name, String color, int age, double weight, double price) {
        setName(name);
        setColor(color);
        setAge(age);
        setWeight(weight);
        setPrice(price);

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {

            if(name.length()>10){
                System.out.println("Name can not be more than 30 letters. please try again");
            } else if (name. isEmpty()) {
                System.out.println("Name can not be empty please try again");
            }else{
                this.name=name;
            }
        }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    void printInfo(){
        System.out.println("Name "+name+" color "+color+" age "+age+" weight "+weight+" price"+price);
    }


    }

    class teaster{
        public static void main(String[] args) {
            Hours hur=new Hours("bonji","white", 8,3.6,120.99);
            hur.printInfo();

        }
    }


*/
