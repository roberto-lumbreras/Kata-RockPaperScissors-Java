package com.factoriaf5.rps.factories;

import com.factoriaf5.rps.models.Move;
import com.factoriaf5.rps.models.Scissors;

public class ScissorsFactory implements MoveFactory{

    @Override
    public Move createMove() {
        return new Scissors();
    }
    
}
