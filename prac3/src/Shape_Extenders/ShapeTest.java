package Shape_Extenders;

public class ShapeTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.4,"Cyan",false);
        c1.setRadius(6.7);
        c1.setColor("Purple");
        c1.setFilled(true);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());


        Rectangle r1 = new Rectangle(5.5, 6.9,"Lime",true);
        r1.setColor("Brown");
        System.out.println(r1);
        System.out.println(r1.getWidth());
        System.out.println(r1.getLength());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        Square s1 = new Square();
        s1.setSide(24);
        s1.setColor("Blue");
        s1.setFilled(false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
    }
}
