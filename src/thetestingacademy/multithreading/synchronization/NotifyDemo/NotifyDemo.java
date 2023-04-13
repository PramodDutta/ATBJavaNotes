package thetestingacademy.multithreading.synchronization.NotifyDemo;

public class NotifyDemo {

    public static void main(String[] args) {
        Stack st = new Stack();
        B obj2 = new B(st, "B");
        A obj1 = new A(st, "A");

    }
}

class Stack {
    int x;
    boolean flag = false;

    synchronized void push(int x) {
        if (flag) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.x = x;
        System.out.println(x + " is pushed..");
        flag = true;
        notify();
    }

    synchronized public int pop() {
        if (!flag) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println(x + " is poped");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        flag = false;
        notify();
        return x;
    }

}

class A implements Runnable {
    Stack st = null;

    A(Stack st, String name) {
        this.st = st;
        Thread t1 = new Thread(this, name);
        t1.start();
    }

    public void run() {
        int a = 1;
        for (int i = 0; i < 10; i++) {
            st.push(a++);
        }
    }
}

class B implements Runnable {
    Stack st = null;

    B(Stack st, String name) {
        this.st = st;
        Thread t2 = new Thread(this, name);
        t2.start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            st.pop();
        }
    }
}