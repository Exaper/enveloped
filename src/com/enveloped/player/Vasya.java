package com.enveloped.player;

import com.enveloped.TrueRandom;
import com.enveloped.data.Envelope;

import java.util.Random;

public class Vasya extends Player{
    private final Random mRandom = new TrueRandom();

    @Override
    public boolean willAcceptFirstEnvelope(Envelope e1, Envelope e2) {
        return mRandom.nextBoolean();
    }
}
