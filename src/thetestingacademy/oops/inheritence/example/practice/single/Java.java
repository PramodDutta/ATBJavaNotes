package thetestingacademy.oops.inheritence.example.practice.single;

public class Java extends Programming {

    // author, version
    // Sub class / Child

    String newFeature;

    Java(){
        System.out.println("I am default Child");
    }

    //Java(18, Sun,Lambda{
    Java(int version, String author,String newFeature){
        // Super is used for the calling the Param or Default of Base Class
        super(version,author);
        //super();

        // This is used for the current class
        this.newFeature = newFeature;

    }

    void printDetails(){
        super.printInfo();
        System.out.println("New Feature is " + this.newFeature);
    }




}
