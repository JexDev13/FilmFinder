package Front.Peliculas;

import Logic.Interaccion;
import Logic.Comprobaciones;
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * @author Arias,Tibanta, Armijo, Salazar J, Salazar S
 */
public class JFEstudianteEliminar extends javax.swing.JFrame {

    private int x;
    private int y;
    private String SQL;
    private String tablaEliminar = "pelicula";
    Interaccion atributos = new Interaccion();
    Comprobaciones name = new Comprobaciones();

    public JFEstudianteEliminar() {
        initComponents();
        setLocationRelativeTo(this);
        jComboBoxFiltrarEstudiante.setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPDatosEstudianteEliminar = new javax.swing.JPanel();
        jLabelCod = new javax.swing.JLabel();
        jTFCodigo_EliminarEst = new javax.swing.JTextField();
        jLabelNom = new javax.swing.JLabel();
        jTFNombres_EliminarEst = new javax.swing.JTextField();
        jLabelApe = new javax.swing.JLabel();
        jTFApellidos_EliminarEst = new javax.swing.JTextField();
        jLabelSector = new javax.swing.JLabel();
        jTFCelu_EliminarEst = new javax.swing.JTextField();
        jLabelCelu = new javax.swing.JLabel();
        jTFFacultad_EliminarEst = new javax.swing.JTextField();
        jLabelCorre = new javax.swing.JLabel();
        jTFCorreo_EliminarEst = new javax.swing.JTextField();
        jLabelFacu = new javax.swing.JLabel();
        jTFSectorEst_EliminarEst = new javax.swing.JTextField();
        jLabelDirector = new javax.swing.JLabel();
        jTFDirector_Eliminar = new javax.swing.JTextField();
        jPanelDatoEstudiante = new javax.swing.JPanel();
        jTFBuscar_EliminarEst = new javax.swing.JTextField();
        jComboBoxFiltrarEstudiante = new javax.swing.JComboBox<>();
        jBMax = new javax.swing.JButton();
        jBSalirIcon = new javax.swing.JButton();
        jLEncabezado = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JButton();
        jBRegistrar = new javax.swing.JButton();
        jLPie = new javax.swing.JLabel();
        jLCuerpo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(380, 475));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Eliminar Pelicula");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 210, 30);

        jPDatosEstudianteEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosEstudianteEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Eliminar"));

        jLabelCod.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCod.setForeground(new java.awt.Color(127, 0, 0));
        jLabelCod.setText("Codigo");

        jTFCodigo_EliminarEst.setEditable(false);
        jTFCodigo_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFCodigo_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelNom.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelNom.setForeground(new java.awt.Color(127, 0, 0));
        jLabelNom.setText("Nombre");

        jTFNombres_EliminarEst.setEditable(false);
        jTFNombres_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFNombres_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelApe.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelApe.setForeground(new java.awt.Color(127, 0, 0));
        jLabelApe.setText("Estreno");

        jTFApellidos_EliminarEst.setEditable(false);
        jTFApellidos_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFApellidos_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelSector.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelSector.setForeground(new java.awt.Color(127, 0, 0));
        jLabelSector.setText("Puntaje");

        jTFCelu_EliminarEst.setEditable(false);
        jTFCelu_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFCelu_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelCelu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCelu.setForeground(new java.awt.Color(127, 0, 0));
        jLabelCelu.setText("Idioma");

        jTFFacultad_EliminarEst.setEditable(false);
        jTFFacultad_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFFacultad_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelCorre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCorre.setForeground(new java.awt.Color(127, 0, 0));
        jLabelCorre.setText("Genero");

        jTFCorreo_EliminarEst.setEditable(false);
        jTFCorreo_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFCorreo_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelFacu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelFacu.setForeground(new java.awt.Color(127, 0, 0));
        jLabelFacu.setText("Sipnosis");

        jTFSectorEst_EliminarEst.setEditable(false);
        jTFSectorEst_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFSectorEst_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelDirector.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelDirector.setForeground(new java.awt.Color(127, 0, 0));
        jLabelDirector.setText("Director");

