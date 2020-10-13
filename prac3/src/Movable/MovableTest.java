package Movable;

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0,0,25,45);
        MovableCircle circle = new MovableCircle(-50,-50,45,65,20);
        point.moveDown();
        point.moveLeft();
        point.moveUp();
        point.moveRight();
        circle.moveUp();
        circle.moveLeft();
        circle.moveRight();
        circle.moveDown();
    }
}
