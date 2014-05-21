/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicahuffman.Arbol;

import practicahuffman.Simbolo;
import practicahuffman.Visitors.Visitor;

/**
 *
 */
public class Hoja extends Nodo{

    private Simbolo simbolo;

    public Hoja(Simbolo simbolo) {
        this.simbolo = simbolo;
    }
    
    
    @Override
    public void Aceptar(Visitor v) {
        v.visitar(this);
    }

    public Simbolo getSimbolo() {
        return simbolo;
    }
}
