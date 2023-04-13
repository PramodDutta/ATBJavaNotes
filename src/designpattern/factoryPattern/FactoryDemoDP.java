package designpattern.factoryPattern;

public class FactoryDemoDP {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal("dog", "Woof");
        Animal cat = AnimalFactory.getAnimal("cat", "Meow");
        System.out.println(dog instanceof Dog);
        System.out.println(cat instanceof Cat);

    }
}


interface Animal {
    void speak(String say);
}

class Dog implements Animal {

    String say;

    Dog(String say) {
        this.say = say;
    }

    public void speak(String say) {
        System.out.println(say);
    }
}

class Cat implements Animal {
    String say;

    Cat(String say) {
        this.say = say;
    }

    public void speak(String say) {
        System.out.println(say);
    }
}

class AnimalFactory {
    public static Animal getAnimal(String type, String say) {
        if ("dog".equals(type)) {
            return new Dog(say);
        } else if ("cat".equals(type)) {
            return new Cat(say);
        } else {
            return null;
        }
    }
}
