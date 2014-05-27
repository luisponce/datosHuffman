
package practicahuffman.Arbol;

import practicahuffman.Visitors.Visitor;

/**
 * Nodo que no es hoja (tiene hijos)
 */
public class Rama extends Nodo {

    private final Nodo leftChild;
    
    private final Nodo rightChild;

    public Rama(Nodo leftChild, Nodo rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        frecuencia = leftChild.frecuencia + rightChild.frecuencia;
        leftChild.padre = this;
        rightChild.padre = this;
    }
    
    @Override
    public void Aceptar(Visitor v) throws Exception {
        v.visitar(this);
    }

    public Nodo getLeftChild() {
        return leftChild;
    }

    public Nodo getRightChild() {
        return rightChild;
    }
}
