/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosAbstractos;

import javax.swing.JOptionPane;



public class Empleado extends Persona{
    double sueldo;
    String telefono, direccion;
    Empleado(String nom, int ed, double sueldo, String telefono, String direccion){
        super(nom, ed);
        this.sueldo=sueldo;
        this.telefono=telefono;
        this.direccion=direccion;
    }
    
    @Override
    public void VerDatos(){
        JOptionPane.showMessageDialog(null, "Nombre: "+nombre+" Tu edad: "+ed+"El sueldo es:"+sueldo+" Tu numero: "+telefono+" y Direccion es:"+direccion+JOptionPane.INFORMATION_MESSAGE);
    }
}
