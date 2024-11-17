package com.factoriaf5.rps.application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.factoriaf5.rps.factories.LizardFactory;
import com.factoriaf5.rps.factories.MoveFactory;
import com.factoriaf5.rps.factories.PaperFactory;
import com.factoriaf5.rps.factories.RockFactory;
import com.factoriaf5.rps.factories.ScissorsFactory;
import com.factoriaf5.rps.factories.SpockFactory;
import com.factoriaf5.rps.models.Lizard;
import com.factoriaf5.rps.models.Move;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Spock;

public class GameTest {

    Move winner;
    Move o1;
    Move o2;
    Game game = new Game();
    Paper paper;
    Rock rock;
    Spock spock;
    Lizard lizard;
    Scissors scissors;

    @BeforeEach
    public void beforeEach(){
        MoveFactory moveFactory;
        moveFactory = new PaperFactory();
        paper = ((Paper)moveFactory.createMove());
        moveFactory = new RockFactory();
        rock = ((Rock)moveFactory.createMove());
        moveFactory = new ScissorsFactory();
        scissors = ((Scissors)moveFactory.createMove());
        moveFactory = new LizardFactory();
        lizard = ((Lizard)moveFactory.createMove());
        moveFactory = new SpockFactory();
        spock = ((Spock)moveFactory.createMove());
        winner = null;
        o1 = null;
        o2 = null;
    }

    @Test
    public void o1ScissorsWinsPaper() {
        o1 = scissors;
        o2 = paper;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o1ScissorsWinsLizard() {
        o1 = scissors;
        o2 = lizard;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o1RockWinsScissors() {
        o1 = rock;
        o2 = scissors;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o1RockWinsLizard() {
        o1 = rock;
        o2 = lizard;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o1PaperWinsRock() {
        o1 = paper;
        o2 = rock;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o1PaperWinsSpock() {
        o1 = paper;
        o2 = spock;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o1LizardWinsSpock() {
        o1 = lizard;
        o2 = spock;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o1LizardWinsPaper() {
        o1 = lizard;
        o2 = paper;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o1SpockWinsRock() {
        o1 = spock;
        o2 = rock;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o1SpockWinsScissors() {
        o1 = spock;
        o2 = scissors;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o1, winner);
    }

    @Test
    public void o2ScissorsWinsPaper() {
        o2 = scissors;
        o1 = paper;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2ScissorsWinsLizard() {
        o2 = scissors;
        o1 = lizard;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2RockWinsScissors() {
        o2 = rock;
        o1 = scissors;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2RockWinsLizard() {
        o2 = rock;
        o1 = lizard;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2PaperWinsRock() {
        o2 = paper;
        o1 = rock;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2PaperWinsSpock() {
        o2 = paper;
        o1 = spock;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2LizardWinsSpock() {
        o2 = lizard;
        o1 = spock;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2LizardWinsPaper() {
        o2 = lizard;
        o1 = paper;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2SpockWinsRock() {
        o2 = spock;
        o1 = rock;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2SpockWinsScissors() {
        o2 = spock;
        o1 = scissors;
        winner = game.evaluateGameWinner(o1, o2);
        assertEquals(o2, winner);
    }

    @Test
    public void o2ifO1isNotWinnerAndO2isNotWinner_ThereIsADraw() {
        o1 = paper;
        o2 = paper;
        winner = game.evaluateGameWinner(o1, o2);
        assertTrue(null == winner);
    }

    @Test
    public void o2ifAnyHandIsNull_thereIsNoWinner() {
        o2 = paper;
        winner = game.evaluateGameWinner(o1, o2);
        assertTrue(null == winner);
        o1 = paper;
        o2 = null;
        winner = game.evaluateGameWinner(o1, o2);
        assertTrue(null == winner);
    }
}
