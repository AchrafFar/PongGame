package controller;

import models.Game;
import models.Messages;
import java.util.Scanner;

public class Controller implements ControllerInterface {
    Game game;
    String statueMessage;

    Scanner scanner = new Scanner(System.in);

    public Controller(Game game) {
        this.game = game;
        this.statueMessage = Messages.WELCOME_MESSAGE;
    }

    public Game getGame() {
        return game;
    }

    public String getStatueMessage() {
        return statueMessage;
    }

    public void PaddleLeftUp() {
        this.game.getPaddleLeft().setYPaddle(this.game.getPaddleLeft().getYPaddle() - 1);
    }

    public void PaddleLeftDown() {
        this.game.getPaddleLeft().setYPaddle(this.game.getPaddleLeft().getYPaddle() + 1);
    }

    public void PaddleRightUp() {
        this.game.getPaddleRight().setYPaddle(this.game.getPaddleRight().getYPaddle() - 1);
    }

    public void PaddleRightDown() {
        this.game.getPaddleRight().setYPaddle(this.game.getPaddleRight().getYPaddle() + 1);
    }

    public void PaddleMove() {
        String direction = scanner.next();
        switch (direction) {
            case "LU":
                PaddleLeftUp();
                break;
            case "LD":
                PaddleLeftDown();
                break;
            case "RU":
                PaddleRightUp();
                break;
            case "RD":
                PaddleRightDown();
                break;
            default:
                System.out.println("chose only LU, LD, RU or RD");
        }
    }

}
