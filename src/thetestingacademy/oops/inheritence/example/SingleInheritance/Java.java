package thetestingacademy.oops.inheritence.example.SingleInheritance;

class Java  extends Programming{

    String newFeature;

    Java(){

    }

    Java(int version, String author,String newFeature) {
        //super();
        super(version, author);
        //new Programming(version,author);
        this.newFeature = newFeature;
    }

    void printInformation(){
        System.out.println("Child one");
    }

    void printDetails(){
        super.printInformation();
        System.out.println("New Feature is " + newFeature);
    }
}
