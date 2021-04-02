package models;

public interface GameInterface {
    public Ball getBall();

    /**
     * return the ball of the class Ball
     */

    public void setBall(Ball ball);

    /**
     * set the value of the ball
     */
    public Paddle getPaddle();

    /**
     * return the paddle of the class Paddle
     */
    public void setPaddle(Paddle paddle);

    /**
     * set the value of the paddle
     */
}
