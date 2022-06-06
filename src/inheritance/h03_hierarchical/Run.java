package inheritance.h03_hierarchical;

public class Run {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.meow();
        cat.eat();
    }
}
