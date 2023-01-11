package Front.Peliculas;

import Logic.Interaccion;

/*
 * @author Arias,Tibanta, Armijo, Salazar J, Salazar S
 */
public class JFEstudianteInsentar extends javax.swing.JFrame {
    private int x;
    private int y;
    Interaccion atributos = new Interaccion();
    private String SQL;
    private String tablaInsertar="pelicula";//tabla a la q se hace referencia
   
    public JFEstudianteInsentar() {
        initComponents();
        setLocationRelativeTo(this);
        this.jTFNombre.requestFocus();
        
        this.SQL= "Select idPelicula from pelicula order By idpelicula DESC limit 1;";
        int nuevoCod = atributos.busquedaCod(tablaInsertar, SQL, "idPelicula") + 1;
        this.jTFCodigo.setText(nuevoCod + "");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelCodEstudiante = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLabelApellido = new javax.swing.JLabel();
        jTFApellido = new javax.swing.JTextField();
        jLabelCelular = new javax.swing.JLabel();
        jTFCelular = new javax.swing.JTextField();
        jLabelSector = new javax.swing.JLabel();
        jTFSector = new javax.swing.JTextField();
        jLabelFacultad = new javax.swing.JLabel();
        jTFFacultad = new javax.swing.JTextField();
        jLabelCorreo = new javax.swing.JLabel();
        jTFCorreo = new javax.swing.JTextField();
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
        setMinimumSize(new java.awt.Dimension(280, 370));
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

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Insertar Pelicula");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 140, 30);

        jLabelCodEstudiante.setForeground(new java.awt.Color(127, 0, 0));
        jLabelCodEstudiante.setText("Código:");
        getContentPane().add(jLabelCodEstudiante);
        jLabelCodEstudiante.setBounds(20, 40, 60, 16);

        jTFCodigo.setEditable(false);
        jTFCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jTFCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCodigoFocusLost(evt);
            }
        });
        jTFCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFCodigoKeyPressed(evt);
            }
        });
        getContentPane().add(jTFCodigo);
        jTFCodigo.setBounds(90, 40, 170, 22);

        jLabelNombre.setForeground(new java.awt.Color(127, 0, 0));
        jLabelNombre.setText("Nombre:");
        getContentPane().add(jLabelNombre);
        jLabelNombre.setBounds(20, 70, 60, 16);
        getContentPane().add(jTFNombre);
        jTFNombre.setBounds(90, 70, 170, 22);

        jLabelApellido.setForeground(new java.awt.Color(127, 0, 0));
        jLabelApellido.setText("Estreno:");
        getContentPane().add(jLabelApellido);
        jLabelApellido.setBounds(20, 100, 70, 16);
        getContentPane().add(jTFApellido);
        jTFApellido.setBounds(90, 100, 170, 22);

        jLabelCelular.setForeground(new java.awt.Color(127, 0, 0));
        jLabelCelular.setText("Idioma:");
        getContentPane().add(jLabelCelular);
        jLabelCelular.setBounds(20, 130, 70, 16);

        jTFCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCelularKeyTyped(evt);
            }
        });
        getContentPane().add(jTFCelular);
        jTFCelular.setBounds(90, 130, 170, 22);

        jLabelSector.setForeground(new java.awt.Color(127, 0, 0));
        jLabelSector.setText("Puntuacion:");
        getContentPane().add(jLabelSector);
        jLabelSector.setBounds(20, 160, 70, 16);
        getContentPane().add(jTFSector);
        jTFSector.setBounds(90, 160, 170, 22);

        jLabelFacultad.setForeground(new java.awt.Color(127, 0, 0));
        jLabelFacultad.setText("Sipnosis:");
        getContentPane().add(jLabelFacultad);
        jLabelFacultad.setBounds(20, 190, 70, 16);
        getContentPane().add(jTFFacultad);
        jTFFacultad.setBounds(90, 190, 170, 22);

        jLabelCorreo.setForeground(new java.awt.Color(127, 0, 0));
        jLabelCorreo.setText("Genero:");
        getContentPane().add(jLabelCorreo);
        jLabelCorreo.setBounds(20, 220, 70, 16);

        jTFCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCorreoFocusLost(evt);
            }
        });
        getContentPane().add(jTFCorreo);
        jTFCorreo.setBounds(90, 220, 170, 22);

        jLabelDirector.setForeground(new java.awt.Color(127, 0, 0));
        jLabelDirector.setText("Director:");
        getContentPane().add(jLabelDirector);
        jLabelDirector.setBounds(20, 250, 70, 16);

        jTFDirector.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFDirectorFocusLost(evt);
            }
        });
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
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
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
        this.setLocation(posX-x,posY-y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jTFCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodigoKeyPressed
        
    }//GEN-LAST:event_jTFCodigoKeyPressed

    private void jTFCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCelularKeyTyped
        
    }//GEN-LAST:event_jTFCelularKeyTyped

    private void jTFCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCorreoFocusLost
        
    }//GEN-LAST:event_jTFCorreoFocusLost

    private void jTFCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCodigoFocusLost
        
    }//GEN-LAST:event_jTFCodigoFocusLost

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

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRegistrarMouseEntered
        this.jBRegistrar.setText("REGISTRAR");
    }//GEN-LAST:event_jBRegistrarMouseEntered

    private void jBRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRegistrarMouseExited
        this.jBRegistrar.setText("registrar");
    }//GEN-LAST:event_jBRegistrarMouseExited

    private void jBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarActionPerformed
        String nombre= jTFNombre.getText();
        String apellido= jTFApellido.getText();
        String sector= jTFSector.getText();
        String facultad= jTFFacultad.getText();
        String correo= jTFCorreo.getText();
        if(this.jTFCodigo.getText().isEmpty()||nombre.isEmpty()||apellido.isEmpty()||
            this.jTFCelular.getText().isEmpty()||sector.isEmpty()||facultad.isEmpty()||correo.isEmpty()){
            
        }else{
            int codigoEst= Integer.parseInt(jTFCodigo.getText());
            String celular= jTFCelular.getText();
            String director = jTFDirector.getText();
            //datosBasura
            int codigoLibro=0;
            int stock=0;
            int disponibilidad=0;
            this.SQL="INSERT INTO pelicula values(?,?,?,?,?,?,?,?)";
            if(atributos.insertarTabla(SQL,tablaInsertar, codigoEst, nombre, apellido, celular, sector, facultad, correo, 
                codigoLibro, null, null, null, null, stock, disponibilidad,null,null, director)){
                
                this.setVisible(false);
            }else{
                
            }    
        }
    }//GEN-LAST:event_jBRegistrarActionPerformed

    private void jTFDirectorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFDirectorFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDirectorFocusLost
    
    public void limpiarCampos(){
        this.jTFApellido.setText("");
        this.jTFCelular.setText("");
        this.jTFCodigo.setText("");
        this.jTFCorreo.setText("");
        this.jTFFacultad.setText("");
        this.jTFNombre.setText("");
        this.jTFSector.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBMax;
    private javax.swing.JButton jBRegistrar;
    private javax.swing.JButton jBSalirIcon;
    private javax.swing.JLabel jLCuerpo;
    private javax.swing.JLabel jLEncabezado;
    private javax.swing.JLabel jLPie;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCodEstudiante;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelDirector;
    private javax.swing.JLabel jLabelFacultad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSector;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFCelular;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JTextField jTFDirector;
    private javax.swing.JTextField jTFFacultad;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFSector;
    // End of variables declaration//GEN-END:variables
}