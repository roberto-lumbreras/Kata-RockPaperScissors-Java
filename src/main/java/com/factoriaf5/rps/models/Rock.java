package com.factoriaf5.rps.models;

public class Rock implements Move{

    @Override
    public boolean beats(Move m) {
        return m instanceof Scissors || m instanceof Lizard;
    }
    
}
