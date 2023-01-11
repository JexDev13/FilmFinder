package Front.Mejores;

import Logic.Pelicula;
import Logic.Interaccion;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * @autores Cinefilos de EDA
 */
public class JPMejores extends javax.swing.JPanel {

    Interaccion atributos = new Interaccion();
    private String selectTabla = "pelicula";
    private String SQL;
    private Pelicula pelicula;

    public JPMejores() {
        initComponents();
        jTableTablaEstudiantes.getTableHeader().setBackground(new Color(127, 0, 0));
        jTableTablaEstudiantes.getTableHeader().setFont(new Font("Segoe UI Symbol", Font.BOLD, 12));
        jTableTablaEstudiantes.getTableHeader().setForeground(Color.WHITE);
        this.SQL = "select * from " + selectTabla;
        llenarTabla();
    }

    private void llenarTabla() {
        ArrayList<Pelicula> listaPeliculas = atributos.busquedaArray(selectTabla, SQL);
        Collections.sort(listaPeliculas);
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Código", "Nombre", "Estreno", "Idioma", "Puntaje", "Sipnosis", "Genero", "Director"}, 10);
        jTableTablaEstudiantes.setModel(modelo);

        TableModel modeloDatos = jTableTablaEstudiantes.getModel();
        for (int i = 0; i < 10; i++) {
            pelicula = listaPeliculas.get(i);
            modeloDatos.setValueAt(pelicula.getIdPelicula(), i, 0);
            modeloDatos.setValueAt(pelicula.getNombrePelicula(), i, 1);
            modeloDatos.setValueAt(pelicula.getEstreno(), i, 2);
            modeloDatos.setValueAt(pelicula.getIdioma(), i, 3);
            modeloDatos.setValueAt(pelicula.getPuntuacionSobre5(), i, 4);
            modeloDatos.setValueAt(pelicula.getSinopsis(), i, 5);
            modeloDatos.setValueAt(pelicula.getGenero(), i, 6);
            modeloDatos.setValueAt(pelicula.getDirector(), i, 7);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTablaEstudiantes = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(127, 0, 0)));

        jTableTablaEstudiantes.setAutoCreateRowSorter(true);
        jTableTablaEstudiantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(127, 0, 0)));
        jTableTablaEstudiantes.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTableTablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Estreno", "Idioma", "Puntaje", "Sipnosis", "Genero", "Director"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTablaEstudiantes.setGridColor(new java.awt.Color(127, 0, 0));
        jTableTablaEstudiantes.setSelectionBackground(new java.awt.Color(255, 214, 214));
        jTableTablaEstudiantes.setShowGrid(true);
        jTableTablaEstudiantes.getTableHeader().setResizingAllowed(false);
        jTableTablaEstudiantes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableTablaEstudiantes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTablaEstudiantes;
    // End of variables declaration//GEN-END:variables
}
