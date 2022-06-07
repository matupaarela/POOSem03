package polymorphism.examplepets;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    List<Animal> listaAnimales;

    public Veterinaria() {
        listaAnimales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        listaAnimales.add(animal);
    }

    public void reporteAnimales() {
        for (Animal a : listaAnimales) {
            System.out.println(a);
        }
    }

    public void emitirSonidos() {
        for (Animal a : listaAnimales) {
            a.sonido();
        }
    }

    public double promedioEdadesPerros() {
        double promedio = 0;
        int cantidadPerros = 0;
        for (Animal a : listaAnimales) {
            if (a instanceof Perro) {
                promedio += a.getEdad();
                cantidadPerros++;
            }
        }
        return promedio / cantidadPerros;
    }

    public String nombreAnimalMayor() {
        String nombre = "";
        int edadMayor = 0;
        for (Animal animal : listaAnimales) {
            if (animal.getEdad() > edadMayor) {
                edadMayor = animal.getEdad();
                nombre = animal.getNombre();
            }
        }
        return nombre;
    }
}
