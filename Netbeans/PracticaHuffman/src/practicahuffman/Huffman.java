

package practicahuffman;

import ManejadorArreglos.ManejadorArreglosDeNodos;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.HashMap;
import java.util.Map;
import practicahuffman.Arbol.Hoja;
import practicahuffman.Arbol.Nodo;
import practicahuffman.Arbol.Rama;
import practicahuffman.Visitors.Desencriptar;
import practicahuffman.Visitors.Encriptar;
import practicahuffman.Visitors.Visitor;

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
        if(args.length == 0){
            System.out.println("Error: wrong usage");
        } else if(args.length == 2 && args[0].equals("-e")){try {
            //encrypt
            Huffman.getInstance().setRutaInput(args[1]);//guardar la ruta

            Huffman.getInstance().setCadena( //leer contenido del archivo
                    Huffman.getInstance().LeerCadenaDeArchivo(args[1]));

            //calcular la frecuencia del alfabeto de simbolos
            Huffman.getInstance().setAlfabeto(
                    Huffman.getInstance().EncontrarFrecuencia(
                            Huffman.getInstance().getCadena()));
            
            //testing
//                System.out.println(Arrays.toString(Huffman.getInstance().getAlfabeto()));

            Huffman.getInstance().ConstruirArbol();
            
            
            String res;
            res = Huffman.getInstance().Encriptar(
                    Huffman.getInstance().cadena);

            System.out.println(res);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Huffman.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(Huffman.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(args.length == 3){
            try {
                Huffman.getInstance().setRutaInput(args[1]);//guardar la ruta
                
                Huffman.getInstance().setCadena( //leer contenido del archivo
                        Huffman.getInstance().LeerCadenaDeArchivo(args[1]));
                
                
                //calcular la frecuencia del alfabeto de simbolos
                Huffman.getInstance().setAlfabeto(
                        Huffman.getInstance().EncontrarFrecuencia(
                                Huffman.getInstance().getCadena()));
                
                //testing
//                    System.out.println(Arrays.toString(Huffman.getInstance().getAlfabeto()));
                
                Huffman.getInstance().ConstruirArbol();
                
                switch (args[0]) {
                    case "-e":
                        String res;
                        res = Huffman.getInstance().Encriptar(args[2]);
                        
                        System.out.println(res);
                        
                        break;
                    case "-d":
                        res = Huffman.getInstance().DesencriptarCadena(args[2]);
                        
                        System.out.println(res);
                        
                        break;
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Huffman.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(Huffman.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Error: wrong usage");
        }
        

//        //testing Input
//        try {
//            String c = Huffman.getInstance().
//                    LeerCadenaDeArchivo("/Users/luisponcedeleon/Github/datosHuffman/testHuffman.txt");
//            
//            System.out.println(c);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Huffman.class.getName()).log(Level.SEVERE, null, ex);
//        }
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
     * la cadena de entrada.
     * @param cadena Cadena de entrada a analizar.
     * @return Los simbolos con sus frecuencias en la cadena.
     */
    public Hoja[] EncontrarFrecuencia(String cadena){
        Map<Character, Integer> alfabetoFrecuencias = new HashMap<Character, Integer>();
        
        for(char a : cadena.toCharArray()) {
            Integer freq = alfabetoFrecuencias.get(a);
            alfabetoFrecuencias.put(a, (freq == null) ? 1 : freq+1); 
        }
        
        Character[] keys = alfabetoFrecuencias.keySet().toArray(new Character[alfabetoFrecuencias.size()]);
        Hoja[] alphabet = new Hoja[keys.length];
        int i = 0;
        for (Character c : keys) {
            Integer freqC = alfabetoFrecuencias.get(c);
            alphabet[i] = new Hoja(c, freqC);
            i++;
        }
        
        return alphabet;
    }
    
    
    /**
     * Crea el arbol y lo guarda en raizArbol
     * El alfabeto de simbolos debe de estar guardado en simbolos.
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
    
    
    public String Encriptar(String cadena) throws Exception{
        String ans = "";
        char[] str = cadena.toCharArray();
        for (char a : str) {
            ans += Huffman.getInstance().Encriptar(a);
        }
        
        return ans;
    }
    
    public String DesencriptarCadena(String cadenaBinaria){
        String cadenaBinTmp = cadenaBinaria;
        String ans = "";
        while(cadenaBinTmp != null){
            Desencriptar visitor = DesencriptarChar(cadenaBinTmp);
            ans += visitor.getResultado();
            cadenaBinTmp = visitor.getCadena();
        }
        
        return ans;
    }
    
    public Desencriptar DesencriptarChar(String cadenaBin){
        Desencriptar desencriptarVisitor = new Desencriptar(cadenaBin);
        
        Huffman.getInstance().getRaizArbol().Aceptar(desencriptarVisitor);
        
        return desencriptarVisitor;
    }
    
    private String Encriptar(char simbolo) throws Exception{
        Encriptar visitorEncriptar = new Encriptar();
        boolean found = false;
        
        //busca la hoja con el simbolo a desencriptar
        for (int i = 0; i < alfabeto.length && !found; i++) {
            if(alfabeto[i].getText() == simbolo){
                found = true;
                alfabeto[i].Aceptar(visitorEncriptar);//obtener el valor del simbolo
            }
        }
        
        if(!found){
            throw new Exception("Simbolo " + simbolo + " no existe en el alfabeto");
        } else {
            return visitorEncriptar.getResultado();
        }
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
