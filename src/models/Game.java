package models;

public class Game {
    Ball ball;
    Paddle paddleLeft;
    Paddle paddleRight;
    Score score1;
    Score score2;

    int height = 7;
    int width = 30;

    public Game() {
        this.ball = new Ball(2, height/2);
        this.paddleLeft = new Paddle(0, height/2);
        this.paddleRight = new Paddle(width - 1, height/2);
        this.score1 = new Score(0, (width / 2) - 1, 0);
        this.score2 = new Score(0, (width / 2) + 1, 0);
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Paddle getPaddle() {
        return paddleLeft;
    }

    public void setPaddle(Paddle paddle) {
        this.paddleLeft = paddle;
    }
}
