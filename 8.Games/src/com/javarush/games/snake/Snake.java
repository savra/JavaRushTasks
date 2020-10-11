package com.javarush.games.snake;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    private List<GameObject> snakeParts = new ArrayList<>();

    public Snake(int x, int y) {
        snakeParts.add(new GameObject(x, y));
        snakeParts.add(new GameObject(x + 1, y));
        snakeParts.add(new GameObject(x + 2, y));
    }

    public void draw(Game game) {
        game.setCellValue(snakeParts.get(0).x, snakeParts.get(0).y, HEAD_SIGN);

        for (int i = 1; i < snakeParts.size(); i++) {
                game.setCellValue(snakeParts.get(i).x, snakeParts.get(i).y, BODY_SIGN);
        }
    }
}
