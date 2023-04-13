package thetestingacademy.practice.problem01;

public class PrintMyBook extends Book {
    public PrintMyBook(String name, String author, double print) {
        super(name, author, print);
    }

    @Override
    void getDetails() {
        System.out.println(this.name + " - " + this.author + " - " + this.print);
    }

}
