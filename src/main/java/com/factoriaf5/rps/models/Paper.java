package com.factoriaf5.rps.models;

public class Paper implements Move{

    @Override
    public boolean beats(Move m) {
        return m instanceof Rock || m instanceof Spock;
    }
    
}
