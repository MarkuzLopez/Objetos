/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercisioHerencia;

import javax.swing.JOptionPane;

/**
 *
 * @author Markitos
 */
public class Empleado extends Persona{
    double sueldo;
    String telefono;
    String direccion;
    
    Empleado(int edad, String nombre, double sueldo, String telefono, String direccion){
        super(edad, nombre);
        this.sueldo=sueldo;
        this.telefono=telefono;
        this.direccion=direccion;
        
    }
    @Override
     public void verDatos(){
        JOptionPane.showMessageDialog(null, "El nombre del Empleado es: "+nombre+" \nTiene la Edad: "+edad+""
                + " \ncon el sueldo $"+sueldo+"\nTelefono  :"+telefono+"\nConDireccion: "+direccion+1);
    }
}
