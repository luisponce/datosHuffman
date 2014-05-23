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
    
    /**
     * cadena a desencriptar (de 0 y 1)
     */
    private String cadena;

    /**
     * 
     * @param c cadena a desencriptar
     */
    public Desencriptar(String c) {
        cadena = c;
    }
    
    @Override
    public void visitar(Hoja n) {
        resultado = n.getText();
    }

    @Override
    public void visitar(Rama n) {
        char cur = cadena.charAt(0);
        cadena = cadena.substring(1);
        if(cur == '0'){
            n.getLeftChild().Aceptar(this);
        } else {
            n.getRightChild().Aceptar(this);
        }
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public char getResultado() {
        return resultado;
    }

    public String getCadena() {
        return cadena;
    }
}
