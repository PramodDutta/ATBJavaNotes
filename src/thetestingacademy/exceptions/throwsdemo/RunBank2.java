package thetestingacademy.exceptions.throwsdemo;

public class RunBank2 {
    public static void main(String[] args) throws Exception {

        Bank chase = new Bank("USD",100);
        Bank hdfc = new Bank("INR",100);
        System.out.println(chase.add(hdfc));
    }
}
