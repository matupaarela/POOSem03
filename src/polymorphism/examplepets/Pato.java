package polymorphism.examplepets;

public class Pato extends Animal {
    private String colorPico;

    public Pato(String nombre, int edad, String colorPico) {
        super(nombre, edad);
        this.colorPico = colorPico;
    }

    @Override
    public void sonido() {
        System.out.println("Cuaq, cuaq, ...");
    }

    @Override
    public String toString() {
        return "Pato{" +
                super.toString() +
                ", colorPico='" + colorPico + '\'' +
                '}';
    }
}
