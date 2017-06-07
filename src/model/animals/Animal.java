package model.animals;


import model.enums.Film;
import model.organs.Brain;
import model.organs.Heart;
import model.organs.Stomach;

public interface Animal {

    int getLifeExpectency();
    boolean isAlive();
    void die();
    void feed(int foodAmount);
    void watchAFilm(Film film);
    void spendADay();
}
