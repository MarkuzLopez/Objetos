/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author Markitos
 */
public class ClaseHija extends ClasePadre{
    @Override
    public void HagoCerveza(){
        JOptionPane.showMessageDialog(null,"Hola Soy la Subclase ClaseHija, y hago tambien cerveza");
    }
    
    public void Hola(){
        JOptionPane.showMessageDialog(null,"Hola Probando, la Subclase");
    }
}
