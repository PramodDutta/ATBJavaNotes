package thetestingacademy.corejava.stringDemo_05.Strings1;

public class Strin02 {
    public static void main(String[] args) {

            String name = "The Testing Academy"; //sp
            String name1 = "The Testing Academy"; // SP
            String name2 = new String("The Testing Academy"); // Heap area

            System.out.println(name == name1);
            System.out.println(name.equals(name1));
//
            System.out.println(name.equalsIgnoreCase(name1));
//
//
            System.out.println(name == name2);
//
//
            System.out.println(name.equals(name2));




    }
}
