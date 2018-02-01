/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Markitos
 * 
 * Herencia multiple 
 */
public class PrincipalInt {
    public static void main(String[]args){
        Empleado emp =  new Empleado("Markitos",23, 3000, "Jalpa","71223211");
        emp.VerDatos();
        emp.tos();
    }
}
