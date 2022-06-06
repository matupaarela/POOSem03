package polymorphism.types.t01_statics;

public class Run {
    public static void main(String[] args) {
        /**
         * Un polimorfismo que se resuelve durante el tiempo de compilación se conoce como polimorfismo estático.
         * La sobrecarga de métodos es un ejemplo de polimorfismo en tiempo de compilación.
         */
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(100, 200));
        System.out.println(calculator.add(100, 200, 300));
    }
}
