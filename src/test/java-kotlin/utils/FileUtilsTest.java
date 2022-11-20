package utils;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class FileUtilsTest {

    @Test
    void testUseLines() {
        final var toString = FileUtils.useLines("input/iotest.txt", s -> s.collect(Collectors.joining()));
        assertEquals("hallo dit is een test", toString);
    }
}
