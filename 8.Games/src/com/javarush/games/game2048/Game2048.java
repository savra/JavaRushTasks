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
                setCellColoredNumber(i, j, gameField[j][i]);
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

    private Color getColorByValue(int value) {
        Color result = Color.NONE;

        switch (value) {
            case 2: result = Color.ALICEBLUE; break;
            case 4: result = Color.ANTIQUEWHITE; break;
            case 8: result = Color.AQUA; break;
            case 16: result = Color.AQUAMARINE; break;
            case 32: result = Color.AZURE; break;
            case 64: result = Color.BEIGE; break;
            case 128: result = Color.BISQUE; break;
            case 256: result = Color.BLUE; break;
            case 512: result = Color.BLUEVIOLET; break;
            case 1024: result = Color.CORAL; break;
            case 2048: result = Color.CRIMSON; break;
            default: break;
        }

        return result;
    }

    private void setCellColoredNumber(int x, int y, int value) {
        setCellValueEx(x, y, getColorByValue(value), value == 0 ? "" : String.valueOf(value));
    }
}
