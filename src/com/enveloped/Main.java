package com.enveloped;

import com.enveloped.player.KoopaTroopa;
import com.enveloped.player.Player;

public class Main {

    public static void main(String[] args) {
        Player[] players = new Player[]{new KoopaTroopa()};

        Engine e = new Engine(100, players);
    }
}
