/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Markitos
 */
public class Instanciacion {
    String marca, color;
    int modelo;
    double precio;
    public static void main(String[]args){
        
        Instanciacion primerAuto =  new Instanciacion();
        Instanciacion segundoAuto =  new Instanciacion();
        Instanciacion tercerAuto =  new Instanciacion();
        
        primerAuto.marca="Ford";
        primerAuto.color="Rojo";
        primerAuto.modelo=2012;
        primerAuto.precio=23000.02;
        
        segundoAuto.marca="MAzda";
        segundoAuto.color="Azul";
        segundoAuto.modelo=2107;
        segundoAuto.precio=23089.10;
        
        tercerAuto.marca="Golf VW";
        tercerAuto.color="Gris";
        tercerAuto.modelo=2015;
        tercerAuto.precio=14800.90;
        
        
        System.out.println("Mostrando datos \n de instancias");
        
        System.out.println("Primer Auto Marca: ["+primerAuto.marca+"] \n Modelo ["+primerAuto.modelo+"] \nColor: ["+primerAuto.color+"] \nPrecio $"+primerAuto.precio);
        System.out.println("Segundo Auto Marca: ["+segundoAuto.marca+"] \nColor ["+segundoAuto.color+"] \nModelo ["+segundoAuto.modelo+"] \nPrecio $"+segundoAuto.precio);
        System.out.println("Tercer Auto Marca: ["+tercerAuto.marca+"] \nColor ["+tercerAuto.color+"] \nModelo ["+tercerAuto.modelo+" \nPrecio $"+tercerAuto.precio);
  }   
}
