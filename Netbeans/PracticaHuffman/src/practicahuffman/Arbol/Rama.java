/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicahuffman.Arbol;

import practicahuffman.Visitors.Visitor;

/**
 *
 */
public class Rama extends Nodo {

    private Nodo leftChild;
    
    private Nodo rightChild;

    public Rama(Nodo leftChild, Nodo rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    
    @Override
    public void Aceptar(Visitor v) {
        v.visitar(this);
    }

    public Nodo getLeftChild() {
        return leftChild;
    }

    public Nodo getRightChild() {
        return rightChild;
    }
}