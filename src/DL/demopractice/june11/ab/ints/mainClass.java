package DL.demopractice.june11.ab.ints;

public class mainClass {

    public static void main(String[] args) {

        //I1 i = new I1();
        Internal i = new Internal();
        i.drive();


    }
}

interface Car{

    abstract void engine();
    abstract void tyres();

}


class Internal implements Car{

    void drive(){
        engine();
        tyres();
    }


    @Override
    public void engine() {
        System.out.println("Engine is started");
    }

    @Override
    public void tyres() {
        System.out.println("Tyres are running");
    }
}




abstract class AB{
    abstract void say();
}
class C extends AB{

    @Override
    public void say() {

    }
}
