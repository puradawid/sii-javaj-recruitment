package pl.sii.recruitment;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SentenceParserTest {

    @Test
    public void shouldResponseWithSingleSentenceAndWord() {
        SentenceParser parser = new SentenceParser("Single.");

        List<Sentence> sentences = parser.toSentences();

        assertThat(sentences.size(), CoreMatchers.is(1));
        assertThat(sentences.get(0), CoreMatchers.is(new Sentence(Arrays.asList(new Word("Single")))));
    }

    @Test
    public void shouldResponseWithTwoWordSentence() {
        SentenceParser parser = new SentenceParser("Single sentence.");

        List<Sentence> sentences = parser.toSentences();

        assertThat(sentences.size(), CoreMatchers.is(1));
        assertThat(sentences.get(0).toWords().size(), CoreMatchers.is(2));
        assertThat(sentences.get(0).toWords().get(0).toString(), CoreMatchers.is("Single"));
    }

    @Test
    public void shouldResponseWithNumber() {
        SentenceParser parser = new SentenceParser("Sentence number 3.");

        List<Sentence> sentences = parser.toSentences();

        assertThat(sentences.size(), CoreMatchers.is(1));
        assertThat(sentences.get(0).toWords().get(2), CoreMatchers.instanceOf(Number.class));
    }
}
