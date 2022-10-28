package com.sentax.Class21;

public class Car {

    void start() {
        System.out.println("Use the key to start me");
    }

    void stop() {
        System.out.println("Use break to stop me");
    }

    void park() {
        System.out.println("Park me manually");
    }
}
class BMW extends Car{
    void start(){
        System.out.println("Use push start to start me");
    }

    void stop() {
        super.stop();
        System.out.println("Use auto break to stop me");
    }
}

class Toyota extends  Car{
    void start(){
        System.out.println("push me to start");
    }
}
class Tesla extends Car{

    void start(){
        System.out.println("use the app to start me");
    }

    void stop(){
        System.out.println("Use AI and auto-breaking to stop me");
    }
    void park(){
        System.out.println("I can auto park myself!");
    }
}

