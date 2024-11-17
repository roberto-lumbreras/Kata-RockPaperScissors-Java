package com.factoriaf5.rps.models;

public class Scissors implements Move{

    @Override
    public boolean beats(Move m) {
        return m instanceof Lizard || m instanceof Paper;
    }
    
}
