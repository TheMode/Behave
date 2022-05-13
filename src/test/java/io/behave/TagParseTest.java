package io.behave;

import org.junit.jupiter.api.Test;

public class TagParseTest {
    @Test
    public void testTagParse() {
        var behavior = Behavior.parse("tag()");
    }
}
