package thetestingacademy.exceptions;

public class Ex05 {
    public static void main(String[] args) {
        try {
            String ip = args[0];
            int a = Integer.parseInt(args[0]);
            int b = 10 / a;
        } catch (NumberFormatException  | ArithmeticException | ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
