package polymorphism.examplepets;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void sonido() {
        System.out.println("Guau, guau, ...");
    }

    @Override
    public String toString() {
        return "Perro{" +
                super.toString() +
                ", raza='" + raza + '\'' +
                '}';
    }
}
