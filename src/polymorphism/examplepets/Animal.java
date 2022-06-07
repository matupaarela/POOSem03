package polymorphism.examplepets;

public abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void sonido();

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", edad=" + edad;
    }
}
