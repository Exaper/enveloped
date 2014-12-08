package com.enveloped.player;

import com.enveloped.data.Envelope;

public abstract class Player {
    public abstract boolean willAcceptFirstEnvelope(Envelope e1, Envelope e2);

    public String getName() {
        return getClass().getSimpleName();
    }
}
