package com.syntax.GroupStudy;




    public class EncapsulationDemo1 {


        private String empName;
        private int empAge;

        public EncapsulationDemo1(String empName, int empAge) {
            setempName(empName);
            setempAge(empAge);
        }


        public String getempName(){
            return empName;
        }
        public void setempName(String empName) {
            this.empName = empName;
        }
        void printname() {
            System.out.println("Employee name: " + empName);
        }

        public int getempAge(){
            return  empAge;
        }
        public  void setempAge(int empAge){
            this.empAge=empAge;
        }
        void prntnage() {
            System.out.println("Employee Age: " + empAge);
        }
    }

class Main {

    public static void main(String[] args) {
        EncapsulationDemo1 ss = new EncapsulationDemo1("Meroi", 26);
        System.out.println(ss.getempName());
       // ss.printname();
      //  System.out.println(ss.getempAge());
       // ss.setempAge();

    }

}