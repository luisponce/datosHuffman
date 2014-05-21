
package practicahuffman.Arbol;

import practicahuffman.Visitors.Visitor;

/**
 * Nodo de un arbol.
 */
public abstract class Nodo {
    
    private Nodo padre;
    
    private int frecuencia;
    
    public abstract void Aceptar(Visitor v) ;
}
