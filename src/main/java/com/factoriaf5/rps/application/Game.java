package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Lizard;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Spock;

public class Game {
    public Object evaluateGameWinner(Object o1,Object o2){
        return 
        o1 == null?
        null:
        o2 == null?
        null:
        o1 instanceof Scissors && o2 instanceof Paper?
        o1:
        o1 instanceof Scissors && o2 instanceof Lizard?
        o1:
        o1 instanceof Paper && o2 instanceof Rock?
        o1:
        o1 instanceof Paper && o2 instanceof Spock?
        o1:
        o1 instanceof Rock && o2 instanceof Scissors?
        o1:
        o1 instanceof Rock && o2 instanceof Lizard?
        o1:
        o1 instanceof Lizard && o2 instanceof Spock?
        o1:
        o1 instanceof Lizard && o2 instanceof Paper?
        o1:
        o1 instanceof Spock && o2 instanceof Scissors?
        o1:
        o1 instanceof Spock && o2 instanceof Rock?
        o1:
        o2 instanceof Scissors && o1 instanceof Paper?
        o2:
        o2 instanceof Scissors && o1 instanceof Lizard?
        o2:
        o2 instanceof Paper && o1 instanceof Rock?
        o2:
        o2 instanceof Paper && o1 instanceof Spock?
        o2:
        o2 instanceof Rock && o1 instanceof Scissors?
        o2:
        o2 instanceof Rock && o1 instanceof Lizard?
        o2:
        o2 instanceof Lizard && o1 instanceof Spock?
        o2:
        o2 instanceof Lizard && o1 instanceof Paper?
        o2:
        o2 instanceof Spock && o1 instanceof Scissors?
        o2:
        o2 instanceof Spock && o1 instanceof Rock?
        o2:
        null;
    }
}
