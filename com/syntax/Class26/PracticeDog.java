package com.syntax.Class26;

import java.util.ArrayList;

public class PracticeDog {
  private   String name;
   private String color;
  private   String breed;

    public PracticeDog(String name, String color, String breed) {
        setName(name);
        setBreed(breed);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "PracticeDog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
class Arralittest{
    public static void main(String[] args) {
        ArrayList<PracticeDog> dogs=new ArrayList<>();
        dogs.add(new PracticeDog("Tommy","Black","German"));
        dogs.add(new PracticeDog("Jony","white","BullDog"));
        dogs.add(new PracticeDog("Kimi","Brown","German"));
      //  PracticeDog dog=new PracticeDog("Tommy","Black","German");
        System.out.println(dogs);
      //  System.out.println(dog);
    }
}