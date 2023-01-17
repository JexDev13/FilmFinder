package Logic;
import java.util.StringTokenizer;

/*
 * @autores Cinefilos de EDA
 */
public class Comprobaciones {
       private String nombre;
    private String apellido;
    public Comprobaciones() {
    }

    public Comprobaciones(String nombre) {
        this.setNombres(nombre);
    }

    public void setNombres(String nombre) {
        StringTokenizer tokens = new StringTokenizer(nombre, " ");
        this.nombre = (tokens.nextToken());
        this.apellido = (tokens.nextToken());
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}