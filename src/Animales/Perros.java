/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;

import javax.swing.JOptionPane;

/**
 *
 * @author Markitos
 */
public class Perros extends PadreAnimales{
    String ladran, Olfatean;
    
    Perros(int patas, String ojos, String Ocico, String cola, String ladran, String Olfatean){
        super(patas, ojos, Ocico, cola);
        this.ladran=ladran;
        this.Olfatean=Olfatean;
    }
    @Override
    public void VerDatos(){
        JOptionPane.showMessageDialog(null, "ANIMAL PERRO");
        JOptionPane.showMessageDialog(null, "El Perro tiene: "+patas+" patas");
        JOptionPane.showMessageDialog(null, "El Perro Tiene ojos: "+ojos);
        JOptionPane.showMessageDialog(null, "El Perro Tiene ocico: "+Ocico);
        JOptionPane.showMessageDialog(null, "El Perro Tiene una cola: "+cola);
        JOptionPane.showMessageDialog(null, "El Perro Ladra: "+ladran);
        JOptionPane.showMessageDialog(null, "El Perro Olfatea "+Olfatean);
        
    }
}
