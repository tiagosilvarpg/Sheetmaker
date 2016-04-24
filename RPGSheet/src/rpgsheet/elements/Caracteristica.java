/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements;

import rpgsheet.elements.Element;
import rpgsheet.elements.Escalavel;
import rpgsheet.elements.Gerenciavel;

/**
 *
 * @author Tiago
 */
abstract public class Caracteristica extends Element implements Escalavel,Gerenciavel{
 protected  String label,descricao;
 protected  int valor=0,maximo=5;
 
    public Caracteristica(){
        this("caracteristica",1,5);
    }
    public Caracteristica(Caracteristica i){
        this(i.label,i.valor,i.maximo);
    }
    public Caracteristica(String label,int valor,int maximo){
        this.label=label;
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
}
