package models;

public class Paddle implements PaddleInterface {
    int XPaddle;
    int YPaddle;

    public Paddle(int XPaddle, int YPaddle) {
        this.XPaddle = XPaddle;
        this.YPaddle = YPaddle;
    }

    public int getXPaddle() {
        return this.XPaddle;
    }

    public int getYPaddle() {
        return this.YPaddle;
    }

    public void setXPaddle(int XPaddle) {
        this.XPaddle = XPaddle;
    }

    public void setYPaddle(int YPaddle) {
        this.YPaddle = YPaddle;
    }
}
