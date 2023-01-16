package Front.Peliculas;

import Logic.Interaccion;
import Logic.Comprobaciones;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;
/*
 * @autores Cinefilos de EDA
 */
public class JFEstudianteActualizar extends javax.swing.JFrame {

    private int x;
    private int y;
    Interaccion atributos = new Interaccion();
    String ruta = null;

    Comprobaciones name = new Comprobaciones();

    private String SQL;

    private String tablaActualizar = "pelicula";

    public JFEstudianteActualizar() {
        initComponents();
        jComboBoxFiltrarEstudiante.setBackground(Color.WHITE);
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelImagen = new javax.swing.JPanel();
        jChBFoto = new javax.swing.JCheckBox();
        lblurl1 = new javax.swing.JLabel();
        lblimagen = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JButton();
        jBRegistrar = new javax.swing.JButton();
        jPDatosEstudianteActualizar = new javax.swing.JPanel();
        jTFEstreno_Actualizar = new javax.swing.JTextField();
        jTFGenero_Actualizar = new javax.swing.JTextField();
        jTFPuntaje_Actualizar = new javax.swing.JTextField();
        jTFCodigo_Actualizar = new javax.swing.JTextField();
        jTFIdioma_Actualizar = new javax.swing.JTextField();
        jTFNombre_Actualizar = new javax.swing.JTextField();
        jChBNombre_Actualizar = new javax.swing.JCheckBox();
        jChBEstreno_Actualizar = new javax.swing.JCheckBox();
        jChBPuntjae_Actualizar = new javax.swing.JCheckBox();
        jChBIdioma_Actualizar = new javax.swing.JCheckBox();
        jChBGenero_Actualizar = new javax.swing.JCheckBox();
        jTFSinopsis_Actualizar = new javax.swing.JTextField();
        jChBSinopsis_Actualizar = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jChBDirector_Actualizar = new javax.swing.JCheckBox();
        jTFDirector_Actualizar = new javax.swing.JTextField();
        jPanelDatoEstudiante = new javax.swing.JPanel();
        jTFBuscar_ActualizarEst = new javax.swing.JTextField();
        jComboBoxFiltrarEstudiante = new javax.swing.JComboBox<>();
        jBMax = new javax.swing.JButton();
        jBSalirIcon = new javax.swing.JButton();
        jLEncabezado = new javax.swing.JLabel();
        jLPie = new javax.swing.JLabel();
        jLCuerpo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(784, 475));
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

        jPanelImagen.setBackground(new java.awt.Color(255, 255, 255));
        jPanelImagen.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Imagen"));

