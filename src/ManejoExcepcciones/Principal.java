/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoExcepcciones;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[]args){
        int i=0, x, y, res;
        int vector[]={1,2,3,4,5};
        String nom;
        boolean erroes=false;
        try {
        nom = JOptionPane.showInputDialog(null,"Ingreaa Nombre");
        x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa Numero","Solictando numeros",3));
        y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa Y","Solicitando Y",3));
        res=x/y;
        JOptionPane.showMessageDialog(null, "La Division de: "+x+" / "+y+"Es de: "+res);
        res = x/y;
            for (i = 0; i < vector.length; i++) {
                System.out.println("["+vector[i]+"]");
            }        
        }catch(NumberFormatException n){
            System.out.println("Hubo un Error en: "+n.getMessage());
            erroes=true;
         }
        catch(ArithmeticException a){
            System.out.println("Hay un error: "+a.getMessage());
            erroes=true;
        }
        
        catch(ArrayIndexOutOfBoundsException arr){
            System.out.println(arr.getMessage()+"en el indice: "+i);
            erroes=true;
        }
        finally{
            if(erroes == true){
            System.out.println();
            System.out.println("Esta seccion corrio Con EErrores! ");
          }else {
                System.out.println("Este proyecto corrio correctamente!");
            }
        }
    }
}
