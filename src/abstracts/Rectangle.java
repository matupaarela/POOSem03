package abstracts;

public class Rectangle extends Shape {
    double width, height;

    /**
     * Multiplica el ancho por el alto y devuelve el resultado
     * @return double
     */
    public double computeArea( ) {
        return width * height;
    }
}
