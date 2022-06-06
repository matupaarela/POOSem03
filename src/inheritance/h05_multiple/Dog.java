package inheritance.h05_multiple;

public class Dog extends Animal implements Sound {
    @Override
    public void sings() {
        System.out.println("barking");
    }
}
