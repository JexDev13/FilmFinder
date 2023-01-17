package Front.Rentas;

import Logic.Interaccion;
import java.awt.Color;
import java.awt.Font;

/*
 * @autores Cinefilos de EDA
 */
public class JPTablaRentas extends javax.swing.JPanel {

    Interaccion interaccion = new Interaccion();
    JFRentar prestamo = new JFRentar();
    String selectTabla = "prestamoPelicula";
    String SQL;

    public JPTablaRentas() {
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
        jLabelLupaEstu = new javax.swing.JLabel();
        jLabelIconFiltro = new javax.swing.JLabel();
        jComboBoxFiltrarEstudiante = new javax.swing.JComboBox<>();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        jTableTablaRentas.setAutoCreateRowSorter(true);
        jTableTablaRentas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(127, 0, 0), 1, true));
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
        jTableTablaRentas.setSelectionBackground(new java.awt.Color(255, 214, 214));
        jTableTablaRentas.setShowGrid(true);
        jTableTablaRentas.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(jTableTablaRentas);

        jButtonNuevoPres.setBackground(new java.awt.Color(56, 56, 56));
        jButtonNuevoPres.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevoPres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NuevoPre2.png"))); // NOI18N
        jButtonNuevoPres.setText("prestar");
        jButtonNuevoPres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonNuevoPres.setBorderPainted(false);
        jButtonNuevoPres.setMaximumSize(new java.awt.Dimension(71, 34));
        jButtonNuevoPres.setMinimumSize(new java.awt.Dimension(71, 34));
        jButtonNuevoPres.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonNuevoPres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NuevoPps.png"))); // NOI18N
        jButtonNuevoPres.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NuevoPps.png"))); // NOI18N
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

        jLabelLupaEstu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconBuscar24.png"))); // NOI18N

        jLabelIconFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/filtrar 24.png"))); // NOI18N

        jComboBoxFiltrarEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por...", "Id Prestamo", "Id Pelicula", "Titulo", "Id Usuario", "Nombre", "Apellido" }));
        jComboBoxFiltrarEstudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(127, 0, 0)));
        jComboBoxFiltrarEstudiante.setFocusable(false);
        jComboBoxFiltrarEstudiante.setLightWeightPopupEnabled(false);
        jComboBoxFiltrarEstudiante.setRequestFocusEnabled(false);
        jComboBoxFiltrarEstudiante.setVerifyInputWhenFocusTarget(false);
        jComboBoxFiltrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFiltrarEstudianteActionPerformed(evt);
            }
        });

        jTextFieldBusqueda.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldBusqueda.setText("Buscar nombre");
        jTextFieldBusqueda.setBorder(null);
        jTextFieldBusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldBusquedaFocusLost(evt);
            }
        });
        jTextFieldBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldBusquedaMousePressed(evt);
            }
        });
        jTextFieldBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBusquedaKeyReleased(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setRequestFocusEnabled(false);
        jSeparator1.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonNuevoPres, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelLupaEstu)
                        .addGap(12, 12, 12)
                        .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelIconFiltro)
                        .addGap(6, 6, 6)
                        .addComponent(jComboBoxFiltrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNuevoPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabelLupaEstu))
                            .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIconFiltro)
                            .addComponent(jComboBoxFiltrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void jComboBoxFiltrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFiltrarEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFiltrarEstudianteActionPerformed

    private void jTextFieldBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaFocusLost
        if (jTextFieldBusqueda.getText().isEmpty()) {
            this.jTextFieldBusqueda.setText("Buscar nombre");
        }
    }//GEN-LAST:event_jTextFieldBusquedaFocusLost

    private void jTextFieldBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaMousePressed
        if (jTextFieldBusqueda.getText().equalsIgnoreCase("Buscar nombre")) {
            jTextFieldBusqueda.setText("");
        }
    }//GEN-LAST:event_jTextFieldBusquedaMousePressed

    private void jTextFieldBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaKeyReleased
        String Parametro_de_busqueda_estudiante = "idPrestamo";
        String Busqueda = this.jTextFieldBusqueda.getText();
        switch (this.jComboBoxFiltrarEstudiante.getSelectedIndex()) {
            case 0: {
                Parametro_de_busqueda_estudiante = "idPrestamo";
                break;
            }
            case 1: {
                Parametro_de_busqueda_estudiante = "idPrestamo";
                break;
            }
            case 2: {
                Parametro_de_busqueda_estudiante = "IdPelicula";
                break;
            }
            case 3: {
                Parametro_de_busqueda_estudiante = "Titulo";
                break;
            }
            case 4: {
                Parametro_de_busqueda_estudiante = "idEstudiante";
                break;
            }
            case 5: {
                Parametro_de_busqueda_estudiante = "NombreEstudiante";
                break;
            }
            case 6: {
                Parametro_de_busqueda_estudiante = "ApellidoEstudiante";
                break;
            }
        }
        this.SQL = "SELECT * FROM " + selectTabla + " WHERE " + Parametro_de_busqueda_estudiante + " like '%" + Busqueda + "%'";
        interaccion.busquedaDespliegue(this.jTableTablaRentas, this.selectTabla, this.SQL);
    }//GEN-LAST:event_jTextFieldBusquedaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNuevoPres;
    private javax.swing.JComboBox<String> jComboBoxFiltrarEstudiante;
    private javax.swing.JLabel jLabelIconFiltro;
    private javax.swing.JLabel jLabelLupaEstu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableTablaRentas;
    private javax.swing.JTextField jTextFieldBusqueda;
    // End of variables declaration//GEN-END:variables
}
