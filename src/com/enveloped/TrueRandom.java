package com.enveloped;

import java.util.Random;

public class TrueRandom extends Random {
    public TrueRandom() {
        super(System.currentTimeMillis());
    }

    public double nextTrueDouble() {
        return nextDouble() * nextInt(Integer.MAX_VALUE);
    }
}
