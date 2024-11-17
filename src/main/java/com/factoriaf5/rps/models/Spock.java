package com.factoriaf5.rps.models;

public class Spock implements Move{

    @Override
    public boolean beats(Move m) {
        return m instanceof Rock || m instanceof Scissors;
    }
    
}
