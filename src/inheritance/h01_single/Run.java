package inheritance.h01_single;

public class Run {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // método heredado de Animal
        dog.bark();
    }
}
