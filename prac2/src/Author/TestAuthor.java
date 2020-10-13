package Author;

public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Nicole", "nicole1996@gmail.com", 'F');
        Author a2 = new Author("Michael", null, 'M');
        a2.setEmail("micraven1724@yahoo.com");
        System.out.println(a1);
        System.out.println(a2);
    }
}
