package Front.Rentas;

import Logic.Interaccion;
import java.awt.Color;
import java.awt.Font;

/*
 * @autores Cinefilos de EDA
 */
public class JPRentas extends javax.swing.JPanel {

    Interaccion interaccion = new Interaccion();
    JFRentar prestamo = new JFRentar();
    String selectTabla = "prestamoPelicula";
    String SQL;
    public JPRentas() {
        initComponents();
        Interaccion interaccion = new Interaccion();
        this.SQL = "select * from prestamoPelicula";
        interaccion.busquedaDespliegue(jTableTablaRentas, selectTabla, SQL);
        jTableTablaRentas.getTableHeader().setBackground(new Color(127, 0, 0));
        jTableTablaRentas.getTableHeader().setFont(new Font("Segoe UI Symbol", Font.BOLD, 12));
        jTableTablaRentas.getTableHeader().setForeground(Color.WHITE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTablaRentas = new javax.swing.JTable();
        jButtonNuevoPres = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jTableTablaRentas.setAutoCreateRowSorter(true);
        jTableTablaRentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(127, 0, 0)));
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
        jTableTablaRentas.setGridColor(new java.awt.Color(127, 0, 0));
        jTableTablaRentas.setSelectionBackground(new java.awt.Color(255, 214, 214));
        jTableTablaRentas.setShowGrid(true);
        jScrollPane1.setViewportView(jTableTablaRentas);

        jButtonNuevoPres.setBackground(new java.awt.Color(56, 56, 56));
        jButtonNuevoPres.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevoPres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EditarPre2.png"))); // NOI18N
        jButtonNuevoPres.setText("prestar");
        jButtonNuevoPres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonNuevoPres.setBorderPainted(false);
        jButtonNuevoPres.setMaximumSize(new java.awt.Dimension(71, 34));
        jButtonNuevoPres.setMinimumSize(new java.awt.Dimension(71, 34));
        jButtonNuevoPres.setPreferredSize(new java.awt.Dimension(71, 34));
        jButtonNuevoPres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AceptarPre.png"))); // NOI18N
        jButtonNuevoPres.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AceptarPre.png"))); // NOI18N
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
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonNuevoPres, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonNuevoPres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
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
