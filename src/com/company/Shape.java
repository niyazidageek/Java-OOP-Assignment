package com.company;

public abstract class Shape implements Measurable {
    Shape(String name){
        this.name=name;
    }

    String type;
    String name;

    String getName(){
        return name;
    }

    String getType(){
        return type;
    }

    void setName(String name){
        this.name = name;
    }

    void setType(String type){
        this.type = type;
    }

    public String toString(){
        return String.format("%s: %s", type, name);
    }
}
