package model.organs;


import model.enums.Mood;

public class Brain implements Organ {

    public int getMentalHealth() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void spendADay() {
        throw new UnsupportedOperationException();
    }

    public Mood getCurrentMood() {
        throw new UnsupportedOperationException();
    }

    public void setCurrentMood() {

    }
}
