package polymorphism.examplepets;

public class Gato extends Animal {
    private boolean estaOperado;

    public Gato(String nombre, int edad, boolean estaOperado) {
        super(nombre, edad);
        this.estaOperado = estaOperado;
    }

    @Override
    public void sonido() {
        System.out.println("Miau, miau, ...");
    }

    @Override
    public String toString() {
        return "Gato{" +
                super.toString() +
                ", estaOperado=" + estaOperado +
                '}';
    }
}
