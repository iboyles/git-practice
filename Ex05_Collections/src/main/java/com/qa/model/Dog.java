package com.qa.model;

public class Dog extends Animal{
    public Dog(String name, int age){
        super(name,age);
    }
    @Override
    public String sayHello() {
        return "Oh. Helllo! You're back! hello! hello!." +"I missed you! hello!";
    }
    @Override
    public String move(){
        return "Runnnnnnn!";
    }
    public String toString(){
        return "Dog: " + super.toString();
    }
}
