/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicahuffman.Visitors;

import practicahuffman.Arbol.Rama;
import practicahuffman.Arbol.Hoja;

/**
 *
 */
public class Desencriptar implements Visitor {
    
    private char resultado;
    
    private String codigoResultado;
    
    /**
     * cadena a desencriptar
     */
    private String cadena;

    /**
     * 
     * @param c cadena a desencriptar
     */
    public Desencriptar(String c) {
        codigoResultado = "";
        cadena = c;
    }
    
    @Override
    public void visitar(Hoja n) {
        
    }

    @Override
    public void visitar(Rama n) {
        
    }
}
