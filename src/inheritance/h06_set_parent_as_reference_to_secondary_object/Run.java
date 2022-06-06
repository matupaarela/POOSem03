package inheritance.h06_set_parent_as_reference_to_secondary_object;

public class Run {
    public static void main(String[] args) {
        /**
         * En Java se asigna referencia padre a objetos secundarios
         */

        Parent parent = new Parent();
        parent.name = 1;

        Child child = new Child();
        child.name = 2;
        child.salary = 2000;

        Parent[] employees = new Parent[] { parent, child };

        for (Parent employee : employees) {
            System.out.println(employee.getEmployeeDetails());
        }

        /**
         * REGLAS
         *  1. Herencia Ciclica (no permitida)
         *  2. Miembros (propiedades, atributos, métodos, etc) privados no se heredan
         *  3. Constructores no se heredan, pero, si se ejecutan debido al super()
         */
    }
}
