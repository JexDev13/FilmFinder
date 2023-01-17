package Logic;

/**
 *
 * @author Say
 */
public class Pelicula implements Comparable<Pelicula>{
    private int idPelicula;
    private String nombrePelicula;
    private int estreno;
    private String idioma;
    private int puntuacionSobre5;
    private String sinopsis;
    private String genero;
    private String director;
    private String estado;

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public int getEstreno() {
        return estreno;
    }

    public void setEstreno(int estreno) {
        this.estreno = estreno;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getPuntuacionSobre5() {
        return puntuacionSobre5;
    }

    public void setPuntuacionSobre5(int puntuacionSobre5) {
        this.puntuacionSobre5 = puntuacionSobre5;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    @Override
    public int compareTo(Pelicula o) {
        if(o.getPuntuacionSobre5()<puntuacionSobre5){
            return -1;
        }else if(o.getPuntuacionSobre5()<puntuacionSobre5){
            return 0;
        }else{
            return 1;
        }
    }
    
    
}
