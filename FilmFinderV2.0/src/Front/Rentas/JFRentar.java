package Front.Rentas;

import Logic.Fecha;
import Logic.Interaccion;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;

/**
 *
 * @autores Cinefilos de EDA
 */
public class JFRentar extends javax.swing.JFrame {

    private String fecha1;
    private String fecha2;
    private int tiempo = 0;
    String selectTabla = "prestamoPelicula";
    private String SQL;
    Fecha fecha = new Fecha();
    Interaccion atributos = new Interaccion();
    private int x;
    private int y;

    public JFRentar() {
        initComponents();
        setLocationRelativeTo(this);
        this.fecha1 = fecha.fechaRegistro();
        this.jTFFechaPrestamo.setText(this.fecha1);
        this.SQL = "Select idPrestamo from prestamoPelicula order By idPrestamo DESC limit 1;";
        int nuevoCod = atributos.busquedaCod("prestamoPelicula", SQL, "idPrestamo") + 1;
        this.jTFCodigoPrestamo.setText(nuevoCod + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBCancelar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jBMax = new javax.swing.JButton();
        jBSalirIcon = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jCBCodoNomLib = new javax.swing.JComboBox<>();
        jLabelPeriodo = new javax.swing.JLabel();
        jCBPeriodo = new javax.swing.JComboBox<>();
        jTFBuscar_ActualizarPeli = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFCodigoPrestamo = new javax.swing.JTextField();
        jTFCodigo_Actualizar = new javax.swing.JTextField();
        jTFTitulo_Actualizar = new javax.swing.JTextField();
        jTFCodigoPeli = new javax.swing.JTextField();
        jTFNombreEstudiante = new javax.swing.JTextField();
        jTFApellidoEstudiante = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTFFechaPrestamo = new javax.swing.JTextField();
        jTFFechaDevolucion = new javax.swing.JTextField();
        jBRegistrar = new javax.swing.JButton();
        jLEncabezado = new javax.swing.JLabel();
        jLPie = new javax.swing.JLabel();
        jLCuerpo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(364, 578));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(364, 578));
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
        jBCancelar.setBounds(70, 520, 110, 40);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Rentar Pelicula");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 140, 30);

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
        jBMax.setBounds(260, 0, 52, 30);

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
        jBSalirIcon.setBounds(310, 0, 52, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registro del Prestamo"));

        jCBCodoNomLib.setForeground(new java.awt.Color(127, 0, 0));
        jCBCodoNomLib.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo Pelicula", "Nombre de la Pelicula" }));
        jCBCodoNomLib.setBorder(null);
        jCBCodoNomLib.setFocusable(false);
        jCBCodoNomLib.setRequestFocusEnabled(false);

        jLabelPeriodo.setForeground(new java.awt.Color(127, 0, 0));
        jLabelPeriodo.setText("Periodo del Prestamo:");

        jCBPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 día", "7 días ", "14 días", "30 días" }));
        jCBPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPeriodoActionPerformed(evt);
            }
        });

        jTFBuscar_ActualizarPeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarPeliKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarPeliKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBCodoNomLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabelPeriodo)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBPeriodo, 0, 160, Short.MAX_VALUE)
                    .addComponent(jTFBuscar_ActualizarPeli))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCodoNomLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFBuscar_ActualizarPeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPeriodo)
                    .addComponent(jCBPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(6, 37, 350, 101);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Prestamo"));

        jLabel1.setForeground(new java.awt.Color(127, 0, 0));
        jLabel1.setText("Codigo Prestamo:");

        jLabel2.setForeground(new java.awt.Color(127, 0, 0));
        jLabel2.setText("Codigo Pelicula:");

        jLabel3.setForeground(new java.awt.Color(127, 0, 0));
        jLabel3.setText("Titulo Pelicula:");

        jLabel4.setForeground(new java.awt.Color(127, 0, 0));
        jLabel4.setText("Codigo Estudiante:");

        jLabel5.setForeground(new java.awt.Color(127, 0, 0));
        jLabel5.setText("Nombre Estudiante:");

        jLabel6.setForeground(new java.awt.Color(127, 0, 0));
        jLabel6.setText("Apellido Estudiante:");

        jLabel7.setForeground(new java.awt.Color(127, 0, 0));
        jLabel7.setText("Fecha Prestamo:");

        jLabel8.setForeground(new java.awt.Color(127, 0, 0));
        jLabel8.setText("Fecha Devolucion:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTFCodigoPrestamo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFFechaPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(jTFFechaDevolucion)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFApellidoEstudiante)
                            .addComponent(jTFNombreEstudiante)
                            .addComponent(jTFCodigoPeli)
                            .addComponent(jTFTitulo_Actualizar)
                            .addComponent(jTFCodigo_Actualizar))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFCodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFCodigo_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFTitulo_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFCodigoPeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFApellidoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTFFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 150, 348, 337);

        jBRegistrar.setBackground(new java.awt.Color(56, 56, 56));
        jBRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jBRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AceptarPre.png"))); // NOI18N
        jBRegistrar.setText("registrar");
        jBRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(147, 0, 0)));
        jBRegistrar.setMaximumSize(new java.awt.Dimension(82, 34));
        jBRegistrar.setMinimumSize(new java.awt.Dimension(82, 34));
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
        jBRegistrar.setBounds(190, 520, 110, 40);

        jLEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        jLEncabezado.setOpaque(true);
        getContentPane().add(jLEncabezado);
        jLEncabezado.setBounds(0, 0, 380, 30);

        jLPie.setBackground(new java.awt.Color(0, 0, 0));
        jLPie.setOpaque(true);
        getContentPane().add(jLPie);
        jLPie.setBounds(0, 500, 370, 80);

        jLCuerpo.setBackground(new java.awt.Color(255, 255, 255));
        jLCuerpo.setOpaque(true);
        getContentPane().add(jLCuerpo);
        jLCuerpo.setBounds(0, 30, 370, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarActionPerformed
        this.selectTabla = "prestamoPelicula";

        if (this.jTFBuscar_ActualizarPeli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Advertencia", HEIGHT);
        } else {
            int codEstudiante = Integer.parseInt(this.jTFCodigoPeli.getText());
            this.SQL="Select count(*) from prestamopelicula where idEstudiante like "+codEstudiante+";";
            int prestamos = atributos.busquedaCod(selectTabla, SQL, "count(*)");
            if (prestamos>4) 
            {
                JOptionPane.showMessageDialog(null, "El estudiante alcanzo el maximo de prestamos", "Advertencia", HEIGHT);
            } else {
                String codigoPrestamo = this.jTFCodigoPrestamo.getText();
                int codLibro = Integer.parseInt(this.jTFCodigo_Actualizar.getText());
                String nombrePeli = this.jTFTitulo_Actualizar.getText();
                String apellidoE = this.jTFApellidoEstudiante.getText();
                String nombreE = this.jTFNombreEstudiante.getText();
                this.fecha1 = this.jTFFechaPrestamo.getText();
                this.fecha2 = this.jTFFechaDevolucion.getText();
                String celular = "";
                int stock = 0;
                int disponibilidad = 0;
                this.SQL = "Select Disponibilidad from pelicula where IdPelicula like " + codLibro;
                if (atributos.busquedaDis("pelicula", SQL, "Disponibilidad") == "NO DISPONIBLE") {
                    JOptionPane.showMessageDialog(null, "Lo sentimos la pelicula que estas intentando solicitar no se encuentra disponible", "RESULTADO", HEIGHT);
                } else {
                    this.SQL = "INSERT INTO prestamoPelicula VALUES(?,?,?,?,?,?,?,?)";
                    if (atributos.insertarTabla(SQL, selectTabla, codEstudiante, nombrePeli, apellidoE, null,
                            null, null, nombreE, codLibro, null, fecha1, null, null, stock,
                            disponibilidad, fecha2, codigoPrestamo, null)) {
                        JOptionPane.showMessageDialog(null, "Datos Guardados correctamente", "RESULTADO", HEIGHT);
                        this.SQL = "UPDATE pelicula SET Disponibilidad = 'NO DISPONIBLE' WHERE IdPelicula = " + codLibro + ";";
                        atributos.actualizarEliminarTablas(SQL);
                        this.setVisible(false);
                    }
                }
            }
        }
    }//GEN-LAST:event_jBRegistrarActionPerformed

    private void jBRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRegistrarMouseEntered
        this.jBRegistrar.setText("REGISTRAR");
    }//GEN-LAST:event_jBRegistrarMouseEntered

    private void jBRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRegistrarMouseExited
        this.jBRegistrar.setText("registar");
    }//GEN-LAST:event_jBRegistrarMouseExited

    private void jTFBuscar_ActualizarPeliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarPeliKeyTyped
        int select = this.jCBCodoNomLib.getSelectedIndex();
        if (select == 0) {
            char variable = evt.getKeyChar();
            if (Character.isLetter(variable)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Ingrese unicamente numeros", "ADVERTENCIA", HEIGHT);
            }
        }
    }//GEN-LAST:event_jTFBuscar_ActualizarPeliKeyTyped

    private void jTFBuscar_ActualizarPeliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarPeliKeyReleased
        this.selectTabla = "pelicula";
        String datoBusqueda = this.jTFBuscar_ActualizarPeli.getText();
        String columna = "count(*)";
        int select = jCBCodoNomLib.getSelectedIndex();
        switch (select) {
            case 0: {
                this.SQL = "Select count(*) from pelicula where idPelicula like '" + datoBusqueda + "';";
                if (atributos.busquedaCod(selectTabla, SQL, columna) == 0) {
                    getToolkit().beep();
                } else {
                    this.SQL = "SELECT * FROM " + selectTabla + " WHERE idPelicula like '" + datoBusqueda + "';";
                    atributos.despliegueFields(SQL, selectTabla, jTFCodigo_Actualizar, jTFTitulo_Actualizar, null,
                            null, null, null, null, null, "actualizar");
                }
                break;
            }
            case 1: {
                this.SQL = "SELECT * FROM " + selectTabla + " WHERE nombrePelicula like '%" + datoBusqueda + "%'";
                atributos.despliegueFields(SQL, selectTabla, jTFCodigo_Actualizar, jTFTitulo_Actualizar, null,
                        null, null, null, null, null, "actualizar");
                break;
            }
        }
    }//GEN-LAST:event_jTFBuscar_ActualizarPeliKeyReleased

    private void jCBPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPeriodoActionPerformed
        int plazo = this.jCBPeriodo.getSelectedIndex();
        switch (plazo) {
            case 0: {
                tiempo = 1;
                this.fecha2 = fecha.fechaDevolucion(tiempo, "nueva");
                break;
            }
            case 1: {
                tiempo = 7;
                this.fecha2 = fecha.fechaDevolucion(tiempo, "nueva");
                break;
            }
            case 2: {
                tiempo = 14;
                this.fecha2 = fecha.fechaDevolucion(tiempo, "nueva");
                break;
            }
            case 3: {
                tiempo = 30;
                this.fecha2 = fecha.fechaDevolucion(tiempo, "nueva");
                break;
            }
        }
        this.jTFFechaDevolucion.setText(this.fecha2);
    }//GEN-LAST:event_jCBPeriodoActionPerformed

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
        if (this.jBCancelar.getText().equalsIgnoreCase("cancelar")) {
            int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea cancelar el prestamo?"
                    + "\n     -Los datos ingresados no seran guardados", "Canceclar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (seleccion == 0) {
                this.setVisible(false);
                //limpiarCampos();
            }
        } else {
            if (this.jBCancelar.getText().equalsIgnoreCase("aceptar")) {
                this.setVisible(false);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBMax;
    private javax.swing.JButton jBRegistrar;
    private javax.swing.JButton jBSalirIcon;
    private javax.swing.JComboBox<String> jCBCodoNomLib;
    private javax.swing.JComboBox<String> jCBPeriodo;
    private javax.swing.JLabel jLCuerpo;
    private javax.swing.JLabel jLEncabezado;
    private javax.swing.JLabel jLPie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelPeriodo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFApellidoEstudiante;
    private javax.swing.JTextField jTFBuscar_ActualizarPeli;
    private javax.swing.JTextField jTFCodigoPeli;
    private javax.swing.JTextField jTFCodigoPrestamo;
    private javax.swing.JTextField jTFCodigo_Actualizar;
    private javax.swing.JTextField jTFFechaDevolucion;
    private javax.swing.JTextField jTFFechaPrestamo;
    private javax.swing.JTextField jTFNombreEstudiante;
    private javax.swing.JTextField jTFTitulo_Actualizar;
    // End of variables declaration//GEN-END:variables
}
