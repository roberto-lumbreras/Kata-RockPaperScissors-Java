package com.factoriaf5.rps.factories;

import com.factoriaf5.rps.models.Move;
import com.factoriaf5.rps.models.Paper;

public class PaperFactory implements MoveFactory{

    @Override
    public Move createMove() {
        return new Paper();
    }
    
}
