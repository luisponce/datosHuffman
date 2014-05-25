/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicahuffman;

import ManejadorArreglos.ManejadorArreglosDeNodos;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import practicahuffman.Arbol.Hoja;
import practicahuffman.Arbol.Nodo;
import practicahuffman.Arbol.Rama;

/**
 * Clase singleton.
 */
public class Huffman {
    private static Huffman INSTANCE;
    
    private Hoja[] alfabeto;
    
    private Nodo raizArbol;
    
    private String cadena;
    
    private String rutaInput;
    
    private Huffman(){
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        try {
            //testing Input
            String c = Huffman.getInstance().
                    LeerCadenaDeArchivo("/Users/luisponcedeleon/Github/datosHuffman/testHuffman.txt");
            
            System.out.println(c);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Huffman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Lee los contenidos de un string y los retorna en un string.
     * @param ruta ruta del archivo a leer
     * @return El string del contenido del archivo
     * @throws FileNotFoundException Si no se enncuentra el archivo dado en ruta
     */
    public String LeerCadenaDeArchivo(String ruta) throws FileNotFoundException{
        try {
            BufferedReader reader = new BufferedReader( new FileReader (ruta));
            String         line;
            StringBuilder  stringBuilder = new StringBuilder();
            String         ls = System.getProperty("line.separator");
            
            while( ( line = reader.readLine() ) != null ) {
                stringBuilder.append( line );
                stringBuilder.append( ls );
            }
            
            return stringBuilder.toString();
        } catch (IOException ex) {
            Logger.getLogger(Huffman.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "";
    }
    
    /**
     * Metodo para encontrar las frecuencias de los simbolos en
     * la cadena de entrada
     * @param cadena Cadena de entrada a analizar.
     * @return Los simbolos con sus frecuencias en la cadena.
     */
    public Hoja[] EncontrarFrecuencia(String cadena){
        return null;
    }
    
    
    /**
     * Crea el arbol y lo guarda en raizArbol
     */
    public void ConstruirArbol(){
        Nodo[] roots = this.alfabeto;
        Arrays.sort(roots); //ordenar el arreglo
        
        while(roots.length>1){
            Nodo n1 = roots[0]; //el menor
            Nodo n2 = roots[1]; //el segundo menor
            Nodo padre = new Rama(n1, n2);
            ManejadorArreglosDeNodos arr = new ManejadorArreglosDeNodos(roots);
            arr.EliminarNodo(0);
            if (arr.getArreglo().length>1) {
                arr.EliminarNodo(0); 
            } else {
                arr.setArreglo(null);
            }
            roots = arr.InsertarYdesplazar(padre);
        }
        raizArbol = roots[0];
    }
    
    public String Encriptar(String cadena){
        return "";
    }
    
    public char Desencriptar(String cadenaBinaria){
        return 'a';
    }
    
    private String Encriptar(char simbolo){
        return "";
    }
    
    /*               
    *               GETERS 
    *                AND
    *              SETTERS
    */

    public Hoja[] getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(Hoja[] alfabeto) {
        this.alfabeto = alfabeto;
    }

    public Nodo getRaizArbol() {
        return raizArbol;
    }

    public void setRaizArbol(Nodo raizArbol) {
        this.raizArbol = raizArbol;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getRutaInput() {
        return rutaInput;
    }

    public void setRutaInput(String rutaInput) {
        this.rutaInput = rutaInput;
    }
    
    public static Huffman getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Huffman();
        }
        return INSTANCE;
    }
}
