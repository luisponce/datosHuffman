
package practicahuffman.Arbol;

import practicahuffman.Visitors.Visitor;

/**
 * Nodo de un arbol Binario.
 */
public abstract class Nodo {
    
    private Rama padre;
    
    private int frecuencia;
    
    public abstract void Aceptar(Visitor v) ;

    public Rama getPadre() {
        return padre;
    }

    public void setPadre(Rama padre) {
        this.padre = padre;
    }

    public int getFrecuencia() {
        return frecuencia;
    }
}
