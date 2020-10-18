package com.javarush.games.snake;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    private List<GameObject> snakeParts = new ArrayList<>();
    private Direction direction = Direction.LEFT;
    public boolean isAlive = true;

    public void setDirection(Direction direction) {
        switch (direction) {
            case UP:
                if (!this.direction.equals(Direction.DOWN)) {
                    this.direction = direction;
                }
                break;
            case DOWN:
                if (!this.direction.equals(Direction.UP)) {
                    this.direction = direction;
                }
                break;
            case LEFT:
                if (!this.direction.equals(Direction.RIGHT)) {
                    this.direction = direction;
                }
                break;
            case RIGHT:
                if (!this.direction.equals(Direction.LEFT)) {
                    this.direction = direction;
                }
                break;
            default:
                break;
        }
    }

    public Snake(int x, int y) {
        snakeParts.add(new GameObject(x, y));
        snakeParts.add(new GameObject(x + 1, y));
        snakeParts.add(new GameObject(x + 2, y));
    }

    public void draw(Game game) {
        Color currentColor = this.isAlive ? Color.BLACK : Color.RED;

        game.setCellValueEx(snakeParts.get(0).x, snakeParts.get(0).y, Color.NONE, HEAD_SIGN, currentColor, 75);

        for (int i = 1; i < snakeParts.size(); i++) {
            game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, currentColor, 75);
        }
    }

    public void move(Apple apple) {
        GameObject newHead = createNewHead();
        if (newHead.x == apple.x && newHead.y == apple.y) {
            apple.isAlive = false;
        } else {
            removeTail();
        }
    }

    public GameObject createNewHead() {
        GameObject newObject;

        switch (direction) {
            case UP:
                newObject = new GameObject(snakeParts.get(0).x, snakeParts.get(0).y - 1);
                break;
            case DOWN:
                newObject = new GameObject(snakeParts.get(0).x, snakeParts.get(0).y + 1);
                break;
            case LEFT:
                newObject = new GameObject(snakeParts.get(0).x - 1, snakeParts.get(0).y);
                break;
            case RIGHT:
                newObject = new GameObject(snakeParts.get(0).x + 1, snakeParts.get(0).y);
                break;
            default:
                throw new IllegalStateException();
        }
        return newObject;
    }

    public void removeTail() {
        snakeParts.remove(snakeParts.size() - 1);
    }
}
