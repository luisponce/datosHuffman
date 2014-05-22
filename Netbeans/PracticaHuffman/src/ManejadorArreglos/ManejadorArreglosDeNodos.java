
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
        Nodo[] nuevo = new Nodo[arreglo.length+1];
        System.arraycopy(arreglo, 0, nuevo, 0, arreglo.length);
        boolean done = false;
        int i;
        for (i = 0; i < nuevo.length && !done; i++) {
            if(nuevo[i].getFrecuencia() <= n.getFrecuencia()) done = true;
        }
        
        System.arraycopy(nuevo, i, nuevo, i+1, nuevo.length-i);
        nuevo[i] = n;
        
        arreglo = nuevo;
        return nuevo;
    }
    
    public Nodo[] EliminarNodo(int pos){
        Nodo[] nuevo = new Nodo[pos-1];
        if(pos != 0){
            System.arraycopy(arreglo, 0, nuevo, 0, pos-1);
        }
        
        if(pos != arreglo.length-1){
            System.arraycopy(arreglo, pos+1, nuevo, pos, nuevo.length-pos);
        }
        
        arreglo = nuevo;
        return nuevo;
    }
}
