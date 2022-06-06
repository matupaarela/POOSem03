package inheritance.h02_multinivel;

public class Run {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Puppy puppy = new Puppy();
        puppy.weep();
        puppy.bark();
        puppy.eat();
    }
}
