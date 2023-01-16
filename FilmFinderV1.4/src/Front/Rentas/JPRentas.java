package Front.Rentas;

import Logic.Interaccion;

/*
 * @autores Cinefilos de EDA
 */
public class JPRentas extends javax.swing.JPanel {

    Interaccion interaccion = new Interaccion();
    JFRentar prestamo = new JFRentar();
    JFDevolver devolver =  new JFDevolver();
    String selectTabla = "prestamoPelicula";
    String SQL;
    public JPRentas() {
        initComponents();
        Interaccion interaccion = new Interaccion();
        this.SQL = "select * from prestamoPelicula";
        interaccion.busquedaDespliegue(jTableTablaRentas, selectTabla, SQL);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTablaRentas = new javax.swing.JTable();
        jButtonNuevoPres = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jTableTablaRentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Prestamo", "Id Pelicula", "Titulo", "Id Usuario", "Nombre", "Apellido", "Fecha Prestamo", "Fecha Devolucion"
            }
        ));
        jScrollPane1.setViewportView(jTableTablaRentas);

        jButtonNuevoPres.setText("PRESTAR");
        jButtonNuevoPres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNuevoPresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNuevoPresMouseExited(evt);
            }
        });
        jButtonNuevoPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoPresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButtonNuevoPres)))
                .addContainerGap(527, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButtonNuevoPres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoPresActionPerformed
        prestamo.setVisible(true);
    }//GEN-LAST:event_jButtonNuevoPresActionPerformed

    private void jButtonNuevoPresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoPresMouseEntered
        this.jButtonNuevoPres.setText("PRESTAR");
    }//GEN-LAST:event_jButtonNuevoPresMouseEntered

    private void jButtonNuevoPresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoPresMouseExited
        this.jButtonNuevoPres.setText("prestar");
    }//GEN-LAST:event_jButtonNuevoPresMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNuevoPres;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTablaRentas;
    // End of variables declaration//GEN-END:variables
}
