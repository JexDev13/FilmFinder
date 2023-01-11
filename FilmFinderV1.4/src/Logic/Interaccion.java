package Logic;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * @autores Cinefilos de EDA
 */
public class Interaccion {

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
                Object[] pelicula = new Object[9];
                DefaultTableModel tabla = new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{"Código", "Nombre", "Estreno", "Idioma", "Puntaje", "Sipnosis", "Genero", "Director","Estado"});
                while (rs.next()) {
                    pelicula[0] = rs.getInt("idPelicula");
                    pelicula[1] = rs.getString("nombrePelicula");
                    pelicula[2] = rs.getString("Estreno");
                    pelicula[3] = rs.getString("idioma");
                    pelicula[4] = rs.getString("PuntuacionSobre5");
                    pelicula[5] = rs.getString("sinopsis");
                    pelicula[6] = rs.getString("genero");
                    pelicula[7] = rs.getString("directo");
                    pelicula[8] = rs.getString("Disponibilidad");
                    tabla.addRow(pelicula);
                }
                jTabla.setModel(tabla);
            }
        } catch (SQLException e) {
            Logger.getLogger(Interaccion.class.getName()).log(Level.SEVERE, null, e);
        }
    }


    public ArrayList busquedaArray(String selectTabla, String SQL) {
        ArrayList lista = new ArrayList();
        try {
            lista = new ArrayList();
            conection = con1.getConnection();
            st = conection.createStatement();
            rs = st.executeQuery(SQL);
            if (selectTabla.equals("pelicula")) {
                while (rs.next()) {
                    Pelicula pelicula = new Pelicula();
                    pelicula.setIdPelicula(rs.getInt("idPelicula"));
                    pelicula.setNombrePelicula(rs.getString("nombrePelicula"));
                    pelicula.setEstreno(Integer.parseInt(rs.getString("Estreno")));
                    pelicula.setIdioma(rs.getString("idioma"));
                    pelicula.setPuntuacionSobre5(Integer.parseInt(rs.getString("PuntuacionSobre5")));
                    pelicula.setSinopsis(rs.getString("sinopsis"));
                    pelicula.setGenero(rs.getString("genero"));
                    pelicula.setDirector(rs.getString("directo"));
                    lista.add(pelicula);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Interaccion.class.getName()).log(Level.SEVERE, null, e);
        }
        return lista;
    }

    public int busquedaCod(String tabla, String SQL, String columna) {
        int codigo = 0;
        try {
            conection = con1.getConnection();
            st = conection.createStatement();
            rs = st.executeQuery(SQL);
            if (tabla.equals("pelicula")) {
                while (rs.next()) {
                    if (columna.equals("idPelicula")) {
                        codigo = rs.getInt("idPelicula");
                    }
                    if (columna.equals("count(*)")) {
                        codigo = rs.getInt("count(*)");
                    }
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
                pps.setString(9, "Disponible");
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
    public String prepararActualizar(ArrayList<String> atributosActualizar) {
        String parametroCambio = "";
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
                    if (uno != null) {
                        uno.setText("" + rs.getInt("idPelicula"));
                    }
                    if (operacion != null && operacion.equalsIgnoreCase("actualizar")) {
                        if (dos != null) {
                            dos.setText(rs.getString("nombrePelicula"));
                        }
                        if (tres != null) {
                            tres.setText(rs.getString("Estreno"));
                        }
                    }
                    if (cuatro != null) {
                        cuatro.setText("" + rs.getString("idioma"));
                    }
                    if (cinco != null) {
                        cinco.setText("" + rs.getString("PuntuacionSobre5"));
                    }
                    if (seis != null) {
                        seis.setText("" + rs.getString("sinopsis"));
                    }
                    if (siete != null) {
                        siete.setText("" + rs.getString("genero"));
                    }
                    if (ocho != null) {
                        ocho.setText("" + rs.getString("directo"));
                    }
                }
            }

        } catch (SQLException e) {
            Logger.getLogger(Interaccion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    //Fin Buscar en tablas.

    public void guardarImagen(String ruta, String nombre) {
        //String insert = "insert into portadas(foto) values(?)";
        String insert = "INSERT INTO portadas(foto) values(?)";
        FileInputStream fi = null;
        PreparedStatement ps = null;
        try {
            File file = new File(ruta);
            fi = new FileInputStream(file);

            ps = cn.prepareStatement(insert);
            ps.setBinaryStream(1, fi);

            ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Error al agregar imagen " + ex.getMessage());
        }
    }

    public void actualizarImagen(String ruta, String parametroBusqueda) {
        //String insert = "insert into portadas(foto) values(?)";
        String insert = "UPDATE portadas SET " + ruta + "' WHERE idPelicula LIKE " + parametroBusqueda;
        int pos;
        try {
            PreparedStatement PS = con1.getConnection().prepareStatement(insert);
            pos = PS.executeUpdate();
            System.out.println(pos);
            if (pos > 0) {
                System.out.println("1");

            }
        } catch (SQLException e) {
            Logger.getLogger(Interaccion.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public ResultSet visualizar() {
        ResultSet rs = null;
        try {
            PreparedStatement ps = cn.prepareStatement("select * from portadas");
            rs = ps.executeQuery();
        } catch (Exception ex) {
            System.out.println("Error de consulta");
        }
        return rs;
    }

    public void visualizar_tabla(JTable tabla) {
        ResultSet rs = visualizar();
        //Image img = null;   
        tabla.setDefaultRenderer(Object.class, new TablaImagen());
        DefaultTableModel dt = new DefaultTableModel();

        dt.addColumn(" ");

        try {

            while (rs.next()) {
                Object[] fila = new Object[1];

                Blob blob = rs.getBlob(2);

                if (blob != null) {
                    try {
                        byte[] data = blob.getBytes(1, (int) blob.length());
                        BufferedImage img = null;
                        try {
                            img = ImageIO.read(new ByteArrayInputStream(data));
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                        ImageIcon icono = new ImageIcon(img.getScaledInstance(375, 500, Image.SCALE_DEFAULT));

                        fila[0] = new JLabel(icono);
                    } catch (Exception ex) {
                        fila[0] = "No Imagen";
                    }
                } else {
                    fila[0] = "No Imagen";
                }

                dt.addRow(fila);
            }

            tabla.setModel(dt);
            tabla.setRowHeight(600);
            tabla.setTableHeader(null);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

}
