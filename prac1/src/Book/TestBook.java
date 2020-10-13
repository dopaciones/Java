package Book;

public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Crime and Punishment", 580,"Dostoevsky");
        Book d2 = new Book("Master and Margarita", "Bulgakov");
        Book d3 = new Book();
        d2.setPages(710);
        d3.setName("Evgeny Onegin");
        d3.setPages(640);
        d3.setAuthor("Pushkin");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.countPages();
        d2.countPages();
        d3.countPages();
    }
}

