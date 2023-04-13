package designpattern.singleTon.eager;

public class SingleTonDemos {
    public static void main(String[] args) {
        EagerSingleTon eagerSingleTon = EagerSingleTon.getInstance();
        EagerSingleTon eagerSingleTon2 = EagerSingleTon.getInstance();
        System.out.println(eagerSingleTon2);
        System.out.println(eagerSingleTon);


        // Lazy
        SingleTon singleTon = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();
        //SingleTon singleTon3 = new SingleTon();

        System.out.println(singleTon);
        System.out.println(singleTon2);


        // Thread Safe Method
        SingleTonSyncMethod singleTonSyncMethod = SingleTonSyncMethod.getInstance();
        SingleTonSyncMethod singleTonSyncMethod2 = SingleTonSyncMethod.getInstance();


        SingleTonSyncBlock singleTonSyncBlock = SingleTonSyncBlock.getInstance();
        System.out.println(singleTonSyncBlock);
    }
}

class EagerSingleTon {
    // At the same Type, we are calling and getting the instance
    private static EagerSingleTon singleTon = new EagerSingleTon();

    private EagerSingleTon() {
    }

    public static EagerSingleTon getInstance() {
        return singleTon;
    }
}

class SingleTon {
    // Lazy, When you call me, then I will return else I am Lazy
    private static SingleTon instance;

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
}

// Thread Safe Method
class SingleTonSyncMethod {

    private static SingleTonSyncMethod instance;

    private SingleTonSyncMethod() {
    }

    public static synchronized SingleTonSyncMethod getInstance() {
        if (instance == null) {
            instance = new SingleTonSyncMethod();
        }
        return instance;
    }
}

// Thread Safe Method
class SingleTonSyncBlock {
    private static SingleTonSyncBlock instance;

    private SingleTonSyncBlock() {
    }

    public static SingleTonSyncBlock getInstance() {
        if (instance == null) {
            synchronized (SingleTonSyncBlock.class) {
                if (instance == null)
                    instance = new SingleTonSyncBlock();
            }
        }
        return instance;
    }
}


