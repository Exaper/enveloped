package com.enveloped;

public class Engine {
    private final double mGames;
    private final Stat[] mStats;

//    public static interface Callback{
//        public void onGameStarted(Engine who);
//        public void onPlayerPlayed(Player p, boolean result);
//    }


    public Engine(double gamesCount, Player[] players) {
        mGames = gamesCount;
        mStats = new Stat[players.length];
        for (int i = 0; i < players.length; i++) {
            mStats[i] = new Stat(players[i]);
        }

    }

    public void play() {

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
