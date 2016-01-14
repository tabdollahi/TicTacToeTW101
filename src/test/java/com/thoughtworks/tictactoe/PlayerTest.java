package com.thoughtworks.tictactoe;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PlayerTest {

    @Test
    public void shouldReturnMovePlacementNumberWhenPlayerEntersNumber() throws IOException {
        BufferedReader bufferedReader = mock(BufferedReader.class);
        Player player1 = new Player(bufferedReader);

        when(bufferedReader.readLine()).thenReturn("1");

        String userInput = player1.returnMovePlacement();

        assertThat(userInput, is("1"));
    }
}
