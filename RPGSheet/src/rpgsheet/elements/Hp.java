/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements;

import java.io.Serializable;

/**
 *
 * @author Tiago
 */
public class Hp implements Escalavel,Serializable{
    int valor,maximo;
    enum modificador{SAUDAVEL,ESCORIADO,MACHUCADO,FERIDO,FERIDO_GRAVEMENTE,ESPANCADO,ALEIJADO,INCAPACITADO};//0,0,1,1,2,2,5
    
    public Hp(){
        valor=0;
        maximo=10;
    
    }
    
    @Override
    public void setValor(int i){
         if (i>=0)
         valor=i;
     }
 @Override
     public int getValor(){
         return valor;
     }
    @Override
     public void setMaximo(int i){
         if (i>0) maximo=i;
     }
 @Override
     public int getMaximo(){
         return maximo;
     }
    
}
