package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinefieldTest {

    @Test
    void shouldEmptyField(){
        String[] expected = { "0" };
        assertArrayEquals(new Minesweeper(new String[]{ "." }).getHints(), expected);
    }

    @Test
    void shouldShowTallMinefields(){
        String[] expected = { "0", "0", "0" };
        assertArrayEquals(new Minesweeper(new String[]{ ".", ".", "." }).getHints(), expected);
    }
}
