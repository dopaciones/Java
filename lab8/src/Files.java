import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        //Задание 1
        try(FileWriter writer = new FileWriter("file1.txt", false))
        {
            String text = sc1.nextLine();
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        //Задание 2
        try(FileReader reader = new FileReader("file1.txt"))
        {
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println();

        //Задание 3
        try(FileWriter writer = new FileWriter("file2.txt", false))
        {
            String text2 = sc1.nextLine();
            writer.write(text2);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        //Задание 4
        try(FileWriter writer = new FileWriter("file2.txt", true))
        {
            String text = sc1.nextLine();
            writer.append(text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

