package Lemon;
import java.util.*;

/**
 * 
 */
public class DatosTarjeta extends IngresarDinero {

    /**
     * Default constructor
     */
    public DatosTarjeta() {
    }

    /**
     * 
     */
    public String Nombre;

    /**
     * 
     */
    public int NumeroTarjeta;

    /**
     * 
     */
    public String fechaVencimiento;

    /**
     * 
     */
    public int clave;

    /**
     * 
     */
    public int idDatoTarjeta;

    /**
     * @return
     */
    public void setNombreProp(String np){
        // TODO implement here
       Nombre = np;
    }

    /**
     * @return
     */
    public String getNombreProp() {
        // TODO implement here
        return Nombre;
    }

    /**
     * @return
     */
    public void setTarjeta(int t) {
        // TODO implement here
        NumeroTarjeta = t;
    }

    /**
     * @return
     */
    public int getTarjeta() {
        // TODO implement here
        return NumeroTarjeta;
    }

    /**
     * @return
     */
    public void setfecha(String f) {
        // TODO implement here
        fechaVencimiento = f;
    }

    /**
     * @return
     */
    public void actualizar() {
        // TODO implement here
       
    }

    /**
     * @return
     */
    public void eliminar() {
        // TODO implement here
       
    }

    /**
     * @return
     */
    public void setClave(int c) {
      
        clave = c;
    }

    /**
     * @return
     */
    public int getClave() {
        // TODO implement here
        return clave;
    }

    /**
     * @return
     */
    public String getFecha() {
        // TODO implement here
        return fechaVencimiento;
    }

}