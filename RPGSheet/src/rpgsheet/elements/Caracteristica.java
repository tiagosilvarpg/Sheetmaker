/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements;


import java.io.Serializable;
import rpgsheet.elements.interfaces.*;

/**
 *
 * @author Tiago
 */
abstract public class Caracteristica extends Elemento implements Serializable,Escalavel,Melhoravel{ 
 protected  int valor=0,maximo=5; 
    public Caracteristica(){
        this("caracteristica",1,5);
    }
    public Caracteristica(Caracteristica i){
        this(i.label,i.valor,i.maximo);
    }
    public Caracteristica(String label,int valor,int maximo){
        super(label,"descricao");
        this.valor=valor;
        this.maximo=maximo;
    } 
    public String getLabel(){
         return label;
     }
     public void setLabel(String label){
         this.label=label;
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

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
 @Override
    public abstract boolean upgrade(Xp experiencia);
     @Override
    public String toString(){
        return (label+" "+valor+"/"+maximo);        
    }
}
