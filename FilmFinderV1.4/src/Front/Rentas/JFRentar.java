package Front.Rentas;

import Logic.Fecha;
import Logic.Interaccion;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;

/**
 *
 * @author cinefilos de EDA
 */
public class JFRentar extends javax.swing.JFrame {
    private String fecha1;
    private String fecha2;
    private int tiempo = 0;
    String selectTabla = "prestamoPelicula";
    private String SQL;
    Fecha fecha = new Fecha();
    Interaccion atributos = new Interaccion();
    public JFRentar() {
        initComponents();
        this.fecha1 = fecha.fechaRegistro();
        this.jTFFechaPrestamo.setText(this.fecha1);
        this.SQL= "Select idPrestamo from prestamoPelicula order By idPrestamo DESC limit 1;";
        int nuevoCod = atributos.busquedaCod("prestamoPelicula", SQL, "idPrestamo") + 1;
        this.jTFCodigoPrestamo.setText(nuevoCod + "");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCBCodoNomLib = new javax.swing.JComboBox<>();
        jLabelPeriodo = new javax.swing.JLabel();
        jCBPeriodo = new javax.swing.JComboBox<>();
        jTFBuscar_ActualizarEst = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFCodigoPrestamo = new javax.swing.JTextField();
        jTFCodigo_Actualizar = new javax.swing.JTextField();
        jTFNombre_Actualizar = new javax.swing.JTextField();
        jTFCodigoEstudiante = new javax.swing.JTextField();
        jTFNombreEstudiante = new javax.swing.JTextField();
        jTFApellidoEstudiante = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTFFechaPrestamo = new javax.swing.JTextField();
        jTFFechaDevolucion = new javax.swing.JTextField();
        jBRegistrar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro del Prestamo"));

        jCBCodoNomLib.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo Pelicula", "Nombre de la Pelicula" }));
        jCBCodoNomLib.setBorder(null);
        jCBCodoNomLib.setFocusable(false);
        jCBCodoNomLib.setOpaque(false);
        jCBCodoNomLib.setRequestFocusEnabled(false);
        jCBCodoNomLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCodoNomLibActionPerformed(evt);
            }
        });

        jLabelPeriodo.setText("Periodo del Prestamo:");

        jCBPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 día", "7 días ", "14 días", "30 días" }));
        jCBPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPeriodoActionPerformed(evt);
            }
        });

        jTFBuscar_ActualizarEst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarEstKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarEstKeyTyped(evt);
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
                    .addComponent(jLabelPeriodo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBPeriodo, 0, 171, Short.MAX_VALUE)
                    .addComponent(jTFBuscar_ActualizarEst))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCodoNomLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFBuscar_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPeriodo)
                    .addComponent(jCBPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Prestamo"));

        jLabel1.setText("Codigo Prestamo:");

        jLabel2.setText("Codigo Pelicula:");

        jLabel3.setText("Titulo Pelicula:");

        jLabel4.setText("Codigo Estudiante:");

        jLabel5.setText("Nombre Estudiante:");

        jLabel6.setText("Apellido Estudiante:");

        jTFNombre_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombre_ActualizarActionPerformed(evt);
            }
        });

        jLabel7.setText("Fecha Prestamo:");

        jLabel8.setText("Fecha Devolucion:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(62, 62, 62)
                        .addComponent(jTFCodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(72, 72, 72)
                            .addComponent(jTFCodigo_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(54, 54, 54)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(68, 68, 68)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(61, 61, 61)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFNombreEstudiante)
                                .addComponent(jTFCodigoEstudiante)
                                .addComponent(jTFNombre_Actualizar)
                                .addComponent(jTFApellidoEstudiante)
                                .addComponent(jTFFechaPrestamo)
                                .addComponent(jTFFechaDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jTFNombre_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFCodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jBRegistrar.setText("REGISTRAR");
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

        jBCancelar.setText("CANCELAR");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jBRegistrar)
                .addGap(18, 18, 18)
                .addComponent(jBCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRegistrar)
                    .addComponent(jBCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarActionPerformed
        this.selectTabla="prestamoPelicula";
        if(this.jTFBuscar_ActualizarEst.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Advertencia", HEIGHT);
        }else{
            String codigoPrestamo = this.jTFCodigoPrestamo.getText();
            int codLibro = Integer.parseInt(this.jTFCodigo_Actualizar.getText());
            int codEstudiante = Integer.parseInt(this.jTFCodigoEstudiante.getText());
            String nombrePeli = this.jTFNombre_Actualizar.getText();
            String apellidoE = this.jTFApellidoEstudiante.getText();
            String nombreE = this.jTFNombreEstudiante.getText();
            this.fecha1 = this.jTFFechaPrestamo.getText();
            this.fecha2 = this.jTFFechaDevolucion.getText();
            String celular = "";
            int stock =0;
            int disponibilidad =0;
            this.SQL = "Select Disponibilidad from pelicula where IdPelicula like " + codLibro;
            if (atributos.busquedaDis("pelicula", SQL, "Disponibilidad") == "NO DISPONIBLE") {
                    JOptionPane.showMessageDialog(null, "Lo sentimos la pelicula que estas intentando solicitar no se encuentra disponible", "RESULTADO", HEIGHT);
                }else{
                    this.SQL="INSERT INTO prestamoPelicula VALUES(?,?,?,?,?,?,?,?)";          
                    if(atributos.insertarTabla(SQL, selectTabla, codEstudiante, nombrePeli, apellidoE, null,
                            null, null, nombreE, codLibro, null, fecha1, null, null, stock, 
                            disponibilidad, fecha2, codigoPrestamo, null)){
                            JOptionPane.showMessageDialog(null, "Datos Guardados correctamente", "RESULTADO", HEIGHT);
                            this.SQL="UPDATE pelicula SET Disponibilidad = 'NO DISPONIBLE' WHERE IdPelicula = " + codLibro + ";";
                            atributos.actualizarEliminarTablas(SQL);
                            this.setVisible(false); 
                    }
                }
            }
    }//GEN-LAST:event_jBRegistrarActionPerformed

    private void jTFNombre_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombre_ActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombre_ActualizarActionPerformed

    private void jCBCodoNomLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCodoNomLibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBCodoNomLibActionPerformed

    private void jBRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRegistrarMouseEntered
        this.jBRegistrar.setText("REGISTRAR");
    }//GEN-LAST:event_jBRegistrarMouseEntered

    private void jBRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRegistrarMouseExited
        this.jBRegistrar.setText("registar");
    }//GEN-LAST:event_jBRegistrarMouseExited

    private void jBCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseEntered
        if (this.jBCancelar.getText().equalsIgnoreCase("cancelar")) {
            this.jBCancelar.setText("CANCELAR");
        } else {
            this.jBCancelar.setText("ACEPTAR");
        }
    }//GEN-LAST:event_jBCancelarMouseEntered

    private void jBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseExited
        if (this.jBCancelar.getText().equalsIgnoreCase("cancelar")) {
            this.jBCancelar.setText("cancelar");
        } else {
            this.jBCancelar.setText("aceptar");
        }
    }//GEN-LAST:event_jBCancelarMouseExited

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        if (this.jBCancelar.getText().equalsIgnoreCase("cancelar")) {
            int seleccion = JOptionPane.showConfirmDialog(null,"¿Desea cancelar el prestamo?"
                + "\n     -Los datos ingresados no seran guardados","Canceclar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if (seleccion == 0) {
                this.setVisible(false);
                //limpiarCampos();
            }
        } else {
            if (this.jBCancelar.getText().equalsIgnoreCase("aceptar")) {
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTFBuscar_ActualizarEstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarEstKeyTyped
        int select = this.jCBCodoNomLib.getSelectedIndex();
        if (select == 0) {
            char variable = evt.getKeyChar();
            if (Character.isLetter(variable)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null,"Ingrese unicamente numeros","ADVERTENCIA",HEIGHT);
            }
        }
    }//GEN-LAST:event_jTFBuscar_ActualizarEstKeyTyped

    private void jTFBuscar_ActualizarEstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarEstKeyReleased
        this.selectTabla="pelicula";
        String datoBusqueda = this.jTFBuscar_ActualizarEst.getText();
        String columna = "count(*)";
        int select = jCBCodoNomLib.getSelectedIndex();
        switch (select) {
            case 0: {
                this.SQL = "Select count(*) from pelicula where idPelicula like '" + datoBusqueda + "';";
                if (atributos.busquedaCod(selectTabla, SQL, columna) == 0) {
                    getToolkit().beep();
                } else {
                    this.SQL = "SELECT * FROM " + selectTabla + " WHERE idPelicula like '" + datoBusqueda + "';";
                    atributos.despliegueFields(SQL, selectTabla, jTFCodigo_Actualizar, jTFNombre_Actualizar, null,
                            null, null, null, null, null, "actualizar");
                }
                break;
            }
            case 1: {
                this.SQL = "SELECT * FROM " + selectTabla + " WHERE nombrePelicula like '%" + datoBusqueda + "%'";
                atributos.despliegueFields(SQL, selectTabla, jTFCodigo_Actualizar, jTFNombre_Actualizar, null,
                        null, null, null, null, null, "actualizar");
                break;
            }
        }
    }//GEN-LAST:event_jTFBuscar_ActualizarEstKeyReleased

    private void jCBPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPeriodoActionPerformed
        int plazo = this.jCBPeriodo.getSelectedIndex();
        switch (plazo){
            case 0: {tiempo = 1;this.fecha2 = fecha.fechaDevolucion(tiempo,"nueva");break;}
            case 1: {tiempo = 7;this.fecha2 = fecha.fechaDevolucion(tiempo,"nueva");break;}
            case 2: {tiempo = 14;this.fecha2 = fecha.fechaDevolucion(tiempo,"nueva");break;}
            case 3: {tiempo = 30;this.fecha2 = fecha.fechaDevolucion(tiempo,"nueva");break;}
        }
        this.jTFFechaDevolucion.setText(this.fecha2);
    }//GEN-LAST:event_jCBPeriodoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBRegistrar;
    private javax.swing.JComboBox<String> jCBCodoNomLib;
    private javax.swing.JComboBox<String> jCBPeriodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelPeriodo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFApellidoEstudiante;
    private javax.swing.JTextField jTFBuscar_ActualizarEst;
    private javax.swing.JTextField jTFCodigoEstudiante;
    private javax.swing.JTextField jTFCodigoPrestamo;
    private javax.swing.JTextField jTFCodigo_Actualizar;
    private javax.swing.JTextField jTFFechaDevolucion;
    private javax.swing.JTextField jTFFechaPrestamo;
    private javax.swing.JTextField jTFNombreEstudiante;
    private javax.swing.JTextField jTFNombre_Actualizar;
    // End of variables declaration//GEN-END:variables
}
