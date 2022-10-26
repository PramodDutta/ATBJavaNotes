package thetestingacademy.oops.ecapsulation.EcapDemo.L1;

public class RunnerClass {

    public static void main(String[] args) {

        Books java = new Books();
        java.setTitle("Head First Java");

        System.out.println(java);

        // Add more copies
        java.numberOfCopies = 100;
        System.out.println(java);


    }
}
