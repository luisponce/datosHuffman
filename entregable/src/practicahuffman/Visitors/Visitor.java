

package practicahuffman.Visitors;

import practicahuffman.Arbol.Rama;
import practicahuffman.Arbol.Hoja;

/**
 *
 */
public interface Visitor {
    
    public void visitar(Hoja n) throws Exception;
    public void visitar(Rama n) throws Exception;
}
