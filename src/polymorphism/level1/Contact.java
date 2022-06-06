package polymorphism.level1;

public class Contact {
    String name;
    int number1;
    int number2;

    public void createContact(String name, int number1, int number2) {
        this.name = name;
        this.number1 = number1;
        this.number2 = number2;
        System.out.println(this);
    }

    public void createContact(String name, int number1) {
        this.name = name;
        this.number1 = number1;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Contact {" +
                "name='" + name + '\'' +
                ", number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }
}
