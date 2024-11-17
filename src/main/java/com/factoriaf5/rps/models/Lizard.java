package com.factoriaf5.rps.models;

public class Lizard implements Move{

    @Override
    public boolean beats(Move m) {
        return m instanceof Paper || m instanceof Spock;
    }
    
}
