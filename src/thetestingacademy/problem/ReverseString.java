package thetestingacademy.problem;

public class ReverseString {
    public static void main(String[] args) {
        String originalStr = "Pramod";
        String reversedStr = "";
        System.out.println("Original string: " + originalStr);

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: "+ reversedStr);
    }

    static String reverseString(String string){
        return new StringBuilder(string).reverse().toString();
    }
}


