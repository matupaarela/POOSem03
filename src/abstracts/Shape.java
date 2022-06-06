package abstracts;

/**
 * Shape para cualquier cosa que se dibujó
 */
public abstract class Shape {
    protected int x, y;

    /**
     * Calcula el área exacta de la forma dada
     * @return double
     */
    public abstract double computeArea();
}
