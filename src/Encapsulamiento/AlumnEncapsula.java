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
public class AlumnEncapsula {
     private int noControl;
     private String email;
     public String nombre, apellidos;
     
     public void setNocontrol(int noControl){
         this.noControl=noControl;
     }
     
     public void setEmail(String email){
         this.email=email;
     }
     
     
     public int getNoControl(){
         return noControl;
     }
     
     public String getEmail(){
         return email;
     }
     
     /*public String getNombre(){
         return nombre;
     }
     
     public String getApellidos(){
         return apellidos;
     } */
     
     void verDatos(){
         System.out.println("Numero Control: "+noControl);
         System.out.println("Email: "+email);
         System.out.println("Nombre: "+nombre);
         System.out.println("Apellidos: "+apellidos);
     }
}
