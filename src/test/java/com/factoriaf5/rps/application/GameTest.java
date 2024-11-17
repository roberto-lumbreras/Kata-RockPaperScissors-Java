package com.factoriaf5.rps.application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.factoriaf5.rps.models.Lizard;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Spock;

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
    public void o1ScissorsWinsPaper() {
        o1 = new Scissors();
        o2 = new Paper();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o1ScissorsWinsLizard() {
        o1 = new Scissors();
        o2 = new Lizard();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o1RockWinsScissors() {
        o1 = new Rock();
        o2 = new Scissors();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o1RockWinsLizard() {
        o1 = new Rock();
        o2 = new Lizard();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o1PaperWinsRock() {
        o1 = new Paper();
        o2 = new Rock();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o1PaperWinsSpock() {
        o1 = new Paper();
        o2 = new Spock();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o1LizardWinsSpock() {
        o1 = new Lizard();
        o2 = new Spock();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o1LizardWinsPaper() {
        o1 = new Lizard();
        o2 = new Paper();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o1SpockWinsRock() {
        o1 = new Spock();
        o2 = new Rock();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o1SpockWinsScissors() {
        o1 = new Spock();
        o2 = new Scissors();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o2ScissorsWinsPaper() {
        o2 = new Scissors();
        o1 = new Paper();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2ScissorsWinsLizard() {
        o2 = new Scissors();
        o1 = new Lizard();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2RockWinsScissors() {
        o2 = new Rock();
        o1 = new Scissors();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2RockWinsLizard() {
        o2 = new Rock();
        o1 = new Lizard();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2PaperWinsRock() {
        o2 = new Paper();
        o1 = new Rock();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2PaperWinsSpock() {
        o2 = new Paper();
        o1 = new Spock();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2LizardWinsSpock() {
        o2 = new Lizard();
        o1 = new Spock();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2LizardWinsPaper() {
        o2 = new Lizard();
        o1 = new Paper();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2SpockWinsRock() {
        o2 = new Spock();
        o1 = new Rock();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2SpockWinsScissors() {
        o2 = new Spock();
        o1 = new Scissors();
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2ifO1isNotWinnerAndO2isNotWinner_ThereIsADraw() {
        o1 = new Paper();
        o2 = new Paper();
        winner = game.evaluateGameWinner(o1, o2);
        assertTrue(null == winner);
    }

    @Test
    public void o2ifAnyHandIsNull_thereIsNoWinner() {
        o2 = new Paper();
        winner = game.evaluateGameWinner(o1, o2);
        assertTrue(null == winner);
        o1 = new Paper();
        o2 = null;
        winner = game.evaluateGameWinner(o1, o2);
        assertTrue(null == winner);
    }
}
