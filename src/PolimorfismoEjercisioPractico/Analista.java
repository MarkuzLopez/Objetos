/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolimorfismoEjercisioPractico;

import javax.swing.JOptionPane;

/**
 *
 * @author Markitos
 */
public class Analista extends Informatico{
    
    public void sueldo(int horas, double pagoH, double incen){
        JOptionPane.showMessageDialog(null, "tu Pago es"+((pagoH*horas)+incen));
    }
    
    public void datos(String nom, String ape, String dir){
        JOptionPane.showMessageDialog(null, "Nombre: "+nom+"\nApellidos: "+ape+"\n Direcccion: "+dir);
    }
    
    public void labores(String lab, int horas){
        JOptionPane.showMessageDialog(null, "Soy Analista y desarollo: "+lab+" trabajo "+horas+" hrs");
    }
}
