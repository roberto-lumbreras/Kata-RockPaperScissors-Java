package com.factoriaf5.rps.factories;

import com.factoriaf5.rps.models.Move;
import com.factoriaf5.rps.models.Spock;

public class SpockFactory implements MoveFactory{

    @Override
    public Move createMove() {
        return new Spock();
    }
    
}
