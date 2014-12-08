package com.enveloped;

public class Engine {
    private final int mGames;
    private final Player[] mPlayers;

//    public static interface Callback{
//        public void onGameStarted(Engine who);
//        public void onPlayerPlayed(Player p, boolean result);
//    }


    public Engine(int gamesCount, Player[] players) {
        mGames = gamesCount;
        mPlayers = players;
    }

    public void play() {

    }

    private static final class Stat {
        private final Player player;
        private int gamesPlayed;
        private int wins;

        public Stat(Player p) {
            this.player = p;
        }

        public void registerGamePlayed(boolean won) {
            gamesPlayed++;
            if (won) {
                wins++;
            }
        }


    }

}
