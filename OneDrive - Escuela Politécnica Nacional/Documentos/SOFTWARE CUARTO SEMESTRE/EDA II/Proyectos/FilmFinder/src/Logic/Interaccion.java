package Logic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JEREMY
 */
public class Interaccion 
{
    Conexion con1 = new Conexion();
    Connection cn = con1.conectar();
    Connection conection;
    Statement st;
    ResultSet rs;
    
    public void busquedaDespliegue(JTable jTabla, String selectTabla, String SQL) {
        try {
            conection = con1.getConnection();
            st = conection.createStatement();
            rs = st.executeQuery(SQL);
            if (selectTabla.equals("pelicula")) {
                Object[] pelicula = new Object[8];
                DefaultTableModel tabla = new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{"Código", "Nombre", "Estreno", "Idioma", "Puntaje","Sipnosis", "Genero", "Director"});
                while (rs.next()) {
                    pelicula[0] = rs.getInt("idPelicula");
                    pelicula[1] = rs.getString("nombrePelicula");
                    pelicula[2] = rs.getString("Estreno");
                    pelicula[3] = rs.getString("idioma");
                    pelicula[4] = rs.getString("puntuacion");
                    pelicula[5] = rs.getString("sinopsis");
                    pelicula[6] = rs.getString("genero");
                    pelicula[7] = rs.getString("directo");
                    tabla.addRow(pelicula);
                }
                jTabla.setModel(tabla);
            }
        } catch (SQLException e) {
            Logger.getLogger(Interaccion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public int busquedaCod(String tabla, String SQL, String columna) {
        int codigo = 0;
        try {
            conection = con1.getConnection();
            st = conection.createStatement();
            rs = st.executeQuery(SQL);
            if (tabla.equals("pelicula")) {
                while (rs.next()) {
                    if(columna.equals("idPelicula")) {codigo = rs.getInt("idPelicula");}
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Interaccion.class.getName()).log(Level.SEVERE, null, e);
        }
        return codigo;
    }
    
    //Insertar en tablas. Francisco
    public boolean insertarTabla(String SQL, String tabla, int codigoEstudiante, String nombre, String apellido, String celular,
            String sector, String facultad, String correo, int codigoLibro, String titulo, String fecha1, String edicion,
            String categoria, int stock, int disponibilidad, String fecha2, String codigoPrestamo, String director) {
        try {
            PreparedStatement pps = cn.prepareStatement(SQL);
            if (tabla.equals("pelicula")) {
                pps.setInt(1, codigoEstudiante);
                pps.setString(2, nombre);
                pps.setString(3, apellido);
                pps.setString(4, celular);
                pps.setString(5, sector);
                pps.setString(6, facultad);
                pps.setString(7, correo);
                pps.setString(8, director);
                pps.executeUpdate();
                return true;
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Logic.Interaccion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //Fin Insertar en tablas.
}
