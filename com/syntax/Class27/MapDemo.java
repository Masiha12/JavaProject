package com.syntax.Class27;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, String > data=new HashMap<>();
        data.put("UserName","Anton123");// this is how we store info inside the map
        data.put("Password","passwor123");
        System.out.println(data);
        System.out.println(data.get("password123"));// this is how we can get back the value
    }
}
