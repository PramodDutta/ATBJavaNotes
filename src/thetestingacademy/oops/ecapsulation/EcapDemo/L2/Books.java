package thetestingacademy.oops.ecapsulation.EcapDemo.L2;

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
        if(numberOfCopies >0 )
        this.numberOfCopies = numberOfCopies;
    }

    public void addCopies(int more){
        setNumberOfCopies(this.numberOfCopies+ more);
    }

    private String title;
    private int numberOfCopies;

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", numberOfCopies=" + numberOfCopies +
                '}';
    }
}
