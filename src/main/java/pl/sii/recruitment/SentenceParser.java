package pl.sii.recruitment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SentenceParser {

    private final String input;

    public SentenceParser(String input) {
        this.input = input;
    }

    public List<Sentence> toSentences() {
        List<Sentence> result = new LinkedList<Sentence>();
        String[] sentences = input.split("\\.");
        for (int i = 0; i < sentences.length; i++) {
            String sentenceText = sentences[i];
            String[] wordsText = sentenceText.split(" ");
            List<Word> words = new ArrayList<>(1);
            for (int j = 0; j < wordsText.length; j++) {
                words.add(new Word(wordsText[i]));
            }
            result.add(new Sentence(words));
        }
        return result;
    }

}
