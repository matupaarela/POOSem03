package abstracts;

public class Circle extends Shape {
    double radius;

    /**
     * devuelve πr(cuadrado):
     * @return double
     */
    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}
