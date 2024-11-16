package com.factoriaf5.rps.application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

public class GameTest {

    Object winner;
    Object o1;
    Object o2;
    Game game = new Game();

    @BeforeEach
    public void setup(){
        winner = null;
        o1 = null;
        o2 = null;
    }

    @Test
    public void ScissorsWinsPaper() {
        o1 = new Scissors();
        o2 = new Paper();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void RockWinsScissors() {
        o1 = new Rock();
        o2 = new Scissors();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void PaperWinsRock() {
        o1 = new Paper();
        o2 = new Rock();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void sameHandCausesDraw() {
        o1 = new Paper();
        o2 = new Paper();
        assertTrue(game.evaluateGameWinner(o1, o2)==null);
    }

    @Test
    public void ifO1isNotWinnerAndThereIsNoDraw_O2Wins() {
        o1 = new Rock();
        o2 = new Paper();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void ifAnyHandIsNull_thereIsNoWinner() {
        o2 = new Paper();
        winner = game.evaluateGameWinner(o1, o2);
        assertTrue(null == winner);
        o1 = new Paper();
        o2 = null;
        winner = game.evaluateGameWinner(o1, o2);
        assertTrue(null == winner);
    }
}
