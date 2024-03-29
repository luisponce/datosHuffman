
package ManejadorArreglos;

import java.util.Arrays;
import practicahuffman.Arbol.Nodo;

/**
 *
 */
public class ManejadorArreglosDeNodos {
    Nodo[] arreglo;

    public ManejadorArreglosDeNodos(Nodo[] arreglo) {
        this.arreglo = arreglo;
    }

    public Nodo[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Nodo[] arreglo) {
        this.arreglo = arreglo;
    }
    
    public Nodo getInfoArreglo(int i){
        return arreglo[i];
    }
    
    public Nodo[] InsertarYdesplazar(Nodo n){
        
        if(arreglo == null){
            arreglo = new Nodo[1];
            arreglo[0] = n;
        } else {
            Nodo[] nuevo = new Nodo[arreglo.length+1];
            System.arraycopy(arreglo, 0, nuevo, 0, arreglo.length);
            nuevo[nuevo.length-1] = n;

            Arrays.sort(nuevo);
            arreglo = nuevo;
        }
        
        return arreglo;
    }
    
    public void EliminarNodo(int pos){
        Nodo[] nuevo = new Nodo[arreglo.length-1];
        if(pos != 0){
            System.arraycopy(arreglo, 0, nuevo, 0, pos-1);
        }
        
        if(pos != arreglo.length-1){
            System.arraycopy(arreglo, pos+1, nuevo, pos, nuevo.length-pos);
        }
        
        arreglo = nuevo;
    }
    
    public Nodo[] limpiarArreglo () {
        arreglo = null;
        return arreglo;
    }
}
