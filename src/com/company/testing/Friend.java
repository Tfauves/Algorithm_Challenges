package com.company.testing;

public class Friend extends Acquaintance{
    private String homeTown;

    public Friend (){};

    public Friend(String name) {
        super(name);
    }

    public Friend(String name, String homeTown) {
        super(name);
        this.homeTown = homeTown;
    }


    public void getStatus() {
        System.out.println(getName() + " is a friend and they are from " + homeTown + "\n");
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }
}
