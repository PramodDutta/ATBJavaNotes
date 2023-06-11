package thetestingacademy.corejava.operators_03.Demo;

public class Test02 {
    public static void main(String[] args) {

        // Increment Op - Pre or Post
        int a = 10;
        // Post   -> a++; // After a ++
        // Pre    -> ++a //  Before a ++
        System.out.println(++a + a++ + a++);
        //System.out.println(A + B + C);

        // A ->  ++a ->  Exp1 = 11, a = 11 -> 11
        // B -> a++ ->  Exp2 = 11 , a = 12
        // a++ -> Exp3 12 , a = 13


        System.out.println(a);

        // 12+11+11 -> 34
        // a -> 13


        int b = 10;
        // POST De =  b--;
        // Pre De = --b
        System.out.println(--b + b++);
        System.out.println(b);
        // --b-- -> Exp -> 9 , b = 9
        // b++ -> Exp -> 9 , b = 10
        // 9+9
        // 10

        float t = 10/3f;
        System.out.println(t);





    }
}
