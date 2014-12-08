package com.enveloped.data;

public class SecureEnvelope extends Envelope {

    public SecureEnvelope(double x) {
        super(x);
    }

    @Override
    public double getNumber() {
        throw new SecurityException("Not allowed to extract number from secure envelope. Use MD5!");
    }
}
