package Front.Peliculas;

import Logic.Interaccion;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableModel;

/*
 * @autores Cinefilos de EDA
 */
public class JPPeliculas extends javax.swing.JPanel {

    Interaccion atributos = new Interaccion();
    JFPeliculasInsentar insertar = new JFPeliculasInsentar();
    JFEstudianteActualizar actualizar = new JFEstudianteActualizar();
    private String selectTabla = "pelicula";
    private String SQL;
    Interaccion con = new Interaccion();
    DefaultTableModel tabla = new DefaultTableModel();

    public JPPeliculas() {
        initComponents();
        jComboBoxFiltrarPeli.setBackground(Color.WHITE);
        jTableTablaPeli.getTableHeader().setBackground(new Color(127, 0, 0));
        jTableTablaPeli.getTableHeader().setFont(new Font("Segoe UI Symbol", Font.BOLD, 12));
        jTableTablaPeli.getTableHeader().setForeground(Color.WHITE);

        this.jScrollPane2.setBackground(Color.WHITE);
        this.jScrollPane2.getVerticalScrollBar().setBackground(Color.WHITE);
        this.jScrollPane2.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = Color.WHITE;
            }
        });
        this.jScrollPane2.setBorder(BorderFactory.createEmptyBorder());

        this.SQL = "select * from pelicula";
        atributos.busquedaDespliegue(jTableTablaPeli, selectTabla, SQL);

        //CargarImagenes();
        this.jTASipnosis.setVisible(false);
        this.jPTabla.setVisible(false);
        this.bGroupOpciones.add(this.jRBTabla);
        this.bGroupOpciones.add(this.jRBVistaPeliculas);
        this.jRBTabla.setBackground(Color.WHITE);
        atributos.visualizar_tabla(jTablePeliculas);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGroupOpciones = new javax.swing.ButtonGroup();
        jPBotonesBuscadores = new javax.swing.JPanel();
        jComboBoxFiltrarPeli = new javax.swing.JComboBox<>();
        jLabelIconFiltro = new javax.swing.JLabel();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jLabelLupaPeli = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonNuevaPeli = new javax.swing.JButton();
        jButtonActualizarPeli = new javax.swing.JButton();
        jButtonEliminarPeli = new javax.swing.JButton();
        jRBVistaPeliculas = new javax.swing.JRadioButton();
        jRBTabla = new javax.swing.JRadioButton();
        jTASipnosis = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jLEncabezado = new javax.swing.JLabel();
        jLTituloEncabezado = new javax.swing.JLabel();
        jLSipnosis = new javax.swing.JLabel();
        jPTabla = new javax.swing.JPanel();
        jLabelTituloTabla = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTablaPeli = new javax.swing.JTable();
        jPListaPeliculas = new javax.swing.JPanel();
        jLabelTituloTabla1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePeliculas = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPBotonesBuscadores.setOpaque(false);
        jPBotonesBuscadores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxFiltrarPeli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por...", "Nombre de la Pelicula", "Id de Pelicula", "Año de Estreno", "Idioma", "Puntuacion", "Sipnosis", "Genero", "Director" }));
        jComboBoxFiltrarPeli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(127, 0, 0)));
        jComboBoxFiltrarPeli.setFocusable(false);
        jComboBoxFiltrarPeli.setLightWeightPopupEnabled(false);
        jComboBoxFiltrarPeli.setRequestFocusEnabled(false);
        jComboBoxFiltrarPeli.setVerifyInputWhenFocusTarget(false);
        jPBotonesBuscadores.add(jComboBoxFiltrarPeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(1007, 48, 209, -1));

        jLabelIconFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/filtrar 24.png"))); // NOI18N
        jPBotonesBuscadores.add(jLabelIconFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 48, -1, -1));

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
        jPBotonesBuscadores.add(jTextFieldBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1013, 7, 203, 25));

        jLabelLupaPeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconBuscar24.png"))); // NOI18N
        jPBotonesBuscadores.add(jLabelLupaPeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 8, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setRequestFocusEnabled(false);
        jSeparator1.setVerifyInputWhenFocusTarget(false);
        jPBotonesBuscadores.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 38, 237, 4));

        jButtonNuevaPeli.setBackground(new java.awt.Color(56, 56, 56));
        jButtonNuevaPeli.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevaPeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NuevoPre2.png"))); // NOI18N
        jButtonNuevaPeli.setText("nuevo");
        jButtonNuevaPeli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonNuevaPeli.setBorderPainted(false);
        jButtonNuevaPeli.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonNuevaPeli.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NuevoPps.png"))); // NOI18N
        jButtonNuevaPeli.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NuevoPps.png"))); // NOI18N
        jButtonNuevaPeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNuevaPeliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNuevaPeliMouseExited(evt);
            }
        });
        jButtonNuevaPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaPeliActionPerformed(evt);
            }
        });
        jPBotonesBuscadores.add(jButtonNuevaPeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 113, -1));

        jButtonActualizarPeli.setBackground(new java.awt.Color(56, 56, 56));
        jButtonActualizarPeli.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizarPeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EditarPre2.png"))); // NOI18N
        jButtonActualizarPeli.setText("actualizar");
        jButtonActualizarPeli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonActualizarPeli.setBorderPainted(false);
        jButtonActualizarPeli.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonActualizarPeli.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EditarPos.png"))); // NOI18N
        jButtonActualizarPeli.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EditarPos.png"))); // NOI18N
        jButtonActualizarPeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonActualizarPeliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonActualizarPeliMouseExited(evt);
            }
        });
        jButtonActualizarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarPeliActionPerformed(evt);
            }
        });
        jPBotonesBuscadores.add(jButtonActualizarPeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 113, -1));

        jButtonEliminarPeli.setBackground(new java.awt.Color(56, 56, 56));
        jButtonEliminarPeli.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarPeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EliminarPre2.png"))); // NOI18N
        jButtonEliminarPeli.setText("eliminar");
        jButtonEliminarPeli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true));
        jButtonEliminarPeli.setBorderPainted(false);
        jButtonEliminarPeli.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonEliminarPeli.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EliminarPos.png"))); // NOI18N
        jButtonEliminarPeli.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EliminarPos.png"))); // NOI18N
        jButtonEliminarPeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarPeliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarPeliMouseExited(evt);
            }
        });
        jButtonEliminarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarPeliActionPerformed(evt);
            }
        });
        jPBotonesBuscadores.add(jButtonEliminarPeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 113, -1));

        jRBVistaPeliculas.setSelected(true);
        jRBVistaPeliculas.setText("Ver por Pelicula");
        jRBVistaPeliculas.setContentAreaFilled(false);
        jRBVistaPeliculas.setFocusable(false);
        jRBVistaPeliculas.setRequestFocusEnabled(false);
        jRBVistaPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBVistaPeliculasActionPerformed(evt);
            }
        });
        jPBotonesBuscadores.add(jRBVistaPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jRBTabla.setBackground(new java.awt.Color(255, 255, 255));
        bGroupOpciones.add(jRBTabla);
        jRBTabla.setText("Ver por Tabla");
        jRBTabla.setContentAreaFilled(false);
        jRBTabla.setFocusPainted(false);
        jRBTabla.setFocusable(false);
        jRBTabla.setRequestFocusEnabled(false);
        jRBTabla.setRolloverEnabled(false);
        jRBTabla.setVerifyInputWhenFocusTarget(false);
        jRBTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBTablaActionPerformed(evt);
            }
        });
        jPBotonesBuscadores.add(jRBTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        add(jPBotonesBuscadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 80));

        jTASipnosis.setBackground(new java.awt.Color(255, 255, 255));
        jTASipnosis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 51), 2));

        jLEncabezado.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLEncabezado.setForeground(new java.awt.Color(153, 0, 51));
        jLEncabezado.setText("Sipnosis:");

        jLTituloEncabezado.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLTituloEncabezado.setForeground(new java.awt.Color(153, 0, 51));
        jLTituloEncabezado.setText("Titulo:");

        jLSipnosis.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        javax.swing.GroupLayout jTASipnosisLayout = new javax.swing.GroupLayout(jTASipnosis);
        jTASipnosis.setLayout(jTASipnosisLayout);
        jTASipnosisLayout.setHorizontalGroup(
            jTASipnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTASipnosisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTASipnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTASipnosisLayout.createSequentialGroup()
                        .addComponent(jLTituloEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                    .addGroup(jTASipnosisLayout.createSequentialGroup()
                        .addComponent(jLEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLSipnosis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jTASipnosisLayout.setVerticalGroup(
            jTASipnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTASipnosisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTASipnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTituloEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLSipnosis, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jTASipnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 390, 290));

        jPTabla.setOpaque(false);
        jPTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTituloTabla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLabelTituloTabla.setForeground(new java.awt.Color(127, 0, 0));
        jLabelTituloTabla.setText("Peliculas");
        jPTabla.add(jLabelTituloTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 188, 24));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(127, 0, 0)));

        jTableTablaPeli.setAutoCreateRowSorter(true);
        jTableTablaPeli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(127, 0, 0)));
        jTableTablaPeli.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTableTablaPeli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Estreno", "Idioma", "Puntaje", "Sipnosis", "Genero", "Director", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTablaPeli.setGridColor(new java.awt.Color(127, 0, 0));
        jTableTablaPeli.setSelectionBackground(new java.awt.Color(255, 214, 214));
        jTableTablaPeli.setShowGrid(true);
        jTableTablaPeli.setSurrendersFocusOnKeystroke(true);
        jTableTablaPeli.getTableHeader().setResizingAllowed(false);
        jTableTablaPeli.getTableHeader().setReorderingAllowed(false);
        jTableTablaPeli.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTableTablaPeliMouseMoved(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTablaPeli);

        jPTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 879, 382));

        jPListaPeliculas.setOpaque(false);
        jPListaPeliculas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTituloTabla1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLabelTituloTabla1.setForeground(new java.awt.Color(127, 0, 0));
        jLabelTituloTabla1.setText("Peliculas");
        jPListaPeliculas.add(jLabelTituloTabla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 188, 24));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setOpaque(false);
        jScrollPane2.setRequestFocusEnabled(false);
        jScrollPane2.setVerifyInputWhenFocusTarget(false);

        jTablePeliculas.setAutoCreateRowSorter(true);
        jTablePeliculas.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTablePeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTablePeliculas.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePeliculas.setRowHeight(600);
        jTablePeliculas.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTablePeliculas.setShowGrid(false);
        jTablePeliculas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTablePeliculasMouseMoved(evt);
            }
        });
        jTablePeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePeliculasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePeliculas);

        jPListaPeliculas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 430, 380));

        jPTabla.add(jPListaPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 990, 440));

        add(jPTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 1070, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEliminarPeliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarPeliMouseEntered
        this.jButtonEliminarPeli.setText("ELIMINAR");
    }//GEN-LAST:event_jButtonEliminarPeliMouseEntered

    private void jButtonEliminarPeliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarPeliMouseExited
        this.jButtonEliminarPeli.setText("eliminar");
    }//GEN-LAST:event_jButtonEliminarPeliMouseExited

    private void jButtonEliminarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarPeliActionPerformed
        JFEstudianteEliminar eliminar = new JFEstudianteEliminar();
        eliminar.setVisible(true);
    }//GEN-LAST:event_jButtonEliminarPeliActionPerformed

    private void jButtonActualizarPeliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarPeliMouseEntered
        this.jButtonActualizarPeli.setText("ACTUALIZAR");
    }//GEN-LAST:event_jButtonActualizarPeliMouseEntered

    private void jButtonActualizarPeliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarPeliMouseExited
        this.jButtonActualizarPeli.setText("actualizar");
    }//GEN-LAST:event_jButtonActualizarPeliMouseExited

    private void jButtonActualizarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarPeliActionPerformed
        actualizar.setVisible(true);
    }//GEN-LAST:event_jButtonActualizarPeliActionPerformed

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
        String Parametro_de_busqueda_estudiante = "nombrePelicula";
        String Busqueda = this.jTextFieldBusqueda.getText();
        switch (this.jComboBoxFiltrarPeli.getSelectedIndex()) {
            case 0: {
                Parametro_de_busqueda_estudiante = "nombrePelicula";
                break;
            }
            case 1: {
                Parametro_de_busqueda_estudiante = "nombrePelicula";
                break;
            }
            case 2: {
                Parametro_de_busqueda_estudiante = "idPelicula";
                break;
            }
            case 3: {
                Parametro_de_busqueda_estudiante = "Estreno";
                break;
            }
            case 4: {
                Parametro_de_busqueda_estudiante = "idioma";
                break;
            }
            case 5: {
                Parametro_de_busqueda_estudiante = "PuntuacionSobre5";
                break;
            }
            case 6: {
                Parametro_de_busqueda_estudiante = "sinopsis";
                break;
            }
            case 7: {
                Parametro_de_busqueda_estudiante = "genero";
                break;
            }
            case 8: {
                Parametro_de_busqueda_estudiante = "directo";
                break;
            }
        }
        this.SQL = "SELECT * FROM " + selectTabla + " WHERE " + Parametro_de_busqueda_estudiante + " like '%" + Busqueda + "%'";
        atributos.busquedaDespliegue(this.jTableTablaPeli, this.selectTabla, this.SQL);
    }//GEN-LAST:event_jTextFieldBusquedaKeyReleased

    private void jButtonNuevaPeliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevaPeliMouseEntered
        this.jButtonNuevaPeli.setText("NUEVO");
    }//GEN-LAST:event_jButtonNuevaPeliMouseEntered

    private void jButtonNuevaPeliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevaPeliMouseExited
        this.jButtonNuevaPeli.setText("nuevo");
    }//GEN-LAST:event_jButtonNuevaPeliMouseExited

    private void jButtonNuevaPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaPeliActionPerformed
        insertar.setVisible(true);
    }//GEN-LAST:event_jButtonNuevaPeliActionPerformed

    private void jTableTablaPeliMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTablaPeliMouseMoved
        this.jTASipnosis.setVisible(false);
    }//GEN-LAST:event_jTableTablaPeliMouseMoved

    private void jRBTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBTablaActionPerformed
        if (this.jRBTabla.isSelected()) {
            this.jPTabla.setVisible(true);
            this.jPListaPeliculas.setVisible(false);
        }
    }//GEN-LAST:event_jRBTablaActionPerformed

    private void jRBVistaPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBVistaPeliculasActionPerformed
        if (this.jRBVistaPeliculas.isSelected()) {
            this.jPTabla.setVisible(false);
            this.jPListaPeliculas.setVisible(true);
        }
    }//GEN-LAST:event_jRBVistaPeliculasActionPerformed

    private void jTablePeliculasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePeliculasMouseMoved
        this.jTASipnosis.setVisible(false);
    }//GEN-LAST:event_jTablePeliculasMouseMoved

    private void jTablePeliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePeliculasMouseClicked
        int fila = jTablePeliculas.getSelectedRow();
        int colu = jTablePeliculas.getSelectedColumn();
        if (colu == 0) {
            String titulo = String.valueOf(jTableTablaPeli.getValueAt(fila, 1));
            String disponibilidad = String.valueOf(jTableTablaPeli.getValueAt(fila, 4));
            String puntaje = String.valueOf(jTableTablaPeli.getValueAt(fila, 8));
            this.jLTitulo.setText(titulo);
            this.jLEncabezado.setText("DATOS");
            this.jLSipnosis.setText("Disponibilidad: " + disponibilidad + " \n"
                    + "Puntaje: " + puntaje);
            this.jTASipnosis.setVisible(true);
        }
    }//GEN-LAST:event_jTablePeliculasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGroupOpciones;
    private javax.swing.JButton jButtonActualizarPeli;
    private javax.swing.JButton jButtonEliminarPeli;
    private javax.swing.JButton jButtonNuevaPeli;
    private javax.swing.JComboBox<String> jComboBoxFiltrarPeli;
    private javax.swing.JLabel jLEncabezado;
    private javax.swing.JLabel jLSipnosis;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLTituloEncabezado;
    private javax.swing.JLabel jLabelIconFiltro;
    private javax.swing.JLabel jLabelLupaPeli;
    private javax.swing.JLabel jLabelTituloTabla;
    private javax.swing.JLabel jLabelTituloTabla1;
    private javax.swing.JPanel jPBotonesBuscadores;
    private javax.swing.JPanel jPListaPeliculas;
    private javax.swing.JPanel jPTabla;
    private javax.swing.JRadioButton jRBTabla;
    private javax.swing.JRadioButton jRBVistaPeliculas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jTASipnosis;
    private javax.swing.JTable jTablePeliculas;
    private javax.swing.JTable jTableTablaPeli;
    private javax.swing.JTextField jTextFieldBusqueda;
    // End of variables declaration//GEN-END:variables
}
