package Logic;

import Front.Estructura;

/*
 * @autores Cinefilos de EDA
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello World!");
        Estructura est = new Estructura();
        est.setVisible(true);
        Conexion cn = new Conexion();
        cn.conectar();
    }
}
