package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MinefieldTest {

    @Test
    void shouldEmptyField(){
        String[] expected = { "0" };
        assertArrayEquals(
                expected,
                new Minesweeper(new String[]{ "." }).getHints()
        );
    }

    @Test
    void shouldShowTallMinefields(){
        String[] expected = { "0", "0", "0" };
        assertArrayEquals(expected, new Minesweeper(new String[]{ ".", ".", "." }).getHints());
    }

    @Test
    void shouldShowWideMinefields(){
        String[] field = { "....", "....", "...." };
        String[] expected = { "0000", "0000", "0000" };
        assertArrayEquals(expected, new Minesweeper(field).getHints());
    }

    @Test
    void shouldShowFullMinefields(){
        String[] field = { "****", "****", "****" };
        String[] expected = { "****", "****", "****" };
        assertArrayEquals(expected, new Minesweeper(field).getHints());
    }

    @Test
    void shouldShowHintOnSameRowAsMine(){
        String[] field = { "..*.." };
        String[] expected = { "01*10" };
        assertArrayEquals(expected, new Minesweeper(field).getHints());
    }

    @Test
    void shouldShowHintOnSameColumnAsMine(){
        String[] field = { ".", ".", "*", ".", "." };
        String[] expected = { "0", "1", "*", "1", "0" };
        assertArrayEquals(expected, new Minesweeper(field).getHints());
    }

    @Test
    void shouldShowHints() {
        String[] field = {
                ".**..",
                "..*..",
                ".**..",
                "...**",
        };
        String[] hint = {
                "1**20",
                "25*30",
                "1**32",
                "123**",
        };

    }
}
