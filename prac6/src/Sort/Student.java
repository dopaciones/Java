package Sort;

import java.util.Arrays;
import java.util.Scanner;


public class Student {
    public int id;
    public int mark;
    public String name;
    public String surname;


    public Student(int id, int mark, String name, String surname) {
        this.id = id;
        this.mark = mark;
        this.name = name;
        this.surname = surname;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Id: "+this.id+", Name: "+this.name+", Surname: "+this.surname+", mark: "+this.mark;
    }
}
