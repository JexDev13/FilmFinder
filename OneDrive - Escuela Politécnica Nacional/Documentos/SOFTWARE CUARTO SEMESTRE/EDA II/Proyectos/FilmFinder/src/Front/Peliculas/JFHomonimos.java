package Front.Peliculas;
import Front.Peliculas.JFEstudianteActualizar;
import Negocio.Interaccion;
import Vista.Estructura.JFLogin;
import Vista.Estudiante.JFEstudianteEliminar;
import Vista.Prestamo.JFPrestamoInsentar;
import java.awt.Color;
import java.awt.Font;
/*
 * @author JEREMY
 */
public class JFHomonimos extends javax.swing.JFrame {
    private int x;
    private int y;
    private String selectTabla="Estudiante";
    private String SQL;
    private int numOperacion;
    JFEstudianteActualizar actual=new JFEstudianteActualizar();
    JFPrestamoInsentar prestamo=new JFPrestamoInsentar();
    Interaccion interBuscar = new Interaccion();
    JFEstudianteEliminar eliminar = new JFEstudianteEliminar();
    public JFHomonimos(String SQL, String uno, String dos, String tres, String cuatro, 
                        String cinco, String seis,String siete, String ocho, String nueve, int operacion) {
        initComponents();
        setLocationRelativeTo(this);
        jTableTablaEstudiantes.getTableHeader().setBackground(new Color(58,160,141));
        jTableTablaEstudiantes.getTableHeader().setFont(new Font("Segoe UI Symbol",Font.BOLD,12));
        jTableTablaEstudiantes.getTableHeader().setForeground(Color.WHITE);
//        ((DefaultTableCellHeaderRenderer)
//            jTableTablaEstudiantes.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.LEFT);    
        this.numOperacion=operacion;
        switch(numOperacion){
            case 1:{actual.setVisible(true); break;}
            case 2:{eliminar.setVisible(true); break;}
            case 3:{
                JFPrestamoInsentar.jTFCod_NomLibro.setText(uno);
                JFPrestamoInsentar.jTextFieldCodPres.setText(tres);
                JFPrestamoInsentar.jTextFieldCodLib.setText(cuatro);
                JFPrestamoInsentar.jTextFieldLibro.setText(cinco);
                JFPrestamoInsentar.jTextFieldCodFP.setText(ocho);
                JFPrestamoInsentar.jTextFieldFD.setText(nueve);
                prestamo.setVisible(true); 
                break;}
        }
        
        this.SQL=SQL;
        interBuscar.busquedaDespliegue(jTableTablaEstudiantes, selectTabla,this.SQL);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTituloTabla = new javax.swing.JLabel();
        jLabelLupaEstu = new javax.swing.JLabel();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelIconFiltro = new javax.swing.JLabel();
        jComboBoxFiltrarEstudiante = new javax.swing.JComboBox<>();
        jLabelTitulo = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JButton();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        jPanelFondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTablaEstudiantes = new javax.swing.JTable();
        jLabelFondi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(930, 340));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTituloTabla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLabelTituloTabla.setForeground(new java.awt.Color(58, 160, 141));
        jLabelTituloTabla.setText("Estudiantes");
        getContentPane().add(jLabelTituloTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabelLupaEstu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon buscar 24.png"))); // NOI18N
        getContentPane().add(jLabelLupaEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, -1, -1));

