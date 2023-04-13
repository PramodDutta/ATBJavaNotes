package thetestingacademy.oops.inheritence.example.SingleInheritance;

public class Python extends Programming{

    String newFeature;

    Python(int version, String author,String nf) {
        super(version, author);
        this.newFeature = nf;
    }

    void printPython(){
        this.printInformation();
        System.out.println(this.newFeature);
    }
}
