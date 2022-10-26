package thetestingacademy.oops.ecapsulation.EcapDemo.L2;


public class RunnerClass {

    public static void main(String[] args) {

        Books java = new Books();
        java.setTitle("Head First Java");
        java.setNumberOfCopies(900);
        System.out.println(java);

        // Add more copies
        //Why Ecap? set Negative Copy
        //java.setNumberOfCopies(900);




    }
}
