package thetestingacademy.generics.example3;

public class TClass {
    public static void main(String[] args) {
        // Test for Integer type
        Test < Integer > obj1 = new Test < Integer > (5);
        System.out.println(obj1.getObject());

        // Test for double type
        Test < Double > obj2 = new Test < Double > (15.777755);
        System.out.println(obj2.getObject());

        // Test for String type
        Test < String > obj3 = new Test < String > ("Yayy! That's my first Generic Class.");
        System.out.println(obj3.getObject());
    }
}

class Test < T > {
    T obj;
    Test(T obj) {
        this.obj = obj;
    }
    public T getObject() {
        return this.obj;
    }
}
