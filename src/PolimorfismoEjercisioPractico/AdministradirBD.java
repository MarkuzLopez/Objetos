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
public class AdministradirBD {
    public void sueldo(double pago){
        JOptionPane.showMessageDialog(null, "Rl pago es: "+ pago);
    }
    public void datos(String nom){
        JOptionPane.showMessageDialog(null, "Nombre: "+ nom);
    }
    
    public void labores(String lab){
        JOptionPane.showMessageDialog(null, "Soy Administrador BD y realizo"+lab );
    }
}
