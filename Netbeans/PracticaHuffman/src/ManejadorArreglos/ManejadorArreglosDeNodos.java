
package ManejadorArreglos;

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
        Nodo[] nuevo;
        if (arreglo!= null) {
            nuevo = new Nodo[arreglo.length+1];
            System.arraycopy(arreglo, 0, nuevo, 0, arreglo.length);
            boolean done = false;
            int i;
            for (i = 0; i < arreglo.length && done == false; i++) {
                if(n.getFrecuencia() <= nuevo[i].getFrecuencia()) {
                    done = true; 
                }
            }
            int pos = i;
            if(pos != 0){
                System.arraycopy(arreglo, 0, nuevo, 0, pos);
            }
            if(pos != arreglo.length-1){
                System.arraycopy(arreglo, pos, nuevo, pos+1, nuevo.length-pos-1);
            }
            
            nuevo[i] = n;
        } else {
            nuevo = new Nodo[1];
            nuevo[0] = n;
        }
        arreglo = nuevo;
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
