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
public class Recurso implements Serializable{
     protected int valor,maximo;
     protected String label;
 public Recurso(){
     valor=0;
     maximo=0;
     label="recurso";
 }
 public Recurso(String label,int valor,int maximo){
     this.valor=valor;
     this.maximo=maximo;
     this.label=label;
 }
 public Recurso(Recurso r){
     this.valor=r.valor;
     this.maximo=r.maximo;
     this.label=r.label;
 }
     @Override
 public String toString(){
     return label+" "+valor+"/"+maximo;
 }
    public void setValor(int i){
         if (i>=0)
         valor=i;
    }
     public int getValor(){
         return valor;
     }
     public void setMaximo(int i){
         if (i>0) maximo=i;
     }
     public int getMaximo(){
         return maximo;
     }    
}
