package thetestingacademy.corejava.loops_04.switchDemo;

public class Switch02 {
    public static void main(String[] args) {
        char ch='Z';
        if(ch>=65 && ch<=90){

            switch(ch){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("Character is Vowel");
                    break;
                default:
                    System.out.println("Character is Consonant");
                   // break;
            }
        }else{
            System.out.println("Invalid Alphabet");
        }
    }
}