        jTFDirector_Eliminar.setEditable(false);
        jTFDirector_Eliminar.setBackground(new java.awt.Color(255, 255, 255));
        jTFDirector_Eliminar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPDatosEstudianteEliminarLayout = new javax.swing.GroupLayout(jPDatosEstudianteEliminar);
        jPDatosEstudianteEliminar.setLayout(jPDatosEstudianteEliminarLayout);
        jPDatosEstudianteEliminarLayout.setHorizontalGroup(
            jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosEstudianteEliminarLayout.createSequentialGroup()
                        .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelApe)
                            .addComponent(jLabelCelu)
                            .addComponent(jLabelSector)
                            .addComponent(jLabelFacu)
                            .addComponent(jLabelCorre)
                            .addComponent(jLabelDirector))
                        .addGap(18, 18, 18)
                        .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFFacultad_EliminarEst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTFSectorEst_EliminarEst, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFCelu_EliminarEst, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFApellidos_EliminarEst)
                            .addComponent(jTFCorreo_EliminarEst)
                            .addComponent(jTFDirector_Eliminar)))
                    .addGroup(jPDatosEstudianteEliminarLayout.createSequentialGroup()
                        .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatosEstudianteEliminarLayout.createSequentialGroup()
                                .addComponent(jLabelNom)
                                .addGap(23, 23, 23))
                            .addGroup(jPDatosEstudianteEliminarLayout.createSequentialGroup()
                                .addComponent(jLabelCod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFCodigo_EliminarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTFNombres_EliminarEst))))
                .addGap(19, 19, 19))
        );
        jPDatosEstudianteEliminarLayout.setVerticalGroup(
            jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombres_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFApellidos_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApe))
                .addGap(6, 6, 6)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCelu_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelu))
                .addGap(6, 6, 6)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFSectorEst_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSector))
                .addGap(6, 6, 6)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFFacultad_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFacu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCorreo_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCorre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDirector_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDirector))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        getContentPane().add(jPDatosEstudianteEliminar);
        jPDatosEstudianteEliminar.setBounds(10, 120, 360, 280);

        jPanelDatoEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de la Pelicula"));

        jTFBuscar_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_EliminarEst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarEstKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarEstKeyTyped(evt);
            }
        });

        jComboBoxFiltrarEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código de la pelicula", "Nombre de la pelicula" }));
        jComboBoxFiltrarEstudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(147, 0, 0)));

        javax.swing.GroupLayout jPanelDatoEstudianteLayout = new javax.swing.GroupLayout(jPanelDatoEstudiante);
        jPanelDatoEstudiante.setLayout(jPanelDatoEstudianteLayout);
        jPanelDatoEstudianteLayout.setHorizontalGroup(
            jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxFiltrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jTFBuscar_EliminarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoEstudianteLayout.setVerticalGroup(
            jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFiltrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDatoEstudiante);
        jPanelDatoEstudiante.setBounds(10, 40, 360, 70);

        jBMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimizar icon prev 32.png"))); // NOI18N
        jBMax.setToolTipText("minimizar");
        jBMax.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(48, 108, 97)));
        jBMax.setBorderPainted(false);
        jBMax.setContentAreaFilled(false);
        jBMax.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBMax.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBMax.setPreferredSize(new java.awt.Dimension(24, 24));
        jBMax.setRequestFocusEnabled(false);
        jBMax.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimizar icon pos 32.png"))); // NOI18N
        jBMax.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimizar icon pos 32.png"))); // NOI18N
        jBMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMaxActionPerformed(evt);
            }
        });
        getContentPane().add(jBMax);
        jBMax.setBounds(280, 0, 52, 30);

        jBSalirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salir icon prev 32.png"))); // NOI18N
        jBSalirIcon.setToolTipText("salir");
        jBSalirIcon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(48, 108, 97)));
        jBSalirIcon.setBorderPainted(false);
        jBSalirIcon.setContentAreaFilled(false);
        jBSalirIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBSalirIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSalirIcon.setPreferredSize(new java.awt.Dimension(24, 24));
        jBSalirIcon.setRequestFocusEnabled(false);
        jBSalirIcon.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salir icon post 32.png"))); // NOI18N
        jBSalirIcon.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salir icon post 32.png"))); // NOI18N
        jBSalirIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirIconActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalirIcon);
        jBSalirIcon.setBounds(330, 0, 52, 30);

        jLEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        jLEncabezado.setOpaque(true);
        getContentPane().add(jLEncabezado);
        jLEncabezado.setBounds(0, 0, 380, 30);

        jBCancelar.setBackground(new java.awt.Color(56, 56, 56));
        jBCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CancelarPos.png"))); // NOI18N
        jBCancelar.setText("cancelar");
        jBCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(147, 0, 0)));
        jBCancelar.setPreferredSize(new java.awt.Dimension(73, 40));
        jBCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancelar selected 32 .png"))); // NOI18N
        jBCancelar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancelar selected 32 .png"))); // NOI18N
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
        getContentPane().add(jBCancelar);
        jBCancelar.setBounds(70, 420, 110, 40);

        jBRegistrar.setBackground(new java.awt.Color(56, 56, 56));
        jBRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jBRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AceptarPre.png"))); // NOI18N
        jBRegistrar.setText("eliminar");
        jBRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(147, 0, 0)));
        jBRegistrar.setPreferredSize(new java.awt.Dimension(73, 40));
        jBRegistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aceptar 32.png"))); // NOI18N
        jBRegistrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aceptar 32.png"))); // NOI18N
        jBRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBRegistrarMouseExited(evt);
            }
        });
        jBRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBRegistrar);
        jBRegistrar.setBounds(200, 420, 110, 40);

        jLPie.setBackground(new java.awt.Color(0, 0, 0));
        jLPie.setOpaque(true);
        getContentPane().add(jLPie);
        jLPie.setBounds(0, 410, 380, 80);

        jLCuerpo.setBackground(new java.awt.Color(255, 255, 255));
        jLCuerpo.setOpaque(true);
        getContentPane().add(jLCuerpo);
        jLCuerpo.setBounds(0, 30, 380, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jTFBuscar_EliminarEstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarEstKeyTyped
        char variable = evt.getKeyChar();
        int select = this.jComboBoxFiltrarEstudiante.getSelectedIndex();
        switch (select) {
            case 0: {
                if (Character.isLetter(variable)) {
                    getToolkit().beep();
                    evt.consume();

                }
                break;
            }
        }
    }//GEN-LAST:event_jTFBuscar_EliminarEstKeyTyped

    private void jTFBuscar_EliminarEstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarEstKeyReleased
        int select = jComboBoxFiltrarEstudiante.getSelectedIndex();
        String datoBusqueda = this.jTFBuscar_EliminarEst.getText();
        switch (select) {
            case 0: {
                this.SQL = "Select count(*) from pelicula where idPelicula like '" + datoBusqueda + "';";
                if (atributos.busquedaCod(tablaEliminar, SQL, "count(*)") == 0) {
                    getToolkit().beep();

                } else {
                    this.SQL = "SELECT * FROM " + tablaEliminar + " WHERE idPelicula like '" + datoBusqueda + "';";
                    atributos.despliegueFields(SQL, tablaEliminar, jTFCodigo_EliminarEst, jTFNombres_EliminarEst,
                            jTFApellidos_EliminarEst, jTFCelu_EliminarEst, jTFSectorEst_EliminarEst,
                            jTFFacultad_EliminarEst, jTFCorreo_EliminarEst, jTFDirector_Eliminar, "actualizar");
                }
                break;
            }
            case 1: {
                this.SQL = "SELECT * FROM " + tablaEliminar + " WHERE nombrePelicula like '%" + datoBusqueda + "%'";
                atributos.despliegueFields(SQL, tablaEliminar, jTFCodigo_EliminarEst, jTFNombres_EliminarEst,
                        jTFApellidos_EliminarEst, jTFCelu_EliminarEst, jTFSectorEst_EliminarEst,
                        jTFFacultad_EliminarEst, jTFCorreo_EliminarEst, jTFDirector_Eliminar, "actualizar");
                break;
            }
        }
    }//GEN-LAST:event_jTFBuscar_EliminarEstKeyReleased

    private void jBMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMaxActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jBMaxActionPerformed

    private void jBSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirIconActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBSalirIconActionPerformed

    private void jBCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseEntered
        this.jBCancelar.setText("CANCELAR");
    }//GEN-LAST:event_jBCancelarMouseEntered

    private void jBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseExited
        this.jBCancelar.setText("cancelar");
    }//GEN-LAST:event_jBCancelarMouseExited

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed

    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRegistrarMouseEntered
        this.jBRegistrar.setText("ELIMINAR");
    }//GEN-LAST:event_jBRegistrarMouseEntered

    private void jBRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRegistrarMouseExited
        this.jBRegistrar.setText("eliminar");
    }//GEN-LAST:event_jBRegistrarMouseExited

    private void jBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarActionPerformed
        int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el elemento?" + "\n     -Esta accion sera permanente e irreversible", "Borrar Pelicula", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (seleccion == 0) {
            this.SQL = "DELETE from " + tablaEliminar + " Where idPelicula= " + this.jTFCodigo_EliminarEst.getText();
            if (atributos.actualizarEliminarTablas(SQL) == true) {
                limpiarCampos();
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_jBRegistrarActionPerformed

    public void limpiarCampos() {
        this.jTFCodigo_EliminarEst.setText("");
        this.jTFNombres_EliminarEst.setText("");
        this.jTFApellidos_EliminarEst.setText("");
        this.jTFCelu_EliminarEst.setText("");
        this.jTFSectorEst_EliminarEst.setText("");
        this.jTFFacultad_EliminarEst.setText("");
        this.jTFCorreo_EliminarEst.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBMax;
    private javax.swing.JButton jBRegistrar;
    private javax.swing.JButton jBSalirIcon;
    private javax.swing.JComboBox<String> jComboBoxFiltrarEstudiante;
    private javax.swing.JLabel jLCuerpo;
    private javax.swing.JLabel jLEncabezado;
    private javax.swing.JLabel jLPie;
    private javax.swing.JLabel jLabelApe;
    private javax.swing.JLabel jLabelCelu;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelCorre;
    private javax.swing.JLabel jLabelDirector;
    private javax.swing.JLabel jLabelFacu;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelSector;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosEstudianteEliminar;
    private javax.swing.JPanel jPanelDatoEstudiante;
    public static javax.swing.JTextField jTFApellidos_EliminarEst;
    public static javax.swing.JTextField jTFBuscar_EliminarEst;
    public static javax.swing.JTextField jTFCelu_EliminarEst;
    public static javax.swing.JTextField jTFCodigo_EliminarEst;
    public static javax.swing.JTextField jTFCorreo_EliminarEst;
    public static javax.swing.JTextField jTFDirector_Eliminar;
    public static javax.swing.JTextField jTFFacultad_EliminarEst;
    public static javax.swing.JTextField jTFNombres_EliminarEst;
    public static javax.swing.JTextField jTFSectorEst_EliminarEst;
    // End of variables declaration//GEN-END:variables
}
