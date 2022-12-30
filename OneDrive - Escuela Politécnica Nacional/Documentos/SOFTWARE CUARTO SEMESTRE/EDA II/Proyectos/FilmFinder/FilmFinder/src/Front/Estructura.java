package Front;

import Front.Mejores.JPMejores;
import Front.Peliculas.JPPeliculas;
import Front.Rentas.JPRentas;
import Logic.Fecha;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.ImageIcon;

/*
 * @autores Cinefilos de EDA
 */
public class Estructura extends javax.swing.JFrame implements Runnable {

    int x;
    int y;
    Thread h1;

    public Estructura() {
        initComponents();
        setLocationRelativeTo(this);
        setIconImage(new ImageIcon(getClass().getResource("../Images/deskIcon.png")).getImage()); //icono para escritorio
        h1 = new Thread(this); //se declara un nuevo hilo
        h1.start(); //se inicia el hilo, este hilo solo funciona solo para el reloj
        JPPeliculas peli = new JPPeliculas();
        peli.setSize(1230, 540);
        peli.setLocation(0, 0);
        this.jPContenido.removeAll();
        this.jPContenido.add(peli, BorderLayout.CENTER);
        this.jPContenido.revalidate();
        this.jPContenido.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPEncabezado = new javax.swing.JPanel();
        jBSalirIcon = new javax.swing.JButton();
        jBMax = new javax.swing.JButton();
        jBGitLink = new javax.swing.JButton();
        jLabelTituloPanel = new javax.swing.JLabel();
        jLEncabezado = new javax.swing.JLabel();
        jPMenu = new javax.swing.JPanel();
        jBPeliculas = new javax.swing.JButton();
        jBMejores = new javax.swing.JButton();
        jBRentar = new javax.swing.JButton();
        jLabelDia = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        jPContenido = new javax.swing.JPanel();
        jPPiePag = new javax.swing.JPanel();
        jLCreditos = new javax.swing.JLabel();
        jLPiePag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPEncabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPEncabezado.add(jBSalirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 52, 30));

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
        jPEncabezado.add(jBMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 52, 30));
        jBMax.getAccessibleContext().setAccessibleDescription("max");

        jBGitLink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/git prev 32.png"))); // NOI18N
        jBGitLink.setToolTipText("GitHub");
        jBGitLink.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(48, 108, 97)));
        jBGitLink.setBorderPainted(false);
        jBGitLink.setContentAreaFilled(false);
        jBGitLink.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBGitLink.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBGitLink.setPreferredSize(new java.awt.Dimension(24, 24));
        jBGitLink.setRequestFocusEnabled(false);
        jBGitLink.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/git post 32.png"))); // NOI18N
        jBGitLink.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/git post 32.png"))); // NOI18N
        jBGitLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGitLinkActionPerformed(evt);
            }
        });
        jPEncabezado.add(jBGitLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 52, 30));

        jLabelTituloPanel.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTituloPanel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloPanel.setText("PELICULAS");
        jPEncabezado.add(jLabelTituloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 280, 30));

        jLEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        jLEncabezado.setOpaque(true);
        jPEncabezado.add(jLEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 30));

        getContentPane().add(jPEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 30));

        jPMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBPeliculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pelliculasPre2.png"))); // NOI18N
        jBPeliculas.setToolTipText("minimizar");
        jBPeliculas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(48, 108, 97)));
        jBPeliculas.setBorderPainted(false);
        jBPeliculas.setContentAreaFilled(false);
        jBPeliculas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBPeliculas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBPeliculas.setPreferredSize(new java.awt.Dimension(24, 24));
        jBPeliculas.setRequestFocusEnabled(false);
        jBPeliculas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pelliculasPos2.png"))); // NOI18N
        jBPeliculas.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pelliculasPos2.png"))); // NOI18N
        jBPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPeliculasActionPerformed(evt);
            }
        });
        jPMenu.add(jBPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 200, 110));

        jBMejores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TopPre2.png"))); // NOI18N
        jBMejores.setToolTipText("Top10");
        jBMejores.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(48, 108, 97)));
        jBMejores.setBorderPainted(false);
        jBMejores.setContentAreaFilled(false);
        jBMejores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBMejores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBMejores.setPreferredSize(new java.awt.Dimension(24, 24));
        jBMejores.setRequestFocusEnabled(false);
        jBMejores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TopPos2.png"))); // NOI18N
        jBMejores.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TopPos2.png"))); // NOI18N
        jBMejores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMejoresActionPerformed(evt);
            }
        });
        jPMenu.add(jBMejores, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 200, 110));

        jBRentar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RentaPre2.png"))); // NOI18N
        jBRentar.setToolTipText("Rentas");
        jBRentar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(48, 108, 97)));
        jBRentar.setBorderPainted(false);
        jBRentar.setContentAreaFilled(false);
        jBRentar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBRentar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBRentar.setPreferredSize(new java.awt.Dimension(24, 24));
        jBRentar.setRequestFocusEnabled(false);
        jBRentar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RentaPos2.png"))); // NOI18N
        jBRentar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RentaPos2.png"))); // NOI18N
        jBRentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRentarActionPerformed(evt);
            }
        });
        jPMenu.add(jBRentar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 200, 110));

        jLabelDia.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDia.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabelDia.setForeground(new java.awt.Color(255, 244, 244));
        jLabelDia.setText("Miercoles");
        jLabelDia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPMenu.add(jLabelDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 170, 40));

        jLabelFecha.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(255, 244, 244));
        jLabelFecha.setText("22 de Septiembre de 2022");
        jPMenu.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, -1, 70));

        jLabelHora.setFont(new java.awt.Font("Segoe UI Symbol", 1, 22)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(255, 244, 244));
        jLabelHora.setText("00:00:00 AM");
        jLabelHora.setToolTipText("");
        jLabelHora.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelHora.setInheritsPopupMenu(false);
        jPMenu.add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 70, 140, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FondoMenu6.png"))); // NOI18N
        jLabelFondo.setMaximumSize(new java.awt.Dimension(260, 670));
        jLabelFondo.setMinimumSize(new java.awt.Dimension(260, 670));
        jLabelFondo.setPreferredSize(new java.awt.Dimension(260, 670));
        jPMenu.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 110));

        getContentPane().add(jPMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1230, 110));

        jPContenido.setBackground(new java.awt.Color(255, 255, 255));
        jPContenido.setMaximumSize(new java.awt.Dimension(970, 630));
        jPContenido.setMinimumSize(new java.awt.Dimension(970, 630));
        jPContenido.setPreferredSize(new java.awt.Dimension(970, 630));
        getContentPane().add(jPContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1230, 540));

        jPPiePag.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLCreditos.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLCreditos.setForeground(new java.awt.Color(255, 255, 255));
        jLCreditos.setText("  Develop by Cinefilos de EDAII");
        jPPiePag.add(jLCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 30));

        jLPiePag.setBackground(new java.awt.Color(0, 0, 0));
        jLPiePag.setOpaque(true);
        jPPiePag.add(jLPiePag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 30));

        getContentPane().add(jPPiePag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1230, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirIconActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSalirIconActionPerformed

    private void jBMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMaxActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jBMaxActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX(); //movimiento por pantalla
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen(); //movimiento por pantalla
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void jBGitLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGitLinkActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/JexDev13/FilmFinder.git"));
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_jBGitLinkActionPerformed

    private void jBPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPeliculasActionPerformed
        this.jLabelTituloPanel.setText("PELICULAS");
        JPPeliculas peli = new JPPeliculas();
        peli.setSize(1230, 540);
        peli.setLocation(0, 0);
        this.jPContenido.removeAll();
        this.jPContenido.add(peli, BorderLayout.CENTER);
        this.jPContenido.revalidate();
        this.jPContenido.repaint();

    }//GEN-LAST:event_jBPeliculasActionPerformed

    private void jBMejoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMejoresActionPerformed
        this.jLabelTituloPanel.setText("TOP 10");
        JPMejores mejor = new JPMejores();
        mejor.setSize(1230, 540);
        mejor.setLocation(0, 0);
        this.jPContenido.removeAll();
        this.jPContenido.add(mejor, BorderLayout.CENTER);
        this.jPContenido.revalidate();
        this.jPContenido.repaint();
    }//GEN-LAST:event_jBMejoresActionPerformed

    private void jBRentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRentarActionPerformed
        this.jLabelTituloPanel.setText("RENTAS");
        JPRentas renta = new JPRentas();
        renta.setSize(1230, 540);
        renta.setLocation(0, 0);
        this.jPContenido.removeAll();
        this.jPContenido.add(renta, BorderLayout.CENTER);
        this.jPContenido.revalidate();
        this.jPContenido.repaint();
    }//GEN-LAST:event_jBRentarActionPerformed

    @Override
    public void run() { //metodo especificamente creado para hilos 
        Thread ct = Thread.currentThread(); //Herencia de una clase libreria de java para hilos
        while (ct == h1) {
            Fecha tiempo = new Fecha();
            this.jLabelDia.setText(tiempo.getDia());
            this.jLabelFecha.setText(tiempo.toString());
            this.jLabelHora.setText(tiempo.hora + ":" + tiempo.minutos + ":" + tiempo.segundos + " " + tiempo.ampm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Estructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estructura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGitLink;
    private javax.swing.JButton jBMax;
    private javax.swing.JButton jBMejores;
    private javax.swing.JButton jBPeliculas;
    private javax.swing.JButton jBRentar;
    private javax.swing.JButton jBSalirIcon;
    private javax.swing.JLabel jLCreditos;
    private javax.swing.JLabel jLEncabezado;
    private javax.swing.JLabel jLPiePag;
    private javax.swing.JLabel jLabelDia;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelTituloPanel;
    private javax.swing.JPanel jPContenido;
    private javax.swing.JPanel jPEncabezado;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JPanel jPPiePag;
    // End of variables declaration//GEN-END:variables
}
