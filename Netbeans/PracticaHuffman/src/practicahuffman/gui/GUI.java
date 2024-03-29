/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicahuffman.gui;

import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import practicahuffman.Huffman;

/**
 *
 * @author ALICIA PRATS
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cadena = new javax.swing.JTextField();
        resultado = new javax.swing.JTextField();
        cManual = new javax.swing.JRadioButton();
        cArchivo = new javax.swing.JRadioButton();
        rButDirecto = new javax.swing.JRadioButton();
        rButArchivo = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        encriptar = new javax.swing.JButton();
        desencriptar = new javax.swing.JButton();
        crearArbol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Huffman");
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setText("Cadena");

        jLabel2.setText("Resultado");

        cadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadenaActionPerformed(evt);
            }
        });

        resultado.setEditable(false);
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(cManual);
        cManual.setText("Ingresar Manualmente");

        buttonGroup1.add(cArchivo);
        cArchivo.setText("Ingresar por Archivo");

        buttonGroup2.add(rButDirecto);
        rButDirecto.setText("Salida Directa");

        buttonGroup2.add(rButArchivo);
        rButArchivo.setText("Escribir en un archivo");
        rButArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(cManual)
                        .addGap(18, 18, 18)
                        .addComponent(cArchivo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(8, 8, 8)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultado)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(rButDirecto)
                                .addGap(18, 18, 18)
                                .addComponent(rButArchivo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cadena, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cManual)
                    .addComponent(cArchivo))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rButDirecto)
                    .addComponent(rButArchivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        encriptar.setText("Encriptar");
        encriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encriptarActionPerformed(evt);
            }
        });
        jPanel2.add(encriptar);

        desencriptar.setText("Desencriptar");
        desencriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desencriptarActionPerformed(evt);
            }
        });
        jPanel2.add(desencriptar);

        crearArbol.setText("Crear Arbol");
        crearArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearArbolActionPerformed(evt);
            }
        });
        jPanel2.add(crearArbol);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void encriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encriptarActionPerformed
        try {
            RecibirCadena(); //Recibir cadena manualmente o por archivo

            if(Huffman.getInstance().getRaizArbol() == null){//si no hay arbol
                JOptionPane.showMessageDialog(null, 
                        "No hay arbol creado. Debe crear uno primero", 
                        "Error Encriptando", JOptionPane.ERROR_MESSAGE);
            }

            String res;
        
        
            res = Huffman.getInstance().Encriptar(Huffman.getInstance().getCadena());
            
            EnviarResultado(res);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        
            
    }//GEN-LAST:event_encriptarActionPerformed

    private void cadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadenaActionPerformed

    private void desencriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desencriptarActionPerformed
         try {
            RecibirCadena(); //Recibir cadena manualmente o por archivo

            if(Huffman.getInstance().getRaizArbol() == null){//si no hay arbol
                JOptionPane.showMessageDialog(null, 
                        "No hay arbol creado. Debe crear uno primero", 
                        "Error Desencriptando", JOptionPane.ERROR_MESSAGE);
            }

            String res;
        
       
            res = Huffman.getInstance().DesencriptarCadena(Huffman.getInstance().getCadena());
            
            EnviarResultado(res);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_desencriptarActionPerformed

    private void crearArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearArbolActionPerformed
       
        try {
            RecibirCadena();
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage(), 
                   "Error", JOptionPane.ERROR_MESSAGE);
           return;
        }
       
       Huffman.getInstance().setAlfabeto( //Guardar Alfabeto
            Huffman.getInstance().EncontrarFrecuencia(
                Huffman.getInstance().getCadena()));

       Huffman.getInstance().ConstruirArbol();

       JOptionPane.showMessageDialog(null, "Se creo el arbol");
    }//GEN-LAST:event_crearArbolActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoActionPerformed

    private void rButArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rButArchivoActionPerformed
    
    private void RecibirCadena() throws Exception {
        if (cArchivo.isSelected()) { //Si se selecciona ingresar por archivo
            try {
                Huffman.getInstance().setRutaInput(cadena.getText());
                Huffman.getInstance().setCadena(
                    Huffman.getInstance().LeerCadenaDeArchivo(cadena.getText()));
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
            
        }else if (cManual.isSelected()) { //Si se selecciona ingresar manualmente

            String cadenaEntrada = cadena.getText();
            
            Huffman.getInstance().setCadena(cadenaEntrada);

        } else { //Si no se selecciona ninguno
            throw new Exception("No se tiene metodo de entrada seleccionado");
        }
    }
    
    private void EnviarResultado(String res) throws Exception {
        if(rButDirecto.isSelected()){
            resultado.setText(res);
            repaint();
        } else if(rButArchivo.isSelected()){
            String rutaOut = JOptionPane.showInputDialog("Ruta de salida:");
            Huffman.getInstance().EscribirCadenaEnArchivo(res, rutaOut);
            JOptionPane.showMessageDialog(null,
                    "Se guardo la salida en la ruta: " + rutaOut);
        } else {
            throw new Exception("No se tiene metodo de salida seleccionado");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton cArchivo;
    private javax.swing.JRadioButton cManual;
    private javax.swing.JTextField cadena;
    private javax.swing.JButton crearArbol;
    private javax.swing.JButton desencriptar;
    private javax.swing.JButton encriptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rButArchivo;
    private javax.swing.JRadioButton rButDirecto;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables

    
}
