package thetestingacademy.problem.oops.AbstractDemo.zero;

public class Abstract004 {
    public static void main(String[] args) {
        // Film f  = new Film();
        System.out.println("Hello");
        Film f = new ChildFilm("RRR");
        f.show();
    }
}

abstract class Film{
    String name;
    Film(String fName){
        this.name = fName;
    }
    {
        System.out.println("IIB");
    }
    void show(){
        System.out.println(this.name);
    }
}

// You have to use the Sub clas or child to fetch the Instance variables
class ChildFilm extends Film{

    ChildFilm(String fName) {
        super(fName);
    }

}
