/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author Markitos
 */
public class Empleado extends Persona implements Enfermo{
    double sueldo;
    String direccion, telefono;
    Empleado(String nombre, int ed, double sueldo, String direccion, String telefono){
        super(nombre, ed);
        this.sueldo=sueldo;
        this.direccion=direccion;
        this.telefono=telefono;
    }
    
    @Override
    public void VerDatos(){
        JOptionPane.showMessageDialog(null, "Nombre: "+nombre+" \nTu edad: "+ed+"\nEl sueldo es:"+sueldo+"\nTu numero: "+telefono+"\n y Direccion es:"+direccion+JOptionPane.INFORMATION_MESSAGE);
    }
    @Override
    public void tos(){
        JOptionPane.showMessageDialog(null, "Estoy enfermo de tos!");
    }
    @Override
    public void gripa(){
        JOptionPane.showMessageDialog(null, "Estoy enfermo de gripa");
    }
}
