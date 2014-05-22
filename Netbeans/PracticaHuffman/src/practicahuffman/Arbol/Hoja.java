/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicahuffman.Arbol;

import practicahuffman.Visitors.Visitor;

/**
 * Hojas de un arbol binario.
 */
public class Hoja extends Nodo{

    private final char text;

    public Hoja(char simbolo, int freq) {
        this.text = simbolo;
        this.frecuencia = freq;
    }
    
    
    @Override
    public void Aceptar(Visitor v) {
        v.visitar(this);
    }

    public char getText() {
        return text;
    }
}
