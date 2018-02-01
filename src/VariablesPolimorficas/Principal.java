/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VariablesPolimorficas;

/**
 *
 * @author Markitos
 * 
 * Variable polimorfica es aquella
 * que contiene un objeto , 
 */
public class Principal {
    public static void main(String[]args){
        Optimista obOp =  new Optimista();
        Pesimista obpesi =  new Pesimista();
        Introvertido obIntro =  new Introvertido();
        
          //Creando mi variable Polimorfica
        Personalidad objPersonalidades[] =  new Personalidad[3];
        objPersonalidades[0]=obOp;
        objPersonalidades[1]=obpesi;
        objPersonalidades[2]=obIntro;
        
        // Variables polimorficas trabajando
        for (int i = 0; i < objPersonalidades.length; i++) {
            objPersonalidades[i].hablar();
        }
        
    }
}
