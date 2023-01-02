package Logic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;
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
                    pelicula[4] = rs.getString("PuntuacionSobre5");
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
    
   //Actualizar y eliminar datos tablas. Jhonathan&&Marlow
     public String prepararActualizar(ArrayList<String> atributosActualizar) 
    {
        String parametroCambio="";
        Iterator i = atributosActualizar.iterator();
        while (i.hasNext()) {
            parametroCambio += i.next() + ",";
        }
        parametroCambio = parametroCambio.substring(0, parametroCambio.length() - 1);
        return parametroCambio;
    }

    public boolean actualizarEliminarTablas(String SQL) {
        int pos;
        try {
            PreparedStatement PS = con1.getConnection().prepareStatement(SQL);
            pos = PS.executeUpdate();
            System.out.println(pos);
            if (pos > 0) {
                return true;
                
            }
        } catch (SQLException e) {
            Logger.getLogger(Interaccion.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
        
        return false;
    }
    //Fin Actualizar tablas.
    
    public void despliegueFields(String SQL, String tabla, JTextField uno, JTextField dos, JTextField tres, JTextField cuatro,
                                JTextField cinco, JTextField seis, JTextField siete, JTextField ocho, String operacion) {
        try {
            conection = con1.getConnection();
            st = conection.createStatement();
            rs = st.executeQuery(SQL);
            if (tabla.equals("pelicula")) {
                while (rs.next()) {
                    if(uno != null){uno.setText(""+rs.getInt("idPelicula"));}
                    if (operacion != null && operacion.equalsIgnoreCase("actualizar")){
                        if(dos!=null){dos.setText(rs.getString("nombrePelicula"));}
                        if(tres!=null){tres.setText(rs.getString("Estreno"));}
                    } 
                    if (cuatro != null) {cuatro.setText("" + rs.getInt("idioma"));}
                    if(cinco!=null){cinco.setText("" + rs.getString("PuntuacionSobre5"));}
                    if(seis!=null){seis.setText("" + rs.getString("sinopsis"));}
                    if(siete!=null){siete.setText("" + rs.getString("genero"));}
                }
            }
            
        
        }catch(SQLException e){
            Logger.getLogger(Interaccion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    //Fin Buscar en tablas.

}
