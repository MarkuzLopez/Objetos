/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArticulosHogar;

/**
 *
 * @author Markitos
 */
public class Electrodomesticos {
    String color="Blanco";
    char Consumo='F';
    int precio=100, peso=5;

     Electrodomesticos() {
      
     }
    
    
    Electrodomesticos(String color, char Consumo, int precio, int peso){
        this.color=color;
        this.Consumo=Consumo;
        this.precio=precio;
        this.peso=peso;
    }
    
    Electrodomesticos(int precio,int peso){
        this.precio=precio;
        this.peso=peso;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return Consumo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getPeso() {
        return peso;
    }
    
    
}
