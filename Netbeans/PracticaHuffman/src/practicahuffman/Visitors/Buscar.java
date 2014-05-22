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
public class Buscar implements Visitor{

    private final char target;
    
    /**
     * Constructor
     * @param t El caracter que se busca.
     */
    public Buscar(char t){
        this.target = t;
    }
    
    @Override
    public void visitar(Hoja n) {
        
    }

    @Override
    public void visitar(Rama n) {
        
    }
    
}
