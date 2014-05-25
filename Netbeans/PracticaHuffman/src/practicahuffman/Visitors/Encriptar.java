
package practicahuffman.Visitors;

import practicahuffman.Arbol.Rama;
import practicahuffman.Arbol.Hoja;

/**
 * Visita concreta que se llama desde una hoja para obtener el codigo huffman
 * del simbolo de esa hoja para ese arbol.
 * Deja el resultado en la variable resultado. Este se obtiene despues de 
 * hacer las visitar. La visita es la encargada de llamar las demas visitas
 * en el resto del arbol para hacer el recorrido.
 */
public class Encriptar implements Visitor{
    
    private String resultado;

    public Encriptar() {
        resultado = "";
    }
    
    @Override
    public void visitar(Hoja n) {
        if(n.getPadre() != null){ //por ser hoja debe tener padre...
            n.getPadre().Aceptar(this);//visitar el padre
            if(n.getPadre().getLeftChild() == n){ //si es por izq 0 y por der 1
                resultado += "0";
            } else {
                resultado += "1";
            }
        } else { //si no tiene padre es que es un alfabeto de 1 simbolo.
            resultado = "1";
        }
    }

    @Override
    public void visitar(Rama n) {
        if(n.getPadre() != null){ 
            n.getPadre().Aceptar(this);//visitar el padre
            if(n.getPadre().getLeftChild() == n){ //si es por izq 0 y por der 1
                resultado += "0";
            } else {
                resultado += "1";
            }
        } 
        //si no tiene padre es que es la raiz, entonces no haga nada
    }

    public String getResultado() {
        return resultado;
    }
    
}
