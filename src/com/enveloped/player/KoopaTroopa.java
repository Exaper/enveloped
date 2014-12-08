package com.enveloped.player;

import com.enveloped.TrueRandom;
import com.enveloped.data.Envelope;

public class KoopaTroopa extends Player {
    private final TrueRandom mRandom;

    public KoopaTroopa() {
        mRandom = new TrueRandom();
    }

    @Override
    public boolean willAcceptFirstEnvelope(Envelope e1, Envelope e2) {
        boolean numberAccepted;
        double p1 = mRandom.nextTrueDouble();
        double p2 = mRandom.nextTrueDouble();
        if (p1 > p2) {
            double tmp = p2;
            p2 = p1;
            p1 = tmp;
        }
        double x = e1.getNumber();
        if (x < p1) {
            numberAccepted = false;
        } else if (x > p2) {
            numberAccepted = true;
        } else {
            double mid = p1 + (p2 - p1) / 2;
            if (x < mid) {
                numberAccepted = false;
            } else {
                numberAccepted = true;
            }
        }

        return numberAccepted;
    }
}