        jChBFoto.setBackground(new java.awt.Color(255, 255, 255));
        jChBFoto.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBFoto.setForeground(new java.awt.Color(127, 0, 0));
        jChBFoto.setText("Portada");
        jChBFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBFotoActionPerformed(evt);
            }
        });

        lblurl1.setEnabled(false);
        lblurl1.setOpaque(true);

        javax.swing.GroupLayout jPanelImagenLayout = new javax.swing.GroupLayout(jPanelImagen);
        jPanelImagen.setLayout(jPanelImagenLayout);
        jPanelImagenLayout.setHorizontalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelImagenLayout.createSequentialGroup()
                        .addComponent(jChBFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblurl1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                    .addComponent(lblimagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelImagenLayout.setVerticalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagenLayout.createSequentialGroup()
                .addGroup(jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblurl1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jChBFoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelImagen);
        jPanelImagen.setBounds(370, 30, 410, 360);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Actualizar Pelicula");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 210, 30);

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
        jBCancelar.setBounds(250, 420, 110, 40);

        jBRegistrar.setBackground(new java.awt.Color(56, 56, 56));
        jBRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jBRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AceptarPre.png"))); // NOI18N
        jBRegistrar.setText("guardar");
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
        jBRegistrar.setBounds(380, 420, 110, 40);

        jPDatosEstudianteActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosEstudianteActualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos a Actualizar"));

        jTFEstreno_Actualizar.setEditable(false);
        jTFEstreno_Actualizar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFGenero_Actualizar.setEditable(false);
        jTFGenero_Actualizar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFGenero_Actualizar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFGenero_ActualizarFocusLost(evt);
            }
        });

        jTFPuntaje_Actualizar.setEditable(false);
        jTFPuntaje_Actualizar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFCodigo_Actualizar.setEditable(false);
        jTFCodigo_Actualizar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFIdioma_Actualizar.setEditable(false);
        jTFIdioma_Actualizar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFIdioma_Actualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFIdioma_ActualizarKeyTyped(evt);
            }
        });

        jTFNombre_Actualizar.setEditable(false);
        jTFNombre_Actualizar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBNombre_Actualizar.setBackground(new java.awt.Color(255, 255, 255));
        jChBNombre_Actualizar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBNombre_Actualizar.setForeground(new java.awt.Color(127, 0, 0));
        jChBNombre_Actualizar.setText("Nombre");
        jChBNombre_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBNombre_ActualizarActionPerformed(evt);
            }
        });

        jChBEstreno_Actualizar.setBackground(new java.awt.Color(255, 255, 255));
        jChBEstreno_Actualizar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBEstreno_Actualizar.setForeground(new java.awt.Color(127, 0, 0));
        jChBEstreno_Actualizar.setText("Estreno");
        jChBEstreno_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBEstreno_ActualizarActionPerformed(evt);
            }
        });

        jChBPuntjae_Actualizar.setBackground(new java.awt.Color(255, 255, 255));
        jChBPuntjae_Actualizar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBPuntjae_Actualizar.setForeground(new java.awt.Color(127, 0, 0));
        jChBPuntjae_Actualizar.setText("Puntaje");
        jChBPuntjae_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBPuntjae_ActualizarActionPerformed(evt);
            }
        });

        jChBIdioma_Actualizar.setBackground(new java.awt.Color(255, 255, 255));
        jChBIdioma_Actualizar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBIdioma_Actualizar.setForeground(new java.awt.Color(127, 0, 0));
        jChBIdioma_Actualizar.setText("Idioma");
        jChBIdioma_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBIdioma_ActualizarActionPerformed(evt);
            }
        });

        jChBGenero_Actualizar.setBackground(new java.awt.Color(255, 255, 255));
        jChBGenero_Actualizar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBGenero_Actualizar.setForeground(new java.awt.Color(127, 0, 0));
        jChBGenero_Actualizar.setText("Genero");
        jChBGenero_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBGenero_ActualizarActionPerformed(evt);
            }
        });

        jTFSinopsis_Actualizar.setEditable(false);
        jTFSinopsis_Actualizar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBSinopsis_Actualizar.setBackground(new java.awt.Color(255, 255, 255));
        jChBSinopsis_Actualizar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBSinopsis_Actualizar.setForeground(new java.awt.Color(127, 0, 0));
        jChBSinopsis_Actualizar.setText("Sipnosis");
        jChBSinopsis_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBSinopsis_ActualizarActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(127, 0, 0));
        jLabel20.setText("Codigo");

        jChBDirector_Actualizar.setBackground(new java.awt.Color(255, 255, 255));
        jChBDirector_Actualizar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBDirector_Actualizar.setForeground(new java.awt.Color(127, 0, 0));
        jChBDirector_Actualizar.setText("Director");
        jChBDirector_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBDirector_ActualizarActionPerformed(evt);
            }
        });

        jTFDirector_Actualizar.setEditable(false);
        jTFDirector_Actualizar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFDirector_Actualizar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFDirector_ActualizarFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPDatosEstudianteActualizarLayout = new javax.swing.GroupLayout(jPDatosEstudianteActualizar);
        jPDatosEstudianteActualizar.setLayout(jPDatosEstudianteActualizarLayout);
        jPDatosEstudianteActualizarLayout.setHorizontalGroup(
            jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addComponent(jChBEstreno_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jTFEstreno_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                    .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jChBNombre_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNombre_Actualizar)
                            .addComponent(jTFCodigo_Actualizar)))
                    .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addComponent(jChBIdioma_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jTFIdioma_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                    .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jChBPuntjae_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jChBSinopsis_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jChBGenero_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jChBDirector_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFGenero_Actualizar)
                            .addComponent(jTFSinopsis_Actualizar)
                            .addComponent(jTFPuntaje_Actualizar)
                            .addComponent(jTFDirector_Actualizar))))
                .addContainerGap())
        );
        jPDatosEstudianteActualizarLayout.setVerticalGroup(
            jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBNombre_Actualizar)
                    .addComponent(jTFNombre_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBEstreno_Actualizar)
                    .addComponent(jTFEstreno_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFIdioma_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChBIdioma_Actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBPuntjae_Actualizar)
                    .addComponent(jTFPuntaje_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jChBSinopsis_Actualizar)
                    .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addComponent(jTFSinopsis_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFGenero_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jChBGenero_Actualizar))))
                .addGap(8, 8, 8)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDirector_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChBDirector_Actualizar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPDatosEstudianteActualizar);
        jPDatosEstudianteActualizar.setBounds(10, 100, 360, 290);

        jPanelDatoEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de la Pelicula"));

        jTFBuscar_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_ActualizarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBuscar_ActualizarEstActionPerformed(evt);
            }
        });
        jTFBuscar_ActualizarEst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarEstKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarEstKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarEstKeyTyped(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFBuscar_ActualizarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoEstudianteLayout.setVerticalGroup(
            jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoEstudianteLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFiltrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFBuscar_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDatoEstudiante);
        jPanelDatoEstudiante.setBounds(10, 30, 360, 70);

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
        jBMax.setBounds(680, 0, 52, 30);

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
        jBSalirIcon.setBounds(730, 0, 52, 30);

        jLEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        jLEncabezado.setOpaque(true);
        getContentPane().add(jLEncabezado);
        jLEncabezado.setBounds(0, 0, 790, 30);

        jLPie.setBackground(new java.awt.Color(0, 0, 0));
        jLPie.setOpaque(true);
        getContentPane().add(jLPie);
        jLPie.setBounds(0, 400, 790, 80);

        jLCuerpo.setBackground(new java.awt.Color(255, 255, 255));
        jLCuerpo.setOpaque(true);
        getContentPane().add(jLCuerpo);
        jLCuerpo.setBounds(0, 30, 790, 370);

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

    private void jChBNombre_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBNombre_ActualizarActionPerformed
        if (jChBNombre_Actualizar.isSelected()) {
            this.jTFNombre_Actualizar.setEditable(true);
        } else {
            this.jTFNombre_Actualizar.setEditable(false);
        }
    }//GEN-LAST:event_jChBNombre_ActualizarActionPerformed

    private void jChBEstreno_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBEstreno_ActualizarActionPerformed
        if (jChBEstreno_Actualizar.isSelected()) {
            this.jTFEstreno_Actualizar.setEditable(true);
        } else {
            this.jTFEstreno_Actualizar.setEditable(false);
        }
    }//GEN-LAST:event_jChBEstreno_ActualizarActionPerformed

    private void jChBPuntjae_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBPuntjae_ActualizarActionPerformed
        if (jChBPuntjae_Actualizar.isSelected()) {
            this.jTFPuntaje_Actualizar.setEditable(true);
        } else {
            this.jTFPuntaje_Actualizar.setEditable(false);
        }
    }//GEN-LAST:event_jChBPuntjae_ActualizarActionPerformed

    private void jChBIdioma_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBIdioma_ActualizarActionPerformed
        if (jChBIdioma_Actualizar.isSelected()) {
            this.jTFIdioma_Actualizar.setEditable(true);
        } else {
            this.jTFIdioma_Actualizar.setEditable(false);
        }
    }//GEN-LAST:event_jChBIdioma_ActualizarActionPerformed

    private void jChBGenero_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBGenero_ActualizarActionPerformed
        if (jChBGenero_Actualizar.isSelected()) {
            this.jTFGenero_Actualizar.setEditable(true);
        } else {
            this.jTFGenero_Actualizar.setEditable(false);
        }
    }//GEN-LAST:event_jChBGenero_ActualizarActionPerformed

    private void jChBSinopsis_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBSinopsis_ActualizarActionPerformed
        if (this.jChBSinopsis_Actualizar.isSelected()) {
            this.jTFSinopsis_Actualizar.setEditable(true);
        } else {
            this.jTFSinopsis_Actualizar.setEditable(false);
        }
    }//GEN-LAST:event_jChBSinopsis_ActualizarActionPerformed

    private void jTFGenero_ActualizarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFGenero_ActualizarFocusLost
        String correo = this.jTFGenero_Actualizar.getText();

        if (name.comprobarExpresionRegular(correo, "correo") == false) {
            getToolkit().beep();

            this.jTFGenero_Actualizar.requestFocus();
        }
    }//GEN-LAST:event_jTFGenero_ActualizarFocusLost


    private void jTFIdioma_ActualizarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFIdioma_ActualizarKeyTyped

    }//GEN-LAST:event_jTFIdioma_ActualizarKeyTyped

    private void jTFBuscar_ActualizarEstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarEstKeyTyped
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
    }//GEN-LAST:event_jTFBuscar_ActualizarEstKeyTyped

    private void jTFBuscar_ActualizarEstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarEstKeyReleased
        String datoBusqueda = this.jTFBuscar_ActualizarEst.getText();
        String columna = "count(*)";
        int select = jComboBoxFiltrarEstudiante.getSelectedIndex();
        switch (select) {
            case 0: {
                this.SQL = "Select count(*) from pelicula where idPelicula like '" + datoBusqueda + "';";
                if (atributos.busquedaCod(tablaActualizar, SQL, columna) == 0) {
                    getToolkit().beep();

                } else {
                    this.SQL = "SELECT * FROM " + tablaActualizar + " WHERE idPelicula like '" + datoBusqueda + "';";
                    atributos.despliegueFields(SQL, tablaActualizar, jTFCodigo_Actualizar, jTFNombre_Actualizar, jTFEstreno_Actualizar,
                            jTFIdioma_Actualizar, jTFPuntaje_Actualizar, jTFSinopsis_Actualizar, jTFGenero_Actualizar, jTFDirector_Actualizar, "actualizar");
                }
                break;
            }
            case 1: {
                this.SQL = "SELECT * FROM " + tablaActualizar + " WHERE nombrePelicula like '%" + datoBusqueda + "%'";
                atributos.despliegueFields(SQL, tablaActualizar, jTFCodigo_Actualizar, jTFNombre_Actualizar, jTFEstreno_Actualizar,
                        jTFIdioma_Actualizar, jTFPuntaje_Actualizar, jTFSinopsis_Actualizar, jTFGenero_Actualizar, jTFDirector_Actualizar, "actualizar");
                break;
            }
        }
    }//GEN-LAST:event_jTFBuscar_ActualizarEstKeyReleased

    private void jTFBuscar_ActualizarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBuscar_ActualizarEstActionPerformed

    private void jTFBuscar_ActualizarEstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarEstKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBuscar_ActualizarEstKeyPressed

    private void jChBDirector_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBDirector_ActualizarActionPerformed
        if (this.jChBDirector_Actualizar.isSelected()) {
            this.jTFDirector_Actualizar.setEditable(true);
        } else {
            JFEstudianteActualizar.jTFDirector_Actualizar.setEditable(false);
        }
    }//GEN-LAST:event_jChBDirector_ActualizarActionPerformed

    private void jTFDirector_ActualizarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFDirector_ActualizarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDirector_ActualizarFocusLost

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
            int seleccion = JOptionPane.showConfirmDialog(null,"¿Desea cancelar la actualizacion?"
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

    private void jBRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRegistrarMouseEntered
        this.jBRegistrar.setText("GUARDAR");
    }//GEN-LAST:event_jBRegistrarMouseEntered

    private void jBRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRegistrarMouseExited
        this.jBRegistrar.setText("guardar");
    }//GEN-LAST:event_jBRegistrarMouseExited

    private void jBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarActionPerformed
        String url = lblurl1.getText();

        if (this.jTFBuscar_ActualizarEst.getText().isEmpty()) {

        } else {

            //if (!jChBFoto.isSelected() && url.isEmpty()) {
            ArrayList<String> atributosActualizar = new ArrayList<>();
            String parametroBusqueda = this.jTFCodigo_Actualizar.getText();
            if (this.jChBNombre_Actualizar.isSelected()) {
                atributosActualizar.add("nombrePelicula='" + jTFNombre_Actualizar.getText() + "'");
            }
            if (this.jChBEstreno_Actualizar.isSelected()) {
                atributosActualizar.add("Estreno='" + jTFEstreno_Actualizar.getText() + "'");
            }
            if (this.jChBPuntjae_Actualizar.isSelected()) {
                atributosActualizar.add("PuntuacionSobre5='" + jTFPuntaje_Actualizar.getText() + "'");
            }
            if (this.jChBIdioma_Actualizar.isSelected()) {
                atributosActualizar.add("idioma='" + jTFIdioma_Actualizar.getText() + "'");
            }
            if (this.jChBSinopsis_Actualizar.isSelected()) {
                atributosActualizar.add("sinopsis='" + jTFSinopsis_Actualizar.getText() + "'");
            }
            if (this.jChBGenero_Actualizar.isSelected()) {
                atributosActualizar.add("genero='" + jTFGenero_Actualizar.getText() + "'");
            }
            if (this.jChBDirector_Actualizar.isSelected()) {
                atributosActualizar.add("directo='" + jTFDirector_Actualizar.getText() + "'");
            }
            String parametroCambio = atributos.prepararActualizar(atributosActualizar);
            this.SQL = "UPDATE " + tablaActualizar + " SET " + parametroCambio + " WHERE idPelicula LIKE " + parametroBusqueda;
            if (atributos.actualizarEliminarTablas(this.SQL) == true) {

                if (this.jChBFoto.isSelected() && !url.isEmpty()) {
                    imagen(url);
                }

                this.setVisible(false);
                limpiarCampos();
            } else {

            }
            //}

        }


    }//GEN-LAST:event_jBRegistrarActionPerformed

    private void imagen(String url) {

        if (url.trim().length() > -1) {
            atributos.guardarImagen(ruta);
            this.setVisible(false);
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "No debe dejar los campos vacios: Nombre e Imagen");
        }
    }

    private void jChBFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBFotoActionPerformed

        if (jChBFoto.isSelected()) {
            JFileChooser j = new JFileChooser();
            j.setCurrentDirectory(new File("C:/Users/Isma2/OneDrive - Escuela Politécnica Nacional/Documentos/SOFTWARE CUARTO SEMESTRE/EDA II/Proyectos/FilmFinder"));

            int ap = j.showOpenDialog(this);

            if (ap == JFileChooser.APPROVE_OPTION) {
                ruta = j.getSelectedFile().getAbsolutePath();
                this.lblimagen.setIcon(new ImageIcon(ruta));
                this.lblurl1.setText(ruta);
            }
        } else {

            if (this.jChBFoto.isSelected()) {
                this.jChBFoto.setSelected(false);
            }
        }
    }//GEN-LAST:event_jChBFotoActionPerformed

    public void limpiarCampos() {
        this.jTFEstreno_Actualizar.setText("");
        this.jTFSinopsis_Actualizar.setText("");
        this.jTFNombre_Actualizar.setText("");
        this.jTFIdioma_Actualizar.setText("");
        this.jTFCodigo_Actualizar.setText("");
        this.jTFGenero_Actualizar.setText("");
        this.jTFBuscar_ActualizarEst.setText("");
        this.jTFPuntaje_Actualizar.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBMax;
    private javax.swing.JButton jBRegistrar;
    private javax.swing.JButton jBSalirIcon;
    private javax.swing.JCheckBox jChBDirector_Actualizar;
    private javax.swing.JCheckBox jChBEstreno_Actualizar;
    private javax.swing.JCheckBox jChBFoto;
    private javax.swing.JCheckBox jChBGenero_Actualizar;
    private javax.swing.JCheckBox jChBIdioma_Actualizar;
    private javax.swing.JCheckBox jChBNombre_Actualizar;
    private javax.swing.JCheckBox jChBPuntjae_Actualizar;
    private javax.swing.JCheckBox jChBSinopsis_Actualizar;
    private javax.swing.JComboBox<String> jComboBoxFiltrarEstudiante;
    private javax.swing.JLabel jLCuerpo;
    private javax.swing.JLabel jLEncabezado;
    private javax.swing.JLabel jLPie;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosEstudianteActualizar;
    private javax.swing.JPanel jPanelDatoEstudiante;
    private javax.swing.JPanel jPanelImagen;
    public static javax.swing.JTextField jTFBuscar_ActualizarEst;
    public static javax.swing.JTextField jTFCodigo_Actualizar;
    public static javax.swing.JTextField jTFDirector_Actualizar;
    public static javax.swing.JTextField jTFEstreno_Actualizar;
    public static javax.swing.JTextField jTFGenero_Actualizar;
    public static javax.swing.JTextField jTFIdioma_Actualizar;
    public static javax.swing.JTextField jTFNombre_Actualizar;
    public static javax.swing.JTextField jTFPuntaje_Actualizar;
    public static javax.swing.JTextField jTFSinopsis_Actualizar;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JLabel lblurl1;
    // End of variables declaration//GEN-END:variables
}
