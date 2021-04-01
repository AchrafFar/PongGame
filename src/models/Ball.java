package models;

public class Ball implements BallInterface {
    int XDirection;
    int YDirection;

    public Ball(int XDirection, int YDirection) {
        this.XDirection = XDirection;
        this.YDirection = YDirection;
    }

    public int getXDirection() {
        return this.XDirection;
    }

    public int getYDirection() {
        return this.YDirection;
    }

    public void setXDirection(int XDirection) {
        this.XDirection = XDirection;
    }

    public void setYDirection(int YDirection) {
        this.YDirection = YDirection;
    }

}

