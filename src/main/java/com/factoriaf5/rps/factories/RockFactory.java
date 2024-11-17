package com.factoriaf5.rps.factories;

import com.factoriaf5.rps.models.Move;
import com.factoriaf5.rps.models.Rock;

public class RockFactory implements MoveFactory{

    @Override
    public Move createMove() {
        return new Rock();
    }
    
}
