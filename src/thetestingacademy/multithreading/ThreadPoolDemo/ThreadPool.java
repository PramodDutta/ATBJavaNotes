package thetestingacademy.multithreading.ThreadPoolDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    public static void main(String[] args) {
        HelloThread helloTH=new HelloThread();
        ExecutorService exService1=Executors.newFixedThreadPool(5);
        for(int i=1;i<=7;i++)
            exService1.execute(helloTH);
        ExecutorService exService2= Executors.newFixedThreadPool(2);
        for(int i=1;i<=2;i++)
            exService2.execute(helloTH);
    }

}

class HelloThread extends Thread{
    public void run(){
        Thread th=Thread.currentThread();
        for(int i=1;i<=5;i++){
            System.out.println(i +" worked and displayed by "+ th.getName() );
            try{
                Thread.sleep(1000);
            }catch(Exception ex){ }
        }
    }
}
