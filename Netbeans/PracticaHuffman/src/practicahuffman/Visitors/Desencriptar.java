/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicahuffman.Visitors;

import java.util.logging.Level;
import java.util.logging.Logger;
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
    public void visitar(Rama n) throws Exception {
        if(cadena == null || cadena.length() == 0){
                //la cadena no puede llagar vacia a una rama.
                throw new Exception("No se pudo reconocer la cadena");
        }
        
        char cur = cadena.charAt(0);
        
        if(cadena.length() == 1){//si solo que da un char, borre el string
            cadena = null;
        } else {// si no, quitele el primer char.
            cadena = cadena.substring(1);
        }
        
        if(cur == '0'){
            n.getLeftChild().Aceptar(this);
        } else if(cur == '1') {
            n.getRightChild().Aceptar(this);
        } else {
            throw new Exception("Error: cadena invalida para desencriptar");
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
