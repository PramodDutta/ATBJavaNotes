package thetestingacademy.oops.abstraction.interfaceDemo.P1;

public class HideClass implements IPramod {
    @Override
    public void print() {

    }

    @Override
    public void print2() {
        IPramod.super.print2();
    }
}
