package com.company.testing;



public class BestFriend extends Friend{

    String favoriteSong;

    public BestFriend(){};

    public BestFriend(String name, String homeTown, String favoriteSong) {
        super(name, homeTown);
        this.favoriteSong = favoriteSong;
    }

    public void getStatus(String name, String homeTown, String favoriteSong) {
        System.out.println(name + " is a friend and they are from " + homeTown + " and their favorite song is " + favoriteSong + "\n");
    }

    public String getFavoriteSong() {
        return favoriteSong;
    }

    public void setFavoriteSong(String favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
}
