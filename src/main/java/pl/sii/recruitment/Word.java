package pl.sii.recruitment;

public class Word {

    private final String text;

    public Word(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
