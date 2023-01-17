package Front.Peliculas;

import Logic.Interaccion;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * @autores Cinefilos de EDA
 */
public class JFPeliculasInsentar extends javax.swing.JFrame {

    private int x;
    private int y;
    Interaccion atributos = new Interaccion();
    private String SQL;
    private String tablaInsertar = "pelicula";//tabla a la q se hace referencia
    String ruta = null;

    public JFPeliculasInsentar() {
        initComponents();
        setLocationRelativeTo(this);
        this.jTFNombre.requestFocus();
        this.SQL = "Select idPelicula from pelicula order By idpelicula DESC limit 1;";
        int nuevoCod = atributos.busquedaCod(tablaInsertar, SQL, "idPelicula") + 1;
        this.jTFCodigo.setText(nuevoCod + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lblimagen = new javax.swing.JLabel();
        lblurl = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelCodPelicula = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLabelEstreno = new javax.swing.JLabel();
        jTFEstreno = new javax.swing.JTextField();
        jLabelIdioma = new javax.swing.JLabel();
        jTFIdioma = new javax.swing.JTextField();
        jLabelPuntuacion = new javax.swing.JLabel();
        jTFPuntuacion = new javax.swing.JTextField();
        jLabelSinopsis = new javax.swing.JLabel();
        jTFSinopsis = new javax.swing.JTextField();
        jLabelGenero = new javax.swing.JLabel();
        jTFGenero = new javax.swing.JTextField();
        jLabelDirector = new javax.swing.JLabel();
        jTFDirector = new javax.swing.JTextField();
        jBSalirIcon = new javax.swing.JButton();
        jBMax = new javax.swing.JButton();
        jBRegistrar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLEncabezado = new javax.swing.JLabel();
        jLCuerpo = new javax.swing.JLabel();
        jLPie = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insertar Estudiante");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(652, 370));
        setUndecorated(true);
        setResizable(false);
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(56, 56, 56));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Insertar Imagen");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(147, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblimagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblurl, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(lblurl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(280, 0, 370, 370);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Insertar Pelicula");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 140, 30);

        jLabelCodPelicula.setForeground(new java.awt.Color(127, 0, 0));
        jLabelCodPelicula.setText("Código:");
        getContentPane().add(jLabelCodPelicula);
        jLabelCodPelicula.setBounds(20, 40, 60, 16);

        jTFCodigo.setEditable(false);
        jTFCodigo.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTFCodigo);
        jTFCodigo.setBounds(90, 40, 170, 22);

        jLabelNombre.setForeground(new java.awt.Color(127, 0, 0));
        jLabelNombre.setText("Nombre:");
        getContentPane().add(jLabelNombre);
        jLabelNombre.setBounds(20, 70, 60, 16);
        getContentPane().add(jTFNombre);
        jTFNombre.setBounds(90, 70, 170, 22);

        jLabelEstreno.setForeground(new java.awt.Color(127, 0, 0));
        jLabelEstreno.setText("Estreno:");
        getContentPane().add(jLabelEstreno);
        jLabelEstreno.setBounds(20, 100, 70, 16);
        getContentPane().add(jTFEstreno);
        jTFEstreno.setBounds(90, 100, 170, 22);

        jLabelIdioma.setForeground(new java.awt.Color(127, 0, 0));
        jLabelIdioma.setText("Idioma:");
        getContentPane().add(jLabelIdioma);
        jLabelIdioma.setBounds(20, 130, 70, 16);
        getContentPane().add(jTFIdioma);
        jTFIdioma.setBounds(90, 130, 170, 22);

        jLabelPuntuacion.setForeground(new java.awt.Color(127, 0, 0));
        jLabelPuntuacion.setText("Puntuacion:");
        getContentPane().add(jLabelPuntuacion);
        jLabelPuntuacion.setBounds(20, 160, 70, 16);
        getContentPane().add(jTFPuntuacion);
        jTFPuntuacion.setBounds(90, 160, 170, 22);

        jLabelSinopsis.setForeground(new java.awt.Color(127, 0, 0));
        jLabelSinopsis.setText("Sipnosis:");
        getContentPane().add(jLabelSinopsis);
        jLabelSinopsis.setBounds(20, 190, 70, 16);
        getContentPane().add(jTFSinopsis);
        jTFSinopsis.setBounds(90, 190, 170, 22);

        jLabelGenero.setForeground(new java.awt.Color(127, 0, 0));
        jLabelGenero.setText("Genero:");
        getContentPane().add(jLabelGenero);
        jLabelGenero.setBounds(20, 220, 70, 16);
        getContentPane().add(jTFGenero);
        jTFGenero.setBounds(90, 220, 170, 22);

        jLabelDirector.setForeground(new java.awt.Color(127, 0, 0));
        jLabelDirector.setText("Director:");
        getContentPane().add(jLabelDirector);
        jLabelDirector.setBounds(20, 250, 70, 16);
        getContentPane().add(jTFDirector);
        jTFDirector.setBounds(90, 250, 170, 22);

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
        jBSalirIcon.setBounds(230, 0, 52, 30);

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
        jBMax.setBounds(180, 0, 52, 30);

        jBRegistrar.setBackground(new java.awt.Color(56, 56, 56));
        jBRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jBRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AceptarPre.png"))); // NOI18N
        jBRegistrar.setText("registrar");
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
        jBRegistrar.setBounds(150, 310, 110, 40);

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
        getContentPane().add(jBCancelar);
        jBCancelar.setBounds(20, 310, 110, 40);

        jLEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        jLEncabezado.setOpaque(true);
        getContentPane().add(jLEncabezado);
        jLEncabezado.setBounds(0, 0, 280, 30);

        jLCuerpo.setBackground(new java.awt.Color(255, 255, 255));
        jLCuerpo.setOpaque(true);
        getContentPane().add(jLCuerpo);
        jLCuerpo.setBounds(0, 30, 280, 260);

        jLPie.setBackground(new java.awt.Color(0, 0, 0));
        jLPie.setOpaque(true);
        getContentPane().add(jLPie);
        jLPie.setBounds(0, 290, 280, 80);

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

    private void jBSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirIconActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBSalirIconActionPerformed

    private void jBMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMaxActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jBMaxActionPerformed

    private void jBCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseEntered
        this.jBCancelar.setText("CANCELAR");
    }//GEN-LAST:event_jBCancelarMouseEntered

    private void jBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseExited
        this.jBCancelar.setText("cancelar");
    }//GEN-LAST:event_jBCancelarMouseExited

    private void jBRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRegistrarMouseEntered
        this.jBRegistrar.setText("REGISTRAR");
    }//GEN-LAST:event_jBRegistrarMouseEntered

    private void jBRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRegistrarMouseExited
        this.jBRegistrar.setText("registrar");
    }//GEN-LAST:event_jBRegistrarMouseExited

    private void jBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarActionPerformed
        //ImagenPosters mimagen = new ImagenPosters();

        String nombre = jTFNombre.getText();
        String apellido = jTFEstreno.getText();
        String sector = jTFPuntuacion.getText();
        String facultad = jTFSinopsis.getText();
        String correo = jTFGenero.getText();
        if (this.jTFCodigo.getText().isEmpty() || nombre.isEmpty() || apellido.isEmpty()
                || this.jTFIdioma.getText().isEmpty() || sector.isEmpty() || facultad.isEmpty() || correo.isEmpty()) {

        } else {

            int codigoEst = Integer.parseInt(jTFCodigo.getText());
            String celular = jTFIdioma.getText();
            String director = jTFDirector.getText();

            //datosBasura
            int codigoLibro = 0;
            int stock = 0;
            int disponibilidad = 0;
            //this.SQL="INSERT INTO pelicula values(?,?,?,?,?,?,?,?,?)";
            this.SQL = "INSERT INTO pelicula values(?,?,?,?,?,?,?,?,?)";
            if (atributos.insertarTabla(SQL, tablaInsertar, codigoEst, nombre, apellido, celular, sector, facultad, correo,
                    codigoLibro, null, null, null, null, stock, disponibilidad, null, null, director)) {

                this.setVisible(false);
            } else {

            }
        }

        String url = lblurl.getText();
        if (url.trim().length() != 0 && nombre.trim().length() != 0) {
            atributos.guardarImagen(ruta, nombre);
        } else {
            JOptionPane.showMessageDialog(null, "No debe dejar los campos vacios: Nombre e Imagen");
        }
    }//GEN-LAST:event_jBRegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser j = new JFileChooser();
        j.setCurrentDirectory(new File("C:/Users/Isma2/OneDrive - Escuela Politécnica Nacional/Documentos/SOFTWARE CUARTO SEMESTRE/EDA II/Proyectos/FilmFinder"));

        int ap = j.showOpenDialog(this);

        if (ap == JFileChooser.APPROVE_OPTION) {
            ruta = j.getSelectedFile().getAbsolutePath();
            this.lblimagen.setIcon(new ImageIcon(ruta));
            this.lblurl.setText(ruta);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    public void limpiarCampos() {
        this.jTFEstreno.setText("");
        this.jTFIdioma.setText("");
        this.jTFCodigo.setText("");
        this.jTFGenero.setText("");
        this.jTFSinopsis.setText("");
        this.jTFNombre.setText("");
        this.jTFPuntuacion.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBMax;
    private javax.swing.JButton jBRegistrar;
    private javax.swing.JButton jBSalirIcon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLCuerpo;
    private javax.swing.JLabel jLEncabezado;
    private javax.swing.JLabel jLPie;
    private javax.swing.JLabel jLabelCodPelicula;
    private javax.swing.JLabel jLabelDirector;
    private javax.swing.JLabel jLabelEstreno;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelIdioma;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPuntuacion;
    private javax.swing.JLabel jLabelSinopsis;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFDirector;
    private javax.swing.JTextField jTFEstreno;
    private javax.swing.JTextField jTFGenero;
    private javax.swing.JTextField jTFIdioma;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFPuntuacion;
    private javax.swing.JTextField jTFSinopsis;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JLabel lblurl;
    // End of variables declaration//GEN-END:variables
}
