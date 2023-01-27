package thetestingacademy.exceptions;

public class Ex02 {

    public static void main(String[] args) {
        try {
            String name = null;
            name.trim();
        }catch (Exception e){
//        }catch (Throwable e){
//        }catch (Error e){
            e.printStackTrace();
        }
        System.out.println("I am done");
    }
}
