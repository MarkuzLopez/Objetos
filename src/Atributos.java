/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Markitos
 */
public class Atributos {
    //Asignando valores a los atributos 
    String marca="Ford", modelo="2012", color="Rojo";
    double precio=278000.32;
    public static void main( String[]args){
        // crear una instancia de mi clase, de un objeto
        Atributos instancia1 =  new Atributos();
        System.out.println("Marca: "+instancia1.marca);
        System.out.println("Modelo: "+instancia1.modelo);
        System.out.println("Color: "+instancia1.color);
        System.out.println("Precio: "+instancia1.precio);
        
    }
}
