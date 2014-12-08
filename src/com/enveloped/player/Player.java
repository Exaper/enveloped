package com.enveloped.player;

public abstract class Player {
    public abstract boolean acceptNumber(double x);

    public String getName() {
        return getClass().getSimpleName();
    }
}