        jTextFieldBusqueda.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldBusqueda.setText("Buscar nombre");
        jTextFieldBusqueda.setBorder(null);
        getContentPane().add(jTextFieldBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 90, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 170, 10));

        jLabelIconFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar 24.png"))); // NOI18N
        getContentPane().add(jLabelIconFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, -1, -1));

        jComboBoxFiltrarEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por...", "Código del estudiante", "Nombre del estudiante", "Apellido del estudiante", "Celular", "Sector", "Facultad" }));
        jComboBoxFiltrarEstudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 160, 141)));
        getContentPane().add(jComboBoxFiltrarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Estudiantes de nombres homonimos");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 329, 30));

        jBCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jBCancelar.setForeground(new java.awt.Color(58, 160, 141));
        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar 32.png"))); // NOI18N
        jBCancelar.setText("salir");
        jBCancelar.setBorder(null);
        jBCancelar.setBorderPainted(false);
        jBCancelar.setHideActionText(true);
        jBCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBCancelar.setMaximumSize(new java.awt.Dimension(89, 32));
        jBCancelar.setMinimumSize(new java.awt.Dimension(89, 32));
        jBCancelar.setPreferredSize(new java.awt.Dimension(89, 32));
        jBCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar selected 32 .png"))); // NOI18N
        jBCancelar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar selected 32 .png"))); // NOI18N
        jBCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCancelarMouseExited(evt);
            }
        });
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 110, 40));

        jButtonMinimizar.setBackground(new java.awt.Color(91, 165, 152));
        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimizar 24.png"))); // NOI18N
        jButtonMinimizar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(57, 116, 104)));
        jButtonMinimizar.setPreferredSize(new java.awt.Dimension(24, 24));
        jButtonMinimizar.setRequestFocusEnabled(false);
        jButtonMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 30, 30));

        jButtonSalirIcon.setBackground(new java.awt.Color(91, 165, 152));
        jButtonSalirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButtonSalirIcon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(48, 108, 97)));
        jButtonSalirIcon.setPreferredSize(new java.awt.Dimension(24, 24));
        jButtonSalirIcon.setRequestFocusEnabled(false);
        jButtonSalirIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirIconActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 30, 30));

        jPanelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFondo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(0, 0, 0)), "Seleccione el estudiante al que hace referencia"));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 160, 141)));

        jTableTablaEstudiantes.setAutoCreateRowSorter(true);
        jTableTablaEstudiantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 160, 141)));
        jTableTablaEstudiantes.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTableTablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Celular", "Sector", "Facultad", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTablaEstudiantes.setGridColor(new java.awt.Color(120, 188, 176));
        jTableTablaEstudiantes.setSelectionBackground(new java.awt.Color(180, 209, 203));
        jTableTablaEstudiantes.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTableTablaEstudiantes.getTableHeader().setResizingAllowed(false);
        jTableTablaEstudiantes.getTableHeader().setReorderingAllowed(false);
        jTableTablaEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTablaEstudiantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTablaEstudiantes);
        if (jTableTablaEstudiantes.getColumnModel().getColumnCount() > 0) {
            jTableTablaEstudiantes.getColumnModel().getColumn(0).setResizable(false);
            jTableTablaEstudiantes.getColumnModel().getColumn(1).setResizable(false);
            jTableTablaEstudiantes.getColumnModel().getColumn(2).setResizable(false);
            jTableTablaEstudiantes.getColumnModel().getColumn(3).setResizable(false);
            jTableTablaEstudiantes.getColumnModel().getColumn(4).setResizable(false);
            jTableTablaEstudiantes.getColumnModel().getColumn(5).setResizable(false);
            jTableTablaEstudiantes.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 910, 150));

        jLabelFondi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoHomonimos.png"))); // NOI18N
        jLabelFondi.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelFondiMouseDragged(evt);
            }
        });
        jLabelFondi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelFondiMousePressed(evt);
            }
        });
        getContentPane().add(jLabelFondi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseEntered
        if(this.jBCancelar.getText().equalsIgnoreCase("salir")){
            this.jBCancelar.setText("SALIR");
        }
    }//GEN-LAST:event_jBCancelarMouseEntered

    private void jBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseExited
        if(this.jBCancelar.getText().equalsIgnoreCase("SALIR")){
            this.jBCancelar.setText("salir");
        }
    }//GEN-LAST:event_jBCancelarMouseExited

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(JFLogin.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIconActionPerformed

    private void jLabelFondiMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFondiMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX-x,posY-y);
    }//GEN-LAST:event_jLabelFondiMouseDragged

    private void jLabelFondiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFondiMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_jLabelFondiMousePressed

    private void jTableTablaEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTablaEstudiantesMouseClicked
        int seleccion=jTableTablaEstudiantes.getSelectedRow();
        String codigo=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 0));
        String nombre=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 1));
        String apellido=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 2));
        String celular=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 3));
        String sector=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 4));
        String facultad=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 5));
        String correo=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 6));
        switch(numOperacion){
            case 1:{

                JFEstudianteActualizar.jTFBuscar_ActualizarEst.setText(codigo);
                JFEstudianteActualizar.jTFCodigo_ActualizarEst.setText(codigo);
                JFEstudianteActualizar.jTFNombres_ActualizarEst.setText(nombre);
                JFEstudianteActualizar.jTFApellidos_ActualizarEst.setText(apellido);
                JFEstudianteActualizar.jTFCelular_ActualizarEst.setText(celular);
                JFEstudianteActualizar.jTFSector_ActualizarEst.setText(sector);
                JFEstudianteActualizar.jTFFacultad_ActualizarEst.setText(facultad);
                JFEstudianteActualizar.jTFCorreo_ActualizarEst.setText(correo);
                break;
            }
            case 2:{
                JFEstudianteEliminar.jTFBuscar_EliminarEst.setText(codigo);
                JFEstudianteEliminar.jTFCodigo_EliminarEst.setText(codigo);
                JFEstudianteEliminar.jTFNombres_EliminarEst.setText(nombre);
                JFEstudianteEliminar.jTFApellidos_EliminarEst.setText(apellido);
                JFEstudianteEliminar.jTFCelu_EliminarEst.setText(celular);
                JFEstudianteEliminar.jTFSectorEst_EliminarEst.setText(sector);
                JFEstudianteEliminar.jTFFacultad_EliminarEst.setText(facultad);
                JFEstudianteEliminar.jTFCorreo_EliminarEst.setText(correo);
                break;
            }
            case 3:{
                JFPrestamoInsentar.jTextFieldCodEst.setText(codigo);
                JFPrestamoInsentar.jTFCod_NomEst.setText(codigo);
                JFPrestamoInsentar.jTextFieldNomEst.setText(nombre+" "+apellido);
                break;
            }
        }
        
    }//GEN-LAST:event_jTableTablaEstudiantesMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JComboBox<String> jComboBoxFiltrarEstudiante;
    private javax.swing.JLabel jLabelFondi;
    private javax.swing.JLabel jLabelIconFiltro;
    private javax.swing.JLabel jLabelLupaEstu;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloTabla;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jTableTablaEstudiantes;
    private javax.swing.JTextField jTextFieldBusqueda;
    // End of variables declaration//GEN-END:variables
}