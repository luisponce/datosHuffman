/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicahuffman;

import practicahuffman.Arbol.Hoja;
import practicahuffman.Arbol.Nodo;

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
        // TODO code application logic here
    }
    
    public String LeerCadenaDeArchivo(String ruta){
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
    
    public void ConstruirArbol(Hoja[] Alfabeto){
        
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
