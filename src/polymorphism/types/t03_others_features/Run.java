package polymorphism.types.t03_others_features;

public class Run {
    public static void main(String[] args) {
        /**
         * 1. Coacción (Coercion)
         * La conversión polimórfica se ocupa de la conversión implícita de tipos realizada por el compilador para evitar errores de tipo.
         * Un ejemplo típico se ve en una concatenación de enteros y cadenas.
         */
        String str = "string" + 2;
        System.out.println("1. Coaccion (Coercion):\n " +  str);

        /**
         * 2. Sobrecarga (Overloading) de operadores
         * Una sobrecarga de operador o método se refiere a una característica polimórfica del mismo símbolo u
         * operador que tiene diferentes significados (formas) dependiendo del contexto.
         *
         * Por ejemplo, el símbolo más (+) se utiliza para la suma matemática, así como la concatenación de cadenas.
         * En cualquier caso, solo el contexto (es decir, los tipos de argumento) determina la interpretación del símbolo.
         */

        String str2 = "2" + 2;
        int sum = 2 + 2;
        System.out.println(String.format("2. Sobrecarga (Overloading) de operadores\n str = %s\n sum = %d\n", str2, sum));

        /**
         * 3. parámetros polimorficos (Polymorphic Parameters)
         * El polimorfismo paramétrico permite asociar un nombre de un parámetro o método de una clase a diferentes tipos.
         * (Ver clase TextField)
         */

    }
}
