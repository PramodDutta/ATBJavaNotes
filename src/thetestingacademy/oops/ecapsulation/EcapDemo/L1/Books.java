package thetestingacademy.oops.ecapsulation.EcapDemo.L1;

public class Books {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    String title;
     int numberOfCopies;

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", numberOfCopies=" + numberOfCopies +
                '}';
    }
}
