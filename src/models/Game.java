package models;

public class Game {
    Ball ball;
    Paddle paddleLeft;
    Paddle paddleRight;
    Score score1;
    Score score2;

    int height = 7;
    int width = 31;

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

    public Paddle getPaddleLeft() {
        return paddleLeft;
    }

    public void setPaddleLeft(Paddle paddleLeft) {
        this.paddleLeft = paddleLeft;
    }

    public Paddle getPaddleRight() {
        return paddleRight;
    }

    public void setPaddleRight(Paddle paddleRight) {
        this.paddleRight = paddleRight;
    }

    public Score getScore1() {
        return score1;
    }

    public void setScore1(Score score1) {
        this.score1 = score1;
    }

    public Score getScore2() {
        return score2;
    }

    public void setScore2(Score score2) {
        this.score2 = score2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String printGame() {

        String result = "/";
        for (int i = 0; i < this.width; i++) {
            result += "-";
        }
        result += "\\\n";

        for (int i = 0; i < this.height; i++) {
            result += "|";
            for (int j = 0; j < this.width; j++) {
                if (j == score1.getXScore() && i == score1.getYScore()) {
                    result += score1.getScore();
                } else if (j == width / 2) {
                    result += "|";
                } else if (j == score2.getXScore() && i == score2.getYScore()) {
                    result += score2.getScore();
                } else if (j == paddleLeft.getXPaddle() && i == paddleLeft.getYPaddle()) {
                    result += "|";
                } else if (j == paddleRight.getXPaddle() && i == paddleRight.getYPaddle()) {
                    result += "|";
                } else if (j == ball.getXDirection() && i == ball.getYDirection()) {
                    result += "O";
                } else {
                    result += " ";

                }
            }
            result += "|\n";

        }
        result+= "\\";
        for (int i = 0; i < this.width; i++) {
            result += "-";
        }
        result+= "/";
        return result;
    }
}
