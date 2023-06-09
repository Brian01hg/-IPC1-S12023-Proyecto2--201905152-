/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto2;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author epa
 */
public class Editor extends javax.swing.JFrame {
    Gris ObjProcesamiento=new Gris();
    
    public String nombre = "";
    public String ruta = "";
    public String rutas = "";
    public String rutaA = "";
    public String rutaB = "";
    public String rutaC = "";
    public String rutaD = "";
    public String rutaE = "";
    
    
    public static BufferedImage BlancoyNegro (BufferedImage img) {
        BufferedImage retorno = new BufferedImage(img.getWidth(), img.getHeight(), 2);
        for (int c = 0; c < img.getWidth(); c++) {
            for (int f = 0; f < img.getHeight(); f++) {
                Color color = new Color(img.getRGB(c, f), true);
                int r = color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();
                int a = color.getAlpha();
                int gris = (r + g + b) / 3;
                retorno.setRGB(c, f, new Color(gris, gris, gris, a).getRGB());
            }
        }
        return retorno;
    }
    

    /**
     * Creates new form Editor
     */
    public Editor() {
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

        jpeg = new javax.swing.JCheckBox();
        copia = new javax.swing.JCheckBox();
        colores = new javax.swing.JCheckBox();
        modificar = new javax.swing.JCheckBox();
        blanco = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        uno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpeg.setText("JPEG a BMP y viceversa");

        copia.setText("Copia JPEG");

        colores.setText("Rojo Verde Azul Sepia");

        modificar.setText("Modificar imagen");

        blanco.setText("Blanco y negro");

        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Seleccionar imagen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jpeg, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 546, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(blanco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(modificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                                    .addComponent(colores, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(copia, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(uno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(15, 15, 15))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jpeg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(copia)
                        .addGap(29, 29, 29)
                        .addComponent(colores)
                        .addGap(18, 18, 18)
                        .addComponent(modificar)
                        .addGap(18, 18, 18)
                        .addComponent(blanco))
                    .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        ruta = "";
        
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("imagenes JPEG", "jpg", "jpeg");
        jf.setFileFilter(filtrado);
        
        int result = jf.showOpenDialog(this);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            
            ruta = jf.getSelectedFile().getPath();
            nombre = jf.getSelectedFile().getName();
            
            Image mImage = new ImageIcon(ruta).getImage();
            ImageIcon mIcono = new ImageIcon(mImage.getScaledInstance(uno.getWidth(), uno.getHeight(), Image.SCALE_SMOOTH));
            uno.setIcon(mIcono);
        }
        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         Principal n = new Principal();
        n.setVisible(true);
        n.setTitle("Ventana Principal");
        n.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        

        
        String nuevo = nombre.substring(0, nombre.lastIndexOf("."))+ "-converted.bmp";
        
        if(jpeg.isSelected()){
            File input = new File (ruta);
            
            BufferedImage image = null;
            try {
                image = ImageIO.read(input);
            }catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            File rutas = new File("C:\\Users\\epa\\Pictures\\Proyecto2\\" + nuevo);
            
            try {
                ImageIO.write(image, "bmp", rutas);
                
            }catch (IOException ex){
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            BufferedImage nuevaima = null;
            try{
                nuevaima = ImageIO.read(rutas);
                
            }catch(IOException ex){
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            ImageIcon nuevoIcono = new ImageIcon(nuevaima.getScaledInstance(uno.getWidth(), uno.getHeight(), Image.SCALE_SMOOTH));
            uno.setIcon(nuevoIcono);
            
            JOptionPane.showMessageDialog(null, "Se cambio exitosamente");

        }else if (copia.isSelected()){
            
            String nuevoB = nombre.substring(0, nombre.lastIndexOf("."))+ "-copia.jpeg";
            
           File input = new File (ruta);
            
            BufferedImage image = null;
            try {
                image = ImageIO.read(input);
            }catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            File rutasA = new File("C:\\Users\\epa\\Pictures\\Proyecto2\\" + nuevoB);
            
            try {
                ImageIO.write(image, "jpeg", rutasA);
                
            }catch (IOException ex){
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            BufferedImage nuevaima = null;
            try{
                nuevaima = ImageIO.read(rutasA);
                
            }catch(IOException ex){
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            ImageIcon nuevoIcono = new ImageIcon(nuevaima.getScaledInstance(uno.getWidth(), uno.getHeight(), Image.SCALE_SMOOTH));
            uno.setIcon(nuevoIcono);
            
            JOptionPane.showMessageDialog(null, "Se cambio exitosamente");
            
            
        }else if (colores.isSelected()){
            String nuevoC = nombre.substring(0, nombre.lastIndexOf("."))+ "-Converted.BMP";
  
            File input = new File (ruta);
            
            BufferedImage image = null;
            try {
                image = ImageIO.read(input);
            }catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            File rutasB = new File("C:\\Users\\epa\\Pictures\\Proyecto2\\" + nuevoC);
            
            try {
                ImageIO.write(image, "bmp", rutasB);
                
            }catch (IOException ex){
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            BufferedImage nuevaima = null;
            try{
                nuevaima = ImageIO.read(rutasB);
                
            }catch(IOException ex){
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            ImageIcon nuevoIcono = new ImageIcon(nuevaima.getScaledInstance(uno.getWidth(), uno.getHeight(), Image.SCALE_SMOOTH));
            uno.setIcon(nuevoIcono);
            
            JOptionPane.showMessageDialog(null, "Se cambio exitosamente");
        
        }else if (modificar.isSelected()){
            String nuevoD = nombre.substring(0, nombre.lastIndexOf("."))+ "-Converted.BMP";
  
            File input = new File (ruta);
            
            BufferedImage image = null;
            try {
                image = ImageIO.read(input);
            }catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            File rutasC = new File("C:\\Users\\epa\\Pictures\\Proyecto2\\" + nuevoD);
            
            try {
                ImageIO.write(image, "bmp", rutasC);
                
            }catch (IOException ex){
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            BufferedImage nuevaima = null;
            try{
                nuevaima = ImageIO.read(rutasC);
                
            }catch(IOException ex){
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            ImageIcon nuevoIcono = new ImageIcon(nuevaima.getScaledInstance(uno.getWidth(), uno.getHeight(), Image.SCALE_SMOOTH));
            uno.setIcon(nuevoIcono);
            
            JOptionPane.showMessageDialog(null, "Se cambio exitosamente");
        
        }else if (modificar.isSelected()){
            String nuevoE = nombre.substring(0, nombre.lastIndexOf("."))+ "-Converted.BMP";
  
            File input = new File (ruta);
            
            BufferedImage image = null;
            try {
                image = ImageIO.read(input);
            }catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            File rutasD = new File("C:\\Users\\epa\\Pictures\\Proyecto2\\" + nuevoE);
            
            try {
                ImageIO.write(image, "bmp", rutasD);
                
            }catch (IOException ex){
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            BufferedImage nuevaima = null;
            try{
                nuevaima = ImageIO.read(rutasD);
                
            }catch(IOException ex){
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            ImageIcon nuevoIcono = new ImageIcon(nuevaima.getScaledInstance(uno.getWidth(), uno.getHeight(), Image.SCALE_SMOOTH));
            uno.setIcon(nuevoIcono);
            
            JOptionPane.showMessageDialog(null, "Se cambio exitosamente");
        
        }else if (blanco.isSelected()){
            
            
            
             String nuevoH = nombre.substring(0, nombre.lastIndexOf("."))+ "-blanoynegro.bmp";
            
           File input = new File (ruta);
            
            BufferedImage image = null;
            try {
                image = ImageIO.read(input);
            }catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            File rutasE = new File("C:\\Users\\epa\\Pictures\\Proyecto2\\" + nuevoH);
            
            try {
                ImageIO.write(image, "bmp", rutasE);
                
            }catch (IOException ex){
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            BufferedImage nuevaima = null;
            try{
                nuevaima = ImageIO.read(rutasE);
                
            }catch(IOException ex){
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            ImageIcon nuevoIcono = new ImageIcon(nuevaima.getScaledInstance(uno.getWidth(), uno.getHeight(), Image.SCALE_SMOOTH));
            uno.setIcon(nuevoIcono);
            
            
        }
        
        
       
            
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox blanco;
    private javax.swing.JCheckBox colores;
    private javax.swing.JCheckBox copia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jpeg;
    private javax.swing.JCheckBox modificar;
    private javax.swing.JLabel uno;
    // End of variables declaration//GEN-END:variables

   
}
