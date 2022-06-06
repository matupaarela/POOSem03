package inheritance.h04_hybrid;

public class Run {
    public static void main(String[] args) {
        /**
         * Herencia híbrida: combinación de dos o más tipo de herencia
         */
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Puppy puppy = new Puppy();
        puppy.weep();
        puppy.bark();
        puppy.eat();

        Cat cat = new Cat();
        cat.meow();
        cat.eat();
    }
}
