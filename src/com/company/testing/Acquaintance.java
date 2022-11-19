package com.company.testing;

public class Acquaintance {

    private String name;

    public Acquaintance() {}

    public Acquaintance(String name) {
        this.name = name;
    }

    public void getStatus(){
        System.out.println(name + " is just an acquaintance\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
