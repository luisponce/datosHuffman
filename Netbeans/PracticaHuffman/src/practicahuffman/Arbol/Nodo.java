
package practicahuffman.Arbol;

import practicahuffman.Huffman;
import practicahuffman.Visitors.Visitor;

/**
 * Nodo de un arbol Binario.
 */
public abstract class Nodo implements Comparable<Nodo>{
    
    protected Rama padre;
    
    protected int frecuencia;
    
    public abstract void Aceptar(Visitor v) throws Exception;

    public Rama getPadre() {
        return padre;
    }

    public void setPadre(Rama padre) {
        this.padre = padre;
    }

    public int getFrecuencia() {
        return frecuencia;
    }
    //x.compareTo(y)
    @Override
    public int compareTo(Nodo o) {
        if(o == null){
            return -1;
        }
        
        Integer f1 = this.frecuencia; //freq x
        Integer f2 = o.frecuencia; //freq y
        
        return f1.compareTo(f2);
    }
}
