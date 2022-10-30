package thetestingacademy.strings;

public class StringVStringBuffer {

    public static void main(String[] args) {
        String s = "Pramod";
        String s2 = "Dutta";
        for (int i = 0; i < 1000; i++) {
                s2 = s2+s;
        }

        // This will create 1000+ strings in memory
        StringBuffer sb = new StringBuffer("Pramod");
        for (int i = 0; i < 1000; i++) {
            sb.append(s2);
        }

        // Use String Buffer when values changes a lot
        // Less time and Thread Safe

        StringBuilder sbb = new StringBuilder("Dutta");
        // Not Thread Safe


    }
}
