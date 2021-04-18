package controller;

import models.Game;

public interface ControllerInterface {
    public Game getGame();

    /**
     * return the value of game of the class Game
     */

    public String getStatueMessage();

    /**
     * return the String value of the StatusMessage
     */

    public void PaddleLeftUp();

    /**
     * let the paddleLeft moves up
     */

    public void PaddleLeftDown();

    /**
     * let the paddleLeft moves down
     */

    public void PaddleRightUp();

    /**
     * let the paddleRight moves up
     */

    public void PaddleRightDown();

    /**
     * let the paddleRight moves down
     */

    public void PaddleMove();
    /**
     * call the scanner and switch four cases of the direction of the paddle
     */
    public void ballRight();
    /**
     * let the ball moves Right and Up at the same Time
     */
    public void ballLeft();
    /**
     * Let the ball moves Left and Down at the same Time
     */
}
