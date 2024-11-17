package com.factoriaf5.rps.factories;

import com.factoriaf5.rps.models.Lizard;
import com.factoriaf5.rps.models.Move;

public class LizardFactory implements MoveFactory{

    @Override
    public Move createMove() {
        return new Lizard();
    }
    
}
