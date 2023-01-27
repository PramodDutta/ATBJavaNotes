package thetestingacademy.exceptions;

public class Ex11 {
    public static void main(String[] args) {
        Hello h = new Hello();
        h.process();
        System.out.println("Pramod");
    }
}

class Hello {
    public int process() {
        throw new NullPointerException();
    }
}

