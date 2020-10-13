package Shape_Extenders;

public class Circle extends Shape{
    protected double radius;

    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public String toString() {
        return "Shape: Circle, radius: "+this.radius+", color: "+this.color+", filled: "+this.filled;
    }
}
