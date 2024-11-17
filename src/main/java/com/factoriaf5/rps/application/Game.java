package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Move;

public class Game {
    public Move evaluateGameWinner(Move o1,Move o2){
        return o1==null||o2==null?
        null:
        o1.beats(o2)?
        o1:
        o2.beats(o1)?
        o2:
        null;
    }
}
