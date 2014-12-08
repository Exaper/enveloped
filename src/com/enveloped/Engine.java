package com.enveloped;

import com.enveloped.data.Envelope;
import com.enveloped.data.SecureEnvelope;
import com.enveloped.player.Player;

import java.util.Random;

public class Engine {
    private final double mGames;
    private final Stat[] mStats;
    private final TrueRandom mRandom;

    public Engine(double gamesCount, Player[] players) {
        mGames = gamesCount;
        mStats = new Stat[players.length];
        for (int i = 0; i < players.length; i++) {
            mStats[i] = new Stat(players[i]);
        }
        mRandom = new TrueRandom();
    }

    public void play() {
        System.out.println("Starting the game...");
        for (double gameNumber = 0; gameNumber < mGames; gameNumber++) {
            double x1 = mRandom.nextTrueDouble();
            double x2 = mRandom.nextTrueDouble();
            System.out.println("X1 = " + x1 + "\nX2 = " + x2);
            for (Stat stat : mStats) {
                Player targetPlayer = stat.getPlayer();
                System.out.println("Playing with Player " + targetPlayer.getName());
                // TODO x1 should NEVER be == x2
                boolean playerAcceptedNumber = targetPlayer.willAcceptFirstEnvelope(new Envelope(x1), new SecureEnvelope(x2));
                System.out.println("Player " + (playerAcceptedNumber ? "accepted" : "rejected") + " the first number");
                boolean won = (playerAcceptedNumber && x1 > x2) || (!playerAcceptedNumber && x2 > x1);
                System.out.println("Player " + (won ? "wins" : "loses"));
                stat.registerGamePlayed(won);
            }
        }
        System.out.println("Game over. Results for " + (int) mGames + " games played");
        for (Stat stat : mStats) {
            Player targetPlayer = stat.getPlayer();
            System.out.println("Player " + targetPlayer.getName());
            System.out.println("Wins: " + stat.getWins());
            System.out.println("Success rate : " + 100 * stat.getWins() / stat.getGamesPlayed() + "%");
        }
    }

    private static final class Stat {
        private final Player mPlayer;
        private double mGamesPlayed;
        private double mWins;

        public Stat(Player p) {
            this.mPlayer = p;
        }

        public void registerGamePlayed(boolean won) {
            mGamesPlayed++;
            if (won) {
                mWins++;
            }
        }

        public Player getPlayer() {
            return mPlayer;
        }

        public double getGamesPlayed() {
            return mGamesPlayed;
        }

        public double getWins() {
            return mWins;
        }
    }

}
