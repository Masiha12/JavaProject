package src.com.syntax.Replit;

import java.util.ArrayList;

public class EncapsulationDemo {





    public String getempName;
    private String emName;
    private int emAge;

    public EncapsulationDemo(String emName, int emAge) {
        setemName(emName);
        setemAge(emAge);
    }

    public String getemName() {
        return emName;
    }

    public void setemName(String emName) {
        this.emName = emName;
    }

    public void printInfo() {
        System.out.println("Employee Name: " + emName);
    }

    public int getemAge() {
        return emAge;
    }

    public void setemAge(int emAge) {
        this.emAge = emAge;
    }

    public void prntline() {
        System.out.println("Employee Age: " + emAge);
    }
}


