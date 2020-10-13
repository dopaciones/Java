package FurnitureShop;

public class FurnitureShop {
    public static void main(String[] args) {
        Table t1 = new Table("Round", "Kitchen", "Wood", 4, 0);
        t1.setName("Tableket");
        t1.setColor("Birch");
        t1.setCost(500);

        Table t2 = new Table("Square", "Coffee", "Glass", 1, 350);
        t2.setName("CoffeTabus");
        t2.setColor("Сolorless");

        Chair c1 = new Chair("Wood", 50, false);
        c1.setName("Sitter-Mitter");
        c1.setColor("Oak");

        Chair c2 = new Chair("Wood", 75, false);
        c2.setName("Eliter");
        c2.setColor("Birch");

        Chair c3 = new Chair("Steel", 30, true);
        c3.setName("OfficeSettice");
        c3.setColor("Grey");

        Sofa s1 = new Sofa(2);
        s1.setName("ChillZonex");
        s1.setColor("Light Brown");

        System.out.println(s1);
        System.out.println("1."+s1.getName());
        System.out.println("Cost: " + s1.getCost() + "$");
        System.out.println("Made of: " + s1.getMaterial());
        System.out.println("Assembly req: " + s1.isAssembled());
        System.out.println("Fits: " + s1.numOfPerson() + " people, has " + s1.getPillows() + " pillows");
        System.out.println();

        System.out.println("Tables: ");
        System.out.println("1." + t1.getName());
        System.out.println(t1);
        System.out.println("Cost: " + t1.getCost() + "$, Fits: " + t1.getPerson() + " people");
        System.out.println("Color: " + t1.getColor() + ", shape: " + t1.getShape());
        System.out.println("2." + t2.getName());
        System.out.println(t2);
        System.out.println("Cost: " + t2.getCost() + "$, Fits: " + t2.getPerson() + " people");
        System.out.println("Color: " + t2.getColor() + ", shape: " + t2.getShape());
        System.out.println();

        System.out.println("Chairs: ");
        System.out.println("1."+c1.getName());
        System.out.println(c1 + ", color: " + c1.getColor());
        System.out.println("2."+c2.getName());
        System.out.println(c2 + ", color: " + c2.getColor());
        System.out.println("3."+c3.getName());
        System.out.println(c3 + ", color: " + c3.getColor());
    }
}
