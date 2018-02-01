/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Markitos
 */
public class MetodoAuto {
    
//Metodo
    void ArracnarAuto(String marca,int modelo, String color, double precio){
        System.out.println(" Arranco el auto con marca: "+marca+" y modelo :"+modelo+" color "+color+" con precio $"+precio); 
    }   
    
    void apagarAuto(String marca, int modelo, String color, double precio){
        System.out.println("Apagado el auto con Marca: "+marca+" Modelo: "+modelo+" Color"+color+" Precio $"+precio);
    }
    
    void AceleraAuto(String marca, int modelo, String color, double precio){
        System.out.println("Acelarando auto con Marca: "+marca+" modelo "+modelo+" color "+color+"Precio $"+precio);
    } 
    
    void FrenarAuto(String marca, int modelo, String color, double precio)
    {
        System.out.println("Se Freno el auto Marca "+marca+" modelo "+modelo+" color "+color+"PRecio $"+precio);
    }
    
    int suma (int x, int y){
        int res;
        res = x+y;
        return res;
    }
    
    int resta(int z,int v){
        return (z-v);
    }
    
    boolean estado(int tequilas){
        boolean e=false;
        if(tequilas >5){
            e=true;
        }else {
            e=false;
        }
        return e;
    }
}
