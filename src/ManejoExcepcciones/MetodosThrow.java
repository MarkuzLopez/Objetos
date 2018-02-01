/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoExcepcciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Markitos
 */
public class MetodosThrow {
    static int x,y;
    public static void main(String[]args){
        try {
            sumar();
            dividir(5, 0);
        } catch (NumberFormatException n) {
            System.out.println(n.getMessage()+"Error de numeros");
        }
        catch(ArithmeticException ar){
            System.out.println(ar.getMessage()+"\n Error Aritmetico");
        }
    }
    
    public static void sumar() throws NumberFormatException {
        x=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa X","Solicitando Mensaje: ",1));
        y=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Y","Solicitando Mensaje: ",1));
        
        JOptionPane.showMessageDialog(null,"La suma de: "+x+" y "+y+" es: "+(x+y));
    }
    
    public static void dividir(int x, int a) throws ArithmeticException {
        if(a==0){
            throw new ArithmeticException("No es Divisible el 0");
        }else {
            JOptionPane.showMessageDialog(null, "La DIVISION DS: "+x+" y "+a+" es: "+(x/a));
        
        }
    }
}
