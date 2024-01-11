package com.mafia;



public class MafiaGame {
    public static void main(String[] args) {
        Game gameManager = new Game();
        gameManager.initializePlayers();
        gameManager.startGame();
    }
}