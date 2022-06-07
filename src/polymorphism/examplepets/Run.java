package polymorphism.examplepets;

public class Run {
    public static void main(String[] args) {
        Veterinaria vet = new Veterinaria();
        Animal perro1 = new Perro("Fido", 5, "Chihuahua");
        Animal gato1 = new Gato("Michi", 6, false);
        Pato pato1 = new Pato("Lucas", 3, "anaranjado");
        vet.agregarAnimal(perro1);
        vet.agregarAnimal(new Perro("Perro1", 8, "Raza1"));
        vet.agregarAnimal(new Perro("Perro2", 10, "Raza2"));
        vet.agregarAnimal(new Perro("Perro5", 15, "Raza2322"));
        vet.agregarAnimal(gato1);
        vet.agregarAnimal(pato1);
        vet.reporteAnimales();
//        vet.emitirSonidos();
        System.out.println("El promedio de edad de los perros es: " + vet.promedioEdadesPerros());

        /*
         * elaborar un método que recupere el nombre del animal con la mayor edad
         */
        System.out.println("El nombre del animal con mayor edad es: " + vet.nombreAnimalMayor());
    }
}
