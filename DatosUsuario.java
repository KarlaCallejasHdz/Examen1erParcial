package Lemon;
import java.util.*;

/**
 * 
 */
public class DatosUsuario {

    /**
     * Default constructor
     */
    public DatosUsuario() {
    }

    /**
     * 
     */
    public int idUsuario;

    /**
     * 
     */
    public String Nombre;

    /**
     * 
     */
    public String ApellidoMat;

    /**
     * 
     */
    public String ApellidoPat;

    /**
     * 
     */
    public String curp;

    /**
     * 
     */
    public String email;

    /**
     * 
     */
    public String nacionalidad;

    /**
     * @return
     */
    public void setNombreU(String nom) {
      Nombre = nom;
    }
 
    
    /**
     * @return
     */
    public String getNombreU() {
        // TODO implement here
        return Nombre;
    }

    /**
     * @return
     */
    public void setApellidoPat(String ap) {
      ApellidoPat =ap;
    }

    /**
     * @return
     */
    public String getApellidoPat() {
        // TODO implement here
        return ApellidoPat;
    }

    /**
     * @return
     */
    public void setApellidoMat(String am) {
       ApellidoMat = am;
    }

    /**
     * @return
     */
    public String getApellidoMat() {
        // TODO implement here
        return ApellidoMat;
    }

    /**
     * @return
     */
    public String getCurp() {
        // TODO implement here
        return curp;
    }

    /**
     * @return
     */
    public void setCurp(String cp) {
       curp = cp;
    }

    /**
     * @return
     */
    public void setEmail(String el) {
       email = el;
    }

    /**
     * @return
     */
    public String getEmail() {
        // TODO implement here
        return email;
    }

    /**
     * @return
     */
    public void setNacionalidad(String nc) {
        // TODO implement here
        nacionalidad = nc;
    }

    /**
     * @return
     */
    public String getNacionalidad() {
        // TODO implement here
        return nacionalidad;
    }

}