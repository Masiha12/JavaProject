package com.syntax.Class20;

public class CreditCard {/*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
     */

    double balance;
    double interest;

    double displayInterest(double balance){
        interest=balance*0.03;
        System.out.println(this.interest);
        return interest;
    }

}
class Visa extends CreditCard{

}
class AX extends CreditCard{
    double displayInterest(double balance){
        super.interest=balance*0.05;
        System.out.println(interest);
        return interest;
    }

}
class test{
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        creditCard.displayInterest(100.05);

        Visa visa=new Visa();
        visa.displayInterest(100.10);

        AX ax=new AX();
        ax.displayInterest(100.5);

    }
}

class CreditCart2{

    double balance;
    double interest;

    CreditCart2(double balance, double interest){

        this.balance=balance;
        this.interest=interest;

    }

    void calculate(){
        double InterestAmount=interest*balance/100;

        System.out.println("InterestAmount"+interest);
        System.out.println();
        System.out.println("InterestAmount"+interest+5);
    }
}

class Visa1 extends CreditCart2{


    Visa1(double balance, double interest) {
        super(balance, interest);
    }
    void calculate(){
        double InterestAmount=interest*balance/100;
        System.out.println();
        System.out.println("InterestAmount "+(InterestAmount+5));
}}
class Ax extends Visa1{

    Ax(double balance, double interest) {
        super(balance, interest);
    }
    void calculate(){
        double InterestAmount=interest*balance/100;
        System.out.println();
        System.out.println("InterestAmount "+(InterestAmount+10));
    }}

class CreditCartTester{
    public static void main(String[] args) {
        Visa1 vis =new Visa1(100,5);
        vis.calculate();

    }
}