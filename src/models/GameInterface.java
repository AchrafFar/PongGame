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
    public Paddle getPaddleLeft();

    /**
     * return the value of the paddleLeft of the class Paddle
     */
    public void setPaddleLeft(Paddle paddleLeft);

    /**
     * set the value of the paddleLeft
     */
    public Paddle getPaddleRight();
    /**
     * return the value of the paddleRight of the class Paddle
     */
    public void setPaddleRight(Paddle paddleRight);
    /**
     * set the value of the paddleRight
     */
    public Score getScore1();
    /**
     * return the value of the Score1 of the class Score
     */
    public void setScore1(Score score1);
    /**
     * set the value of the Score1
     */
    public Score getScore2();
    /**
     * return the value of the Score2 of the class Score
     */
    public void setScore2(Score score2);

    /**
     *
     * set the value of the Score2
     */
    public int getHeight();

    /**
     * return the integer value of Height
     *
     */

    public void setHeight(int height);

    /**
     * set the integer value of the height
     *
     */

    public int getWidth();

    /**
     * return the integer value of the width
     *
     */

    public void setWidth(int width);

    /**
     * set the integer value of the width
     *
     */

    public String printGame();
    /**
     * return the String value of the result. the variable result use for loops and if else for drawing the Game
     */
}
