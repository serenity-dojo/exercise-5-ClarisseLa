package com.serenitydojo;

public class Hamster extends Pet {
    private String name;
    private String favoriteGame;
    private int age;

    public Hamster(String name, String favoriteGame, int age) {
        super(name,age);
        this.favoriteGame = favoriteGame;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String play() {
        return "runs in wheel";
    }

    public void setAge(int age) {
        this.age = age;

    }
    public String getFavoriteGame() {
        return favoriteGame;
    }

    public void setFavoriteGame(String favoriteGame) {
        this.favoriteGame = favoriteGame;

    }
}
