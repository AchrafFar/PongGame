package models;

public class Score implements ScoreInterface{
    int Score;
    int XScore;
    int YScore;
    public Score (int Score, int XScore, int YScore) {
        this.Score = Score;
        this.XScore = XScore;
        this.YScore = YScore;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    public int getXScore() {
        return XScore;
    }

    public void setXScore(int XScore) {
        this.XScore = XScore;
    }

    public int getYScore() {
        return YScore;
    }

    public void setYScore(int YScore) {
        this.YScore = YScore;
    }
}
