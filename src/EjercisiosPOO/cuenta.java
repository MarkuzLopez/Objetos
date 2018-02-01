/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercisiosPOO;

import javax.swing.JOptionPane;

/**
 *
 * @author Markitos
 */
public class cuenta {
    private String titular;
     private double cantidad;
    
    cuenta(String titular){
        this.titular=titular;
    }
    
    cuenta(String titular, double cantidad){
        this.titular=titular;
        if(cantidad < 0){
            this.cantidad=0;
        }else {
            this.cantidad=cantidad;
        }
    }
    
    public void setTitular(String titular){
        this.titular=titular;
    }
    public void setCantidad(double cantidad){
        this.cantidad=cantidad;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public double getCantidad(){
        return cantidad;
    }
    
    public void ingresar(double cantidad){
        if(cantidad < 0){
            this.cantidad=0;
        }else {
            this.cantidad= this.cantidad+cantidad;
        }
    }
    
    public void retirar(double cantidad){
        if(this.cantidad - cantidad < 0){
            this.cantidad=0;
        }else {
            this.cantidad =  this.cantidad - cantidad;
        }
    }
    public void ToString(){
        JOptionPane.showMessageDialog(null, "El titular"+titular+" tiene: "+cantidad+" euros en la cuenta");
    }
}
