package thetestingacademy.oops.inheritence.example.SingleInheritance;

class Programming {

    int version;
    String author;

    Programming(int version, String author){
        this.author = author;
        this.version = version;
    }

    void printInformation(){
        System.out.println("This Programming Language is Created by " + author + " Had version :  "+ version);
    }
}