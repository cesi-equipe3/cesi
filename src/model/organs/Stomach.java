package model.organs;


public class Stomach implements Organ{
    /**
     * Return the current food amount in the stomach
     * @return
     */
    public int getCurrentFoodAmount() {
        return 10;
    }

    /**
     * Return the maximum amount of food this stomach can handle
     * @return
     */
    public int getMaxFoodAmount() {
        throw new UnsupportedOperationException();
    }

    /**
     * Return the amount of food that this stomach will digest each day
     * @return
     */
    public int getDigestionSpeed() {
        throw new UnsupportedOperationException();
    }

    /**
     * Return a boolean to say if the stomach is full.
     * isFull() <=> getCurrentFoodAmount() == getMaxFoodAmount()
     * @return
     */
    public boolean isFull() {
        throw new UnsupportedOperationException();
    }

    /**
     * Put a specific amount of food into this stomach.
     * @param quantity
     */
    public void fill(int quantity) {
        throw new UnsupportedOperationException();
    }

    /**
     * Consumes one unit of food.
     */
    public void digest() {
        throw new UnsupportedOperationException();
    }

    /**
     * Set the amount of food that this stomach will digest each day
     * @return
     */
    public void setDigestionSpeed() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void spendADay() {
        throw new UnsupportedOperationException();
    }
}
