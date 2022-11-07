package com.syntax.GroupStudy;




public  class encapsulation {

    String empName;
    protected int empAge;

    public String getempName() {
        return empName;
    }
 public    void printA(){
        System.out.println("Emploee name is "+getempName());
    }

    public int getempAge() {
        return empAge;
    }
  public   void prinB(){
        System.out.println("Employee age is "+empAge);
    }}
  class  test{
      public static void main(String[] args) {
          encapsulation demo=new encapsulation();

          demo.empName="John";
          demo.empAge=30;
          System.out.println(demo.getempName());
           }
  }

