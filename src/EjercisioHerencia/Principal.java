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
public class Principal {
    public static void main(String[]args){
        String nom, tel, dir;
        double suel;
        int ed;
        nom=JOptionPane.showInputDialog(null, "Ingresa El nombre:");
        ed=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la Edad",2));
        suel=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el Sueldo",2));
        tel=JOptionPane.showInputDialog(null,"Ingresa el Telefono",2);
        dir=JOptionPane.showInputDialog(null,"Ingresa la direccion: ",2);
        
        Empleado emp1 = new Empleado(25, "Markitos", 100000.01,"7122345678","Jalpa");
        Empleado emp2 = new Empleado(23, "Saul", 150000.01,"7122345678","Santa Maria");
        Empleado emp3 =  new Empleado(ed, nom, suel, tel, dir);
        emp1.verDatos();
        emp2.verDatos();
        emp3.verDatos();
        
    }
}
