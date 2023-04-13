package designpattern.singleTon;

public class SingleTon {

    private static  SingleTon singleTon;

    public SingleTon() {
    }

    public static SingleTon getInstance(){
        if(singleTon == null){
            singleTon = new SingleTon();
        }
        return singleTon;
    }

    void work() {
        System.out.println("I am working");
    }
}
