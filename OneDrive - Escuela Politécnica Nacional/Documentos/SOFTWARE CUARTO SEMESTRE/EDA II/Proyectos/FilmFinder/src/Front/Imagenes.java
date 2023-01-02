/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

import javax.swing.ImageIcon;

/**
 *
 * @author Dario
 */
public class Imagenes 
{
  ImageIcon ICONERROR=null;
    ImageIcon ICONCORRECTO=null;
    ImageIcon ICONREVISION=null;
    ImageIcon ICONCANCELAR=null;
    ImageIcon ICONACEPTAR=null;
 
    public ImageIcon getICONCANCELAR() {
        ICONCANCELAR=new ImageIcon(Vista.Estructura.Imagenes.class.getClass().getResource("/Imagenes/warning 128.png"));
        ICONCANCELAR=new ImageIcon(ICONCANCELAR.getImage().getScaledInstance(128, -1, java.awt.Image.SCALE_DEFAULT));
        return ICONCANCELAR;
    }
    
     public ImageIcon getICONACEPTAR() {
        ICONACEPTAR=new ImageIcon(Vista.Estructura.Imagenes.class.getResource("/Imagenes/regresar 32.png"));
        ICONACEPTAR=new ImageIcon(ICONACEPTAR.getImage().getScaledInstance(32, -1, java.awt.Image.SCALE_DEFAULT));
        return ICONACEPTAR;
    }
    
    public ImageIcon getICONERROR() {
        ICONERROR=new ImageIcon(Vista.Estructura.Imagenes.class.getResource("/Imagenes/Acceso Denegado.png"));
        ICONERROR=new ImageIcon(ICONERROR.getImage().getScaledInstance(128, -1, java.awt.Image.SCALE_DEFAULT));
        return ICONERROR;
    }

    public ImageIcon getICONCORRECTO() {
        ICONCORRECTO=new ImageIcon(Vista.Estructura.Imagenes.class.getResource("/Imagenes/conexion correcta.png"));
        ICONCORRECTO=new ImageIcon(ICONCORRECTO.getImage().getScaledInstance(128, -1, java.awt.Image.SCALE_DEFAULT));
        return ICONCORRECTO;
    }

    public ImageIcon getICONREVISION() {
        ICONREVISION=new ImageIcon(Vista.Estructura.Imagenes.class.getResource("/Imagenes/Revision.png"));
        ICONREVISION=new ImageIcon(ICONREVISION.getImage().getScaledInstance(128, -1, java.awt.Image.SCALE_DEFAULT));
        return ICONREVISION;
    }   
}
