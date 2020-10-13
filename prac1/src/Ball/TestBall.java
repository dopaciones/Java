package Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("Green", 2,"Tennis");
        Ball d2 = new Ball("Orange", "Basketball");
        Ball d3 = new Ball();
        d2.setSize(7);
        d2.setColor("Brown");
        d3.setColor("White");
        d3.setSize(5);
        d3.setSport("Soccer");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.intoCM();
        d2.intoCM();
        d3.intoCM();
        d1.outSport();
        d2.outSport();
        d3.outSport();
    }
}
