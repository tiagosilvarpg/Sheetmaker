/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements;

/**
 *
 * @author Tiago
 */
public abstract class Elemento {
   protected  String label,descricao;
   
   public Elemento(String label,String descricao){
       this.label=label;
       this.descricao=descricao;
       
   }
   public Elemento(Elemento e){
       this(e.label,e.descricao);       
   }
   public Elemento(){
       this("Elemento","Descricao");
   }
   @Override
    public String toString(){
        return (label+" \""+descricao+"\"");        
    }
   
    
}
