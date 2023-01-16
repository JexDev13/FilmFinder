package Logic;
import java.sql.Connection;
import java.sql.DriverManager;
/*
 * @autores Cinefilos de EDA
 */
public class Conexion {

    Connection cn;
    public Connection getConnection() {
        return cn;
    }

    public Connection conectar() {
        try {
            String user = "root"; //Aqui tienen que poner su usuario SQL cuando clonen el repositorio
            String password = "santodomingo23"; //Aqui tienen que poner su contraseña SQL cuando clonen el repositorio
            String direccion = "jdbc:mysql://localhost:3306/proyecto1"; //proyecto1 es la base de datos, esa se debe guardar en la conexion de sql
            cn = DriverManager.getConnection(direccion, user, password);
            System.out.println("Se hizo la conexion de forma correcta"); //Por el momento solo esta para verificar que exista conexion
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }
}
