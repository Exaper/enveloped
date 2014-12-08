package com.enveloped.player;

import com.enveloped.data.Envelope;

import java.util.Random;

/**
 * Created by paul on 12/7/14.
 */
public class Baraka extends Player {

    @Override
    public boolean willAcceptFirstEnvelope(Envelope e1, Envelope e2) {

        double firstNumber = e1.getNumber();
        Envelope e3 = new Envelope(firstNumber);
        Envelope selected = selectRandomEnvelope(e3, e2);
        if (selected.equals(e3))
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    private Envelope selectRandomEnvelope (Envelope e3, Envelope e2){
       return new Random().nextBoolean() ? e3 : e2;

    }
}







