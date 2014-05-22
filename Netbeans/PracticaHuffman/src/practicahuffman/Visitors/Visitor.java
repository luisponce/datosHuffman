

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
