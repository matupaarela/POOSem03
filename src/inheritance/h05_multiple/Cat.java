package inheritance.h05_multiple;

public class Cat extends Animal implements Sound {

    @Override
    public void sings() {
        System.out.println("meowing");
    }
}
