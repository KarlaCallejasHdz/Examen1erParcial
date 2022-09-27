package Lemon;
import java.util.*;
public class Principal{
    public static void main(String[] args ){
        System.out.println("clASE");
        DatosTarjeta cs = new DatosTarjeta();
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar nombre de propietario: ");
        String nombre = sc.nextLine();
        cs.setNombreProp(nombre);
        System.out.println("ingrese su numero de tarjeta: ");
        int num = sc.nextInt();
        cs.setTarjeta(num);
  
        System.out.println("Nombre: "+cs.getNombreProp());
        
        System.out.println("Tarjeta: "+cs.getTarjeta());
     
    }
}
