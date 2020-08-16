package com.company.engine;

import com.company.engine.Player.BlackPlayer;
import com.company.engine.Player.Player;
import com.company.engine.Player.WhitePlayer;

public enum Alliance {
    WHITE {
        @Override
        public int getDirection() {
            return -1;
        }

        @Override
        public boolean isBlack() {
            return false;
        }

        @Override
        public boolean isWhite() {
            return true;
        }

        @Override
        public Player choosePlayer(WhitePlayer whitePlayer, BlackPlayer blackPlayer) {
            return whitePlayer;
        }
    },
    BLACK {
        @Override
        public int getDirection() {
            return 1;
        }

        @Override
        public boolean isBlack() {
            return true;
        }

        @Override
        public boolean isWhite() {
            return false;
        }

        @Override
        public Player choosePlayer(WhitePlayer whitePlayer, BlackPlayer blackPlayer) {
            return blackPlayer;
        }
    };

    public abstract int getDirection();

    public abstract boolean isBlack();

    public abstract boolean isWhite();

    public abstract Player choosePlayer(WhitePlayer whitePlayer, BlackPlayer blackPlayer);
}