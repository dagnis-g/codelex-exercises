package io.codelex.parbaudesDarbs.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinerTest {
    Joiner joiner = new Joiner("-");

    @Test
    void shouldJoinCorrectly() {
        String result = joiner.join(1, 2, 2);
        String expected = "1-2-2";
        Assertions.assertEquals(expected, result);
    }
}
