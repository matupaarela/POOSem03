package polymorphism.types.t02_dinamic;

public class Run {
    public static void main(String[] args) {
        /**
         * El polimorfismo dinámico es un proceso en el que una llamada a un método reemplazado se resuelve en tiempo de ejecución,
         * por eso se denomina polimorfismo en tiempo de ejecución. La invalidación de métodos es una de las formas de lograr
         * el polimorfismo dinámico. En cualquier lenguaje de programación orientado a objetos, Overriding es una característica
         * que permite a una subclase o clase secundaria proporcionar una implementación específica de un método que ya ha sido
         * proporcionado por una de sus superclases o clases primarias.
         */

        MacBook macBook = new MacBook();
        macBook.myMethod(); // Esto llamaría a myMethod() de la clase padre MacBook

        IPad iPad = new IPad();
        iPad.myMethod(); // Esto llamaría a myMethod() de la clase secundaria iPad

        MacBook obj = new IPad();
        obj.myMethod(); // Esto llamaría a myMethod() de la clase secundaria iPad
    }
}
