package pl.sii.recruitment;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class NumberTest {

    @Test
    public void shouldParseToInt() {
        Number number = new Number("123");

        int result = number.toInt();

        assertThat(result, CoreMatchers.is(123));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldHandleWrongNumber() {
        Number number = new Number("123a");

        number.toInt();
    }
}
