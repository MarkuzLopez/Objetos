/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

/**
 *
 * @author Markitos
 */
public class PrincipalEncapsulamiento {
    public static void main(String[]args){
     AlumnEncapsula alu1 =  new AlumnEncapsula();
     AlumnEncapsula alu2 = new AlumnEncapsula();
     
     alu1.setNocontrol(2012);
     alu1.setEmail("marco.02@hotmail.com");
     alu1.nombre="MArkitos";
     alu1.apellidos="Lopez";
     alu1.verDatos();
        System.out.println("\n");
        System.out.println("Accediendo al NoControl: "+alu1.getNoControl());
     alu1.setNocontrol(9090);
        System.out.println("Cambiando El numero de control \n"+alu1.getNoControl());
        alu1.verDatos();
        System.out.println("\n");
     alu2.setNocontrol(15048);
     alu2.setEmail("verito@gmail.com");
     alu2.nombre="Berenice Berito";
     alu2.apellidos="Lopez Varela";
     alu2.verDatos();
    }
}
