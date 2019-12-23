package pl.sii.recruitment;

import java.util.List;

public class Sentence {

    private final List<Word> words;

    public Sentence(List<Word> words) {
        this.words = words;
    }

    public List<Word> toWords() {
        return words;
    }

}
