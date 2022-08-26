package thetestingacademy.oops.inheritence.example.SingleInheritance;

class Java  extends Programming{

    String newFeature;

    Java(int version, String author,String newFeature) {
        super(version, author);
        this.newFeature = newFeature;
    }

    void printDetails(){
        this.printInformation();
        System.out.println("New Feature is " + newFeature);
    }
}
