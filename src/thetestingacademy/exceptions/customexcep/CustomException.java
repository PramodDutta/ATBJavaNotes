package thetestingacademy.exceptions.customexcep;

public class CustomException extends Exception {
        public CustomException(String msg){
            super(msg);
            System.out.println("IF YOU GOT THIS ERROR, pLEASE CHEANGE YOUR CURRENCY to INR first");
        }
}
