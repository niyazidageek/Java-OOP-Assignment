package com.company;

public abstract class Shape implements Measurable {
    private String name;
    private String type;

    public Shape(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setType(String type){
        this.type = type;
    }

    public String toString(){
        return String.format("%s: %s", type, name);
    }
}
