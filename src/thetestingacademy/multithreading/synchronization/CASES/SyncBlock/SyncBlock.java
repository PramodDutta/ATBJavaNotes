package thetestingacademy.multithreading.synchronization.CASES.SyncBlock;

import java.util.ArrayList;
import java.util.List;

public class SyncBlock {

    public static void main(String[] args) {

        List<String> mylist=new ArrayList<String>();
        mylist.add("Java");
        mylist.add("JSP");
        mylist.add("JDBC");
        mylist.add("Servlets");
        mylist.add("Hibernate");
        mylist.add("Spring");
        mylist.add("Spring Boot");
        mylist.add("Angular");
        G h1=new G(mylist);
        MyThread th1=new MyThread(h1,"A");
        th1.start();
        MyThread th2=new MyThread(h1,"B");
        th2.start();
    }
}

class MyThread extends Thread{
    G hello;
    public MyThread(G hello,String tname){
        super(tname);
        this.hello=hello;
    }
    public void run(){
        hello.show();
    }
}

class G {
    List<String> mylist = new ArrayList<String>();

    G(List<String> mylist) {
        this.mylist = mylist;
    }

    void show() {
        synchronized (mylist) {
            Thread th = Thread.currentThread();
            for (String str : mylist) {
                System.out.println(th.getName() + " - show - "+str);
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                }
            }
        }
    }
}
