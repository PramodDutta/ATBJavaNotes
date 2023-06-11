package thetestingacademy.oops.polymorphism.MethodOverloading;

public class MainClas {

    public static void main(String[] args) {
        new Person().Speak(1);
        new Person().Speak(1.3);
        new Person().Speak("dsds",'2');
    }
}
