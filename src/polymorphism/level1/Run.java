package polymorphism.level1;

public class Run {
    public static void main(String[] args) {
        Contact contact1 = new Contact();
        contact1.createContact("Juan", 951225544, 987654321);

        Contact contact2 = new Contact();
        contact2.createContact("Juan", 987564521);
    }
}
