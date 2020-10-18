package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

import java.util.Arrays;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame() {
        createNewNumber();
        createNewNumber();
    }

    private void drawScene() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                setCellColor(i, j, Color.ALICEBLUE);
            }
        }
    }

    private void createNewNumber() {
        int x, y;

        do {
            x = getRandomNumber(SIDE);
            y = getRandomNumber(SIDE);
        }
        while (gameField[x][y] != 0);

        gameField[x][y] = getRandomNumber(10) == 9 ? 4 : 2;
    }
}
