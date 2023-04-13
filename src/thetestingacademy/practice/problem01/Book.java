package thetestingacademy.practice.problem01;

public abstract class Book{
    String name;
    String author;
    double print;

    abstract void getDetails();

    public Book(String name, String author, double print) {
        this.name = name;
        this.author = author;
        this.print = print;
    }

}
