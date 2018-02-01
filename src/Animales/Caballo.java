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
public class Caballo extends PadreAnimales{
    String relincha, Noble;
    
    Caballo(int patas, String ojos, String Ocico, String cola, String relincha, String Noble){
        super(patas, ojos, Ocico, cola);
        this.relincha=relincha;
        this.Noble=Noble;
    }
    
    @Override
    public void VerDatos(){
        JOptionPane.showMessageDialog(null, "ANIMAL CABALLO");
        JOptionPane.showMessageDialog(null, "EL CABALLO TIENE: "+patas+" patas");
        JOptionPane.showMessageDialog(null, "El CABALLO TIENE ojos"+ojos);
        JOptionPane.showMessageDialog(null, "El CABALLO TIENE Ocico"+Ocico);
        JOptionPane.showMessageDialog(null, "El CABALLO TIENE cola"+cola);
        JOptionPane.showMessageDialog(null, "El CABALLO Relincha"+relincha);
        JOptionPane.showMessageDialog(null, "El CABALLO es noble"+Noble);

    }
}
