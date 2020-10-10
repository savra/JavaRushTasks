package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;

    private void createGame() {
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                gameField[i][j] = new GameObject(j, i, (1 / (getRandomNumber(10) + 1)) == 1);

                if (gameField[i][j].isMine)
                    countMinesOnField++;

                setCellColor(i, j, Color.CORNFLOWERBLUE);
            }
        }
    }

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }
}
