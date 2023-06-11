package thetestingacademy.oops.inheritence.example.practice.single;

public class Programming {
     // Parent / Base Class

    int version;
    String author;

    // Default Constructor
    // Same name and not arguemnt
    // no return type
    Programming(){
        System.out.println("I am default const");
    }


    // Parameters Constructor
    Programming(int version1,String author1){
        // this
        this.author = author1;
        this.version = version1;
    }

    public void printInfo() {
        System.out.println("Programming{" +
                "version=" + version +
                ", author='" + author + '\'' +
                '}');
    }
}
