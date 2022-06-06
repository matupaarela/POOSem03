package inheritance.h05_multiple;

public class Run {
    public static void main(String[] args) {
        /*
         * Herencia multiple: ¡EN JAVA NO SE ADMITE HERENCIA MULTIPLE! XD, sin embargo puede lograrse mediante las interfaces
         */

        Dog dog = new Dog();
        dog.eat();
        dog.sings();

        Cat cat = new Cat();
        cat.eat();
        cat.sings();
    }
}
