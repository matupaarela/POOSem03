package polymorphism.types.t03_others_features;

public class TextField {
    /**
     * aquí se ha adefinido el contenido como una cadena y más tarde como un entero:
     * Nota: La declaración de parámetros polimórficos puede conducir a un problema conocido como ocultación de variables.
     */
    private String content;
    public String setContentDelimiter() {
        int content = 100;
        this.content = this.content + content;
        return this.content;
    }
}
