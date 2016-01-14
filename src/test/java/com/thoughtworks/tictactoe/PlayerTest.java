package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PlayerTest {

    private BufferedReader bufferedReader;

    @Before
    public void setup(){
        bufferedReader = mock(BufferedReader.class);
    }

    @Test
    public void shouldReturnMovePlacementNumberWhenPlayerEntersNumber() throws IOException {
        Player player1 = new Player(bufferedReader, true);

        when(bufferedReader.readLine()).thenReturn("1");

        String userInput = player1.returnMovePlacement();

        assertThat(userInput, is("1"));
    }

    @Test
    public void shouldBePlayer2WhenPlayer1StatusIsFalse() {
        Player player2 = new Player(bufferedReader, false);

        assertThat(player2.isPlayer1(), is(false));
    }
}
