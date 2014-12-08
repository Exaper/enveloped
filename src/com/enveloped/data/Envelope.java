package com.enveloped.data;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Envelope {
    private final double mNumber;
    private String mMD5;

    public Envelope(double x) {
        mNumber = x;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(Double.toHexString(x).getBytes());
            mMD5 = new String(md.digest());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public double getNumber() {
        return mNumber;
    }

    public String getMD5() {
        return mMD5;
    }
}
