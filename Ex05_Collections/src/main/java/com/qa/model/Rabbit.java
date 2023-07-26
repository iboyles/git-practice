package com.qa.model;

public class Rabbit extends Animal {
    public Rabbit(String name, int age) {
        super(name,age);
    }
    @Override
    public String sayHello() {
        return "Snuffle snuffle";
    }

    @Override
    public String move() {
        return "Hop HOp hop";
    }

    public String toString() {
        return "Dog: " + super.toString();
    }
}


