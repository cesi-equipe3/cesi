package model.enums;


public enum Film {
    BEFORE_I_WAKE(Mood.AFRAID),
    RRRRRRR(Mood.BORED),
    FORREST_GUMP(Mood.CHEERFUL),
    TITANIC(Mood.SAD);

    private Mood associatedMood;

    private Film(Mood associatedMood) {
        this.associatedMood = associatedMood;
    }

    public Mood getAssociatedMood() {
        return this.associatedMood;
    }
}
