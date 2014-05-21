
package practicahuffman;

/**
 * Clase para almacenar un caracter y su frecuencia de aparicion
 */
public class Simbolo {
    
    /**
     * El character almacenado.
     */
    private final char text;

    
    /**
     * La frecuencia en que aparece el caracter.
     */
    private int frecuencia;
    
    /**
     * Constructor del simbolo.
     * @param t el character a almacenar.
     * @param f la frecuencia del caracter.
     */
    public Simbolo(char t, int f){
        text = t;
        frecuencia = f;
    }
    
    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public char getText() {
        return text;
    }
}
