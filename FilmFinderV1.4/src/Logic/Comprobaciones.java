package Logic;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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

    public boolean comprobarExpresionRegular(String expresion, String comprobacion) {
        String codificacion=null;
        if (comprobacion.equalsIgnoreCase("nombre")){
            codificacion="^([a-zA-Z]{2,}\\s[a-zA-Z]{1,}'?-?[a-zA-Z]{2,}\\s?([a-zA-Z]{1,})?)";
        } 
        if (comprobacion.equalsIgnoreCase("formatoFecha")) {
            codificacion="^\\d+\\/\\d+\\/\\d{4}.*";
        }
        if(comprobacion.equalsIgnoreCase("fecha")){
            codificacion="^(?:(?:31(\\/)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/)(?:0?[13-9]|1[0-2])\\2))"+ 
                        "(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)"
                        + "?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$"
                        + "|^(?:0?[1-9]|1\\d|2[0-8])(\\/)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        }
        if(comprobacion.equalsIgnoreCase("correo")){
            codificacion="^[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        }
        Pattern patron = Pattern.compile(codificacion);
        Matcher mat = patron.matcher(expresion);
        return mat.matches();
    }
    
    public double sanciones(int dias){
        return (dias*1.5)+0.5;
    }
}