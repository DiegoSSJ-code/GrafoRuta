/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graforuta;

import GrafosPkg.Grafo;
import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class Rutas extends javax.swing.JFrame {

    /**
     * Creates new form Rutas
     */
    public Rutas() {
        initComponents();
        String rI;
        String rF;
        Scanner t = new Scanner(System.in);
        
        Grafo g = new Grafo("Jutiapa;Agua_Blanca;Asuncion_Mita;Atescatempa;Comapa;Conguaco;"
                  + "El_Adelanto;El_Progreso;Jalpatagua;Jerez;Moyuta;Pasaco;Quesada;San_Jose_Acatempa;"
                  + "Santa_Catarina_Mita;Yupiltepeque;Zapotitlan");
          g.agregarRuta("Jutiapa", "Agua_Blanca", 47);
          g.agregarRuta("Jutiapa", "Asuncion_Mita", 32);
          g.agregarRuta("Jutiapa", "Atescatempa", 38);
          g.agregarRuta("Jutiapa", "Comapa", 44);
          g.agregarRuta("Jutiapa", "Conguaco", 50);
          g.agregarRuta("Jutiapa", "El_Adelanto", 31);
          g.agregarRuta("Jutiapa", "El_Progreso", 15);
          g.agregarRuta("Jutiapa", "Jalpatagua", 42);
          g.agregarRuta("Jutiapa", "Jerez", 39);
          g.agregarRuta("Jutiapa", "Moyuta", 52);
          g.agregarRuta("Jutiapa", "Pasaco", 93);
          g.agregarRuta("Jutiapa", "Quesada", 22);
          g.agregarRuta("Jutiapa", "San_Jose_Acatempa", 36);
          g.agregarRuta("Jutiapa", "Santa_Catarina_Mita", 37);
          g.agregarRuta("Jutiapa", "Yupiltepeque", 23);
          g.agregarRuta("Jutiapa", "Zapotitlan", 33);
          g.agregarRuta("Agua_Blanca", "Asuncion_Mita", 28);
          g.agregarRuta("Agua_Blanca", "Atescatempa", 57);
          g.agregarRuta("Agua_Blanca", "Comapa", 83);
          g.agregarRuta("Agua_Blanca", "Conguaco", 90);
          g.agregarRuta("Agua_Blanca", "El_Adelanto", 71);
          g.agregarRuta("Agua_Blanca", "El_Progreso", 35);
          g.agregarRuta("Agua_Blanca", "Jalpatagua", 80);
          g.agregarRuta("Agua_Blanca", "Jerez", 69);
          g.agregarRuta("Agua_Blanca", "Moyuta", 92);
          g.agregarRuta("Agua_Blanca", "Pasaco", 133);
          g.agregarRuta("Agua_Blanca", "Quesada", 61);
          g.agregarRuta("Agua_Blanca", "San_Jose_Acatempa", 76);
          g.agregarRuta("Agua_Blanca", "Santa_Catarina_Mita", 16);
          g.agregarRuta("Agua_Blanca", "Yupiltepeque", 47);
          g.agregarRuta("Agua_Blanca", "Zapotitlan", 57);
          g.agregarRuta("Asuncion_Mita", "Atescatempa", 30);
          g.agregarRuta("Asuncion_Mita", "Comapa", 68);
          g.agregarRuta("Asuncion_Mita", "Conguaco", 75);
          g.agregarRuta("Asuncion_Mita", "El_Adelanto", 28);
          g.agregarRuta("Asuncion_Mita", "El_Progreso", 20);
          g.agregarRuta("Asuncion_Mita", "Jalpatagua", 65);
          g.agregarRuta("Asuncion_Mita", "Jerez", 42);
          g.agregarRuta("Asuncion_Mita", "Moyuta", 77);
          g.agregarRuta("Asuncion_Mita", "Pasaco", 118);
          g.agregarRuta("Asuncion_Mita", "Quesada", 45);
          g.agregarRuta("Asuncion_Mita", "San_Jose_Acatempa", 61);
          g.agregarRuta("Asuncion_Mita", "Santa_Catarina_Mita", 17);
          g.agregarRuta("Asuncion_Mita", "Yupiltepeque", 20);
          g.agregarRuta("Asuncion_Mita", "Zapotitlan", 30);
          g.agregarRuta("Atescatempa", "Comapa", 76);
          g.agregarRuta("Atescatempa", "Conguaco", 84);
          g.agregarRuta("Atescatempa", "El_Adelanto", 16);
          g.agregarRuta("Atescatempa", "El_Progreso", 49);
          g.agregarRuta("Atescatempa", "Jalpatagua", 74);
          g.agregarRuta("Atescatempa", "Jerez", 12);
          g.agregarRuta("Atescatempa", "Moyuta", 85);
          g.agregarRuta("Atescatempa", "Pasaco", 127);
          g.agregarRuta("Atescatempa", "Quesada", 53);
          g.agregarRuta("Atescatempa", "San_Jose_Acatempa", 69);
          g.agregarRuta("Atescatempa", "Santa_Catarina_Mita", 46);
          g.agregarRuta("Atescatempa", "Yupiltepeque", 15);
          g.agregarRuta("Atescatempa", "Zapotitlan", 17);
          g.agregarRuta("Comapa", "Conguaco", 38);
          g.agregarRuta("Comapa", "El_Adelanto", 66);
          g.agregarRuta("Comapa", "El_Progreso", 51);
          g.agregarRuta("Comapa", "Jalpatagua", 15);
          g.agregarRuta("Comapa", "Jerez", 78);
          g.agregarRuta("Comapa", "Moyuta", 40);
          g.agregarRuta("Comapa", "Pasaco", 81);
          g.agregarRuta("Comapa", "Quesada", 27);
          g.agregarRuta("Comapa", "San_Jose_Acatempa", 38);
          g.agregarRuta("Comapa", "Santa_Catarina_Mita", 72);
          g.agregarRuta("Comapa", "Yupiltepeque", 62);
          g.agregarRuta("Comapa", "Zapotitlan", 71);
          g.agregarRuta("Conguaco", "El_Adelanto", 73);
          g.agregarRuta("Conguaco", "El_Progreso", 58);
          g.agregarRuta("Conguaco", "Jalpatagua", 20);
          g.agregarRuta("Conguaco", "Jerez", 85);
          g.agregarRuta("Conguaco", "Moyuta", 7);
          g.agregarRuta("Conguaco", "Pasaco", 47);
          g.agregarRuta("Conguaco", "Quesada", 34);
          g.agregarRuta("Conguaco", "San_Jose_Acatempa", 45);
          g.agregarRuta("Conguaco", "Santa_Catarina_Mita", 80);
          g.agregarRuta("Conguaco", "Yupiltepeque", 69);
          g.agregarRuta("Conguaco", "Zapotitlan", 79);
          g.agregarRuta("El_Adelanto", "El_Progreso", 42);
          g.agregarRuta("El_Adelanto", "Jalpatagua", 66);
          g.agregarRuta("El_Adelanto", "Jerez", 17);
          g.agregarRuta("El_Adelanto", "Moyuta", 78);
          g.agregarRuta("El_Adelanto", "Pasaco", 119);
          g.agregarRuta("El_Adelanto", "Quesada", 46);
          g.agregarRuta("El_Adelanto", "San_Jose_Acatempa", 62);
          g.agregarRuta("El_Adelanto", "Santa_Catarina_Mita", 44);
          g.agregarRuta("El_Adelanto", "Yupiltepeque", 7);
          g.agregarRuta("El_Adelanto", "Zapotitlan", 6);
          g.agregarRuta("El_Progreso", "Jalpatagua", 48);
          g.agregarRuta("El_Progreso", "Jerez", 51);
          g.agregarRuta("El_Progreso", "Moyuta", 60);
          g.agregarRuta("El_Progreso", "Pasaco", 101);
          g.agregarRuta("El_Progreso", "Quesada", 28);
          g.agregarRuta("El_Progreso", "San_Jose_Acatempa", 43);
          g.agregarRuta("El_Progreso", "Santa_Catarina_Mita", 19);
          g.agregarRuta("El_Progreso", "Yupiltepeque", 34);
          g.agregarRuta("El_Progreso", "Zapotitlan", 34);
          g.agregarRuta("Jalpatagua", "Jerez", 75);
          g.agregarRuta("Jalpatagua", "Moyuta", 22);
          g.agregarRuta("Jalpatagua", "Pasaco", 63);
          g.agregarRuta("Jalpatagua", "Quesada", 24);
          g.agregarRuta("Jalpatagua", "San_Jose_Acatempa", 35);
          g.agregarRuta("Jalpatagua", "Santa_Catarina_Mita", 70);
          g.agregarRuta("Jalpatagua", "Yupiltepeque", 59);
          g.agregarRuta("Jalpatagua", "Zapotitlan", 69);
          g.agregarRuta("Jerez", "Moyuta", 87);
          g.agregarRuta("Jerez", "Pasaco", 128);
          g.agregarRuta("Jerez", "Quesada", 55);
          g.agregarRuta("Jerez", "San_Jose_Acatempa", 71);
          g.agregarRuta("Jerez", "Santa_Catarina_Mita", 58);
          g.agregarRuta("Jerez", "Yupiltepeque", 16);
          g.agregarRuta("Jerez", "Zapotitlan", 18);
          g.agregarRuta("Moyuta", "Pasaco", 41);
          g.agregarRuta("Moyuta", "Quesada", 36);
          g.agregarRuta("Moyuta", "San_Jose_Acatempa", 47);
          g.agregarRuta("Moyuta", "Santa_Catarina_Mita", 81);
          g.agregarRuta("Moyuta", "Yupiltepeque", 71);
          g.agregarRuta("Moyuta", "Zapotitlan", 81);
          g.agregarRuta("Pasaco", "Quesada", 77);
          g.agregarRuta("Pasaco", "Quesada", 88);
          g.agregarRuta("Pasaco", "Quesada", 123);
          g.agregarRuta("Pasaco", "Quesada", 112);
          g.agregarRuta("Pasaco", "Quesada", 122);
          g.agregarRuta("Quesada", "San_Jose_Acatempa", 20);
          g.agregarRuta("Quesada", "Santa_Catarina_Mita", 50);
          g.agregarRuta("Quesada", "Yupiltepeque", 39);
          g.agregarRuta("Quesada", "Zapotitlan", 39);
          g.agregarRuta("San_Jose_Acatempa", "Santa_Catarina_Mita", 65);
          g.agregarRuta("San_Jose_Acatempa", "Yupiltepeque", 54);
          g.agregarRuta("San_Jose_Acatempa", "Zapotitlan", 64);
          g.agregarRuta("Santa_Catarina_Mita", "Yupiltepeque", 37);
          g.agregarRuta("Santa_Catarina_Mita", "Zapotitlan", 47);
          g.agregarRuta("Yupiltepeque", "Zapotitlan", 10);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        INCIO = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        MunicipioD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BUSCAR = new javax.swing.JButton();
        ESCRIBIR_RUTA = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        jLabel1.setText("RUTA MAS CORTA");

        INCIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INCIOActionPerformed(evt);
            }
        });

        jLabel2.setText("Municipio al cual va a llegar");

        jLabel3.setText("Municipio del cual va a partir");

        BUSCAR.setBackground(new java.awt.Color(255, 255, 255));
        BUSCAR.setText("BUSCAR RUTA");
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        ESCRIBIR_RUTA.setBackground(new java.awt.Color(255, 255, 255));
        ESCRIBIR_RUTA.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("MUNICIPIOS DE JUTIAPA:\n1. Jutiapa.\n2. Agua_Blanca.\n3. Asuncion_Mita.\n4. Atescatempa.\n5. Comapa.\n6. Conguaco.\n7. El_Adelanto.\n8. El_Progreso\n9. Jalpatagua.\n10. Jerez.\n11. Moyuta\n12. Pasaco\n13. Quesada\n14. San_Jose_Acatempa\n15. Santa_Catarina_Mita\n16. Yupiltepeque\n17. Zapotitlan");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BUSCAR, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(INCIO, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(MunicipioD, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addComponent(ESCRIBIR_RUTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(INCIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MunicipioD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ESCRIBIR_RUTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addComponent(BUSCAR)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INCIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INCIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INCIOActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        // TODO add your handling code here:        
        Grafo g = new Grafo("Jutiapa;Agua_Blanca;Asuncion_Mita;Atescatempa;Comapa;Conguaco;"
                  + "El_Adelanto;El_Progreso;Jalpatagua;Jerez;Moyuta;Pasaco;Quesada;San_Jose_Acatempa;"
                  + "Santa_Catarina_Mita;Yupiltepeque;Zapotitlan");
          g.agregarRuta("Jutiapa", "Agua_Blanca", 47);
          g.agregarRuta("Jutiapa", "Asuncion_Mita", 32);
          g.agregarRuta("Jutiapa", "Atescatempa", 38);
          g.agregarRuta("Jutiapa", "Comapa", 44);
          g.agregarRuta("Jutiapa", "Conguaco", 50);
          g.agregarRuta("Jutiapa", "El_Adelanto", 31);
          g.agregarRuta("Jutiapa", "El_Progreso", 15);
          g.agregarRuta("Jutiapa", "Jalpatagua", 42);
          g.agregarRuta("Jutiapa", "Jerez", 39);
          g.agregarRuta("Jutiapa", "Moyuta", 52);
          g.agregarRuta("Jutiapa", "Pasaco", 93);
          g.agregarRuta("Jutiapa", "Quesada", 22);
          g.agregarRuta("Jutiapa", "San_Jose_Acatempa", 36);
          g.agregarRuta("Jutiapa", "Santa_Catarina_Mita", 37);
          g.agregarRuta("Jutiapa", "Yupiltepeque", 23);
          g.agregarRuta("Jutiapa", "Zapotitlan", 33);
          g.agregarRuta("Agua_Blanca", "Asuncion_Mita", 28);
          g.agregarRuta("Agua_Blanca", "Atescatempa", 57);
          g.agregarRuta("Agua_Blanca", "Comapa", 83);
          g.agregarRuta("Agua_Blanca", "Conguaco", 90);
          g.agregarRuta("Agua_Blanca", "El_Adelanto", 71);
          g.agregarRuta("Agua_Blanca", "El_Progreso", 35);
          g.agregarRuta("Agua_Blanca", "Jalpatagua", 80);
          g.agregarRuta("Agua_Blanca", "Jerez", 69);
          g.agregarRuta("Agua_Blanca", "Moyuta", 92);
          g.agregarRuta("Agua_Blanca", "Pasaco", 133);
          g.agregarRuta("Agua_Blanca", "Quesada", 61);
          g.agregarRuta("Agua_Blanca", "San_Jose_Acatempa", 76);
          g.agregarRuta("Agua_Blanca", "Santa_Catarina_Mita", 16);
          g.agregarRuta("Agua_Blanca", "Yupiltepeque", 47);
          g.agregarRuta("Agua_Blanca", "Zapotitlan", 57);
          g.agregarRuta("Asuncion_Mita", "Atescatempa", 30);
          g.agregarRuta("Asuncion_Mita", "Comapa", 68);
          g.agregarRuta("Asuncion_Mita", "Conguaco", 75);
          g.agregarRuta("Asuncion_Mita", "El_Adelanto", 28);
          g.agregarRuta("Asuncion_Mita", "El_Progreso", 20);
          g.agregarRuta("Asuncion_Mita", "Jalpatagua", 65);
          g.agregarRuta("Asuncion_Mita", "Jerez", 42);
          g.agregarRuta("Asuncion_Mita", "Moyuta", 77);
          g.agregarRuta("Asuncion_Mita", "Pasaco", 118);
          g.agregarRuta("Asuncion_Mita", "Quesada", 45);
          g.agregarRuta("Asuncion_Mita", "San_Jose_Acatempa", 61);
          g.agregarRuta("Asuncion_Mita", "Santa_Catarina_Mita", 17);
          g.agregarRuta("Asuncion_Mita", "Yupiltepeque", 20);
          g.agregarRuta("Asuncion_Mita", "Zapotitlan", 30);
          g.agregarRuta("Atescatempa", "Comapa", 76);
          g.agregarRuta("Atescatempa", "Conguaco", 84);
          g.agregarRuta("Atescatempa", "El_Adelanto", 16);
          g.agregarRuta("Atescatempa", "El_Progreso", 49);
          g.agregarRuta("Atescatempa", "Jalpatagua", 74);
          g.agregarRuta("Atescatempa", "Jerez", 12);
          g.agregarRuta("Atescatempa", "Moyuta", 85);
          g.agregarRuta("Atescatempa", "Pasaco", 127);
          g.agregarRuta("Atescatempa", "Quesada", 53);
          g.agregarRuta("Atescatempa", "San_Jose_Acatempa", 69);
          g.agregarRuta("Atescatempa", "Santa_Catarina_Mita", 46);
          g.agregarRuta("Atescatempa", "Yupiltepeque", 15);
          g.agregarRuta("Atescatempa", "Zapotitlan", 17);
          g.agregarRuta("Comapa", "Conguaco", 38);
          g.agregarRuta("Comapa", "El_Adelanto", 66);
          g.agregarRuta("Comapa", "El_Progreso", 51);
          g.agregarRuta("Comapa", "Jalpatagua", 15);
          g.agregarRuta("Comapa", "Jerez", 78);
          g.agregarRuta("Comapa", "Moyuta", 40);
          g.agregarRuta("Comapa", "Pasaco", 81);
          g.agregarRuta("Comapa", "Quesada", 27);
          g.agregarRuta("Comapa", "San_Jose_Acatempa", 38);
          g.agregarRuta("Comapa", "Santa_Catarina_Mita", 72);
          g.agregarRuta("Comapa", "Yupiltepeque", 62);
          g.agregarRuta("Comapa", "Zapotitlan", 71);
          g.agregarRuta("Conguaco", "El_Adelanto", 73);
          g.agregarRuta("Conguaco", "El_Progreso", 58);
          g.agregarRuta("Conguaco", "Jalpatagua", 20);
          g.agregarRuta("Conguaco", "Jerez", 85);
          g.agregarRuta("Conguaco", "Moyuta", 7);
          g.agregarRuta("Conguaco", "Pasaco", 47);
          g.agregarRuta("Conguaco", "Quesada", 34);
          g.agregarRuta("Conguaco", "San_Jose_Acatempa", 45);
          g.agregarRuta("Conguaco", "Santa_Catarina_Mita", 80);
          g.agregarRuta("Conguaco", "Yupiltepeque", 69);
          g.agregarRuta("Conguaco", "Zapotitlan", 79);
          g.agregarRuta("El_Adelanto", "El_Progreso", 42);
          g.agregarRuta("El_Adelanto", "Jalpatagua", 66);
          g.agregarRuta("El_Adelanto", "Jerez", 17);
          g.agregarRuta("El_Adelanto", "Moyuta", 78);
          g.agregarRuta("El_Adelanto", "Pasaco", 119);
          g.agregarRuta("El_Adelanto", "Quesada", 46);
          g.agregarRuta("El_Adelanto", "San_Jose_Acatempa", 62);
          g.agregarRuta("El_Adelanto", "Santa_Catarina_Mita", 44);
          g.agregarRuta("El_Adelanto", "Yupiltepeque", 7);
          g.agregarRuta("El_Adelanto", "Zapotitlan", 6);
          g.agregarRuta("El_Progreso", "Jalpatagua", 48);
          g.agregarRuta("El_Progreso", "Jerez", 51);
          g.agregarRuta("El_Progreso", "Moyuta", 60);
          g.agregarRuta("El_Progreso", "Pasaco", 101);
          g.agregarRuta("El_Progreso", "Quesada", 28);
          g.agregarRuta("El_Progreso", "San_Jose_Acatempa", 43);
          g.agregarRuta("El_Progreso", "Santa_Catarina_Mita", 19);
          g.agregarRuta("El_Progreso", "Yupiltepeque", 34);
          g.agregarRuta("El_Progreso", "Zapotitlan", 34);
          g.agregarRuta("Jalpatagua", "Jerez", 75);
          g.agregarRuta("Jalpatagua", "Moyuta", 22);
          g.agregarRuta("Jalpatagua", "Pasaco", 63);
          g.agregarRuta("Jalpatagua", "Quesada", 24);
          g.agregarRuta("Jalpatagua", "San_Jose_Acatempa", 35);
          g.agregarRuta("Jalpatagua", "Santa_Catarina_Mita", 70);
          g.agregarRuta("Jalpatagua", "Yupiltepeque", 59);
          g.agregarRuta("Jalpatagua", "Zapotitlan", 69);
          g.agregarRuta("Jerez", "Moyuta", 87);
          g.agregarRuta("Jerez", "Pasaco", 128);
          g.agregarRuta("Jerez", "Quesada", 55);
          g.agregarRuta("Jerez", "San_Jose_Acatempa", 71);
          g.agregarRuta("Jerez", "Santa_Catarina_Mita", 58);
          g.agregarRuta("Jerez", "Yupiltepeque", 16);
          g.agregarRuta("Jerez", "Zapotitlan", 18);
          g.agregarRuta("Moyuta", "Pasaco", 41);
          g.agregarRuta("Moyuta", "Quesada", 36);
          g.agregarRuta("Moyuta", "San_Jose_Acatempa", 47);
          g.agregarRuta("Moyuta", "Santa_Catarina_Mita", 81);
          g.agregarRuta("Moyuta", "Yupiltepeque", 71);
          g.agregarRuta("Moyuta", "Zapotitlan", 81);
          g.agregarRuta("Pasaco", "Quesada", 77);
          g.agregarRuta("Pasaco", "Quesada", 88);
          g.agregarRuta("Pasaco", "Quesada", 123);
          g.agregarRuta("Pasaco", "Quesada", 112);
          g.agregarRuta("Pasaco", "Quesada", 122);
          g.agregarRuta("Quesada", "San_Jose_Acatempa", 20);
          g.agregarRuta("Quesada", "Santa_Catarina_Mita", 50);
          g.agregarRuta("Quesada", "Yupiltepeque", 39);
          g.agregarRuta("Quesada", "Zapotitlan", 39);
          g.agregarRuta("San_Jose_Acatempa", "Santa_Catarina_Mita", 65);
          g.agregarRuta("San_Jose_Acatempa", "Yupiltepeque", 54);
          g.agregarRuta("San_Jose_Acatempa", "Zapotitlan", 64);
          g.agregarRuta("Santa_Catarina_Mita", "Yupiltepeque", 37);
          g.agregarRuta("Santa_Catarina_Mita", "Zapotitlan", 47);
          g.agregarRuta("Yupiltepeque", "Zapotitlan", 10);
        String rI = INCIO.getText();
        String rF = MunicipioD.getText();
        String respuesta = g.encontrarRutaMinimaDijkstra(rI, rF);
        ESCRIBIR_RUTA.setText(respuesta);
    }//GEN-LAST:event_BUSCARActionPerformed

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
            java.util.logging.Logger.getLogger(Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUSCAR;
    private javax.swing.JLabel ESCRIBIR_RUTA;
    private javax.swing.JTextField INCIO;
    private javax.swing.JTextField MunicipioD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
