package Ball;

public class Ball {
    private String color;
    private int size;
    private String sport;

    public Ball(String n, int a, String s) {
        color = n;
        size = a;
        sport = s;
    }

    public Ball(String n, String s) {
        color = n;
        size = 0;
        sport = s;
    }

    public Ball() {
        color = "Rainbow";
        size = 0;
        sport = "Hockey";
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getSport() {
        return sport;
    }

    public String toString() {
        return this.color + " colored ball, size " + this.size;
    }

    public void intoCM() {
        System.out.println(color + " colored ball size is " + size*2.5*2 + " cm.");
    }

    public void outSport() {
        System.out.println(color + " colored ball is for " + sport);
    }
}
