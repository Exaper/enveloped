package com.enveloped;

import com.enveloped.player.KoopaTroopa;
import com.enveloped.player.Player;
import com.enveloped.player.Vasya;

public class Main {

    public static void main(String[] args) {
        Player[] players = new Player[]{new Vasya(), new KoopaTroopa()};

        Engine e = new Engine(10000, players);
        e.play();
    }
}
