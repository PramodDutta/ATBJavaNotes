package thetestingacademy.oops.inheritence.example.practice.single;

public class Python extends Programming{
    String newFeature;

    Python(int version, String author,String nf) {
        super(version, author);
        this.newFeature = nf;
    }

    void printPython(){
        super.printInfo();
        System.out.println(this.newFeature);
    }
}
