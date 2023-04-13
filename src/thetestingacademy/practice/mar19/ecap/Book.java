package thetestingacademy.practice.mar19.ecap;

public class Book {
    private String title;
    private int noOfCopies;

    public String getTitle() {
        return title;
    }

    public void set0x23283828932893Title(String title) {
        this.title = title;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        if(noOfCopies > 0) {
            this.noOfCopies = noOfCopies;
        }else {
            System.out.println("Hacker goaway");
        }
    }
}
