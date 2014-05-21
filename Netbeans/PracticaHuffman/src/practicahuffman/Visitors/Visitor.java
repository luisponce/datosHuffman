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
public interface Visitor {
    
    public void visitar(Hoja n);
    public void visitar(Rama n);
}
