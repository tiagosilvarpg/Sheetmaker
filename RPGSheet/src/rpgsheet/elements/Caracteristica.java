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
abstract public class Caracteristica implements Serializable,Comparable<Caracteristica>{ 
 
    protected  String label,descricao;
    public Caracteristica(){
        this("caracteristica","descricao");
    }
    public Caracteristica(final Caracteristica i){
        this(i.label,i.descricao);
    }
    public Caracteristica(String label,String descricao){
        this.label=label==null?"caracteristica":label;
        this.descricao=(descricao==null)? "Atributo sem descricao" : descricao; 
    } 
    public String getLabel(){
         return label;
     }
     public void setLabel(String label){
         this.label=(label==null)?"caracteristica":label;
     }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao=(descricao==null)?"caracteristica":descricao;
    }
    @Override
    public int compareTo(Caracteristica o) {
        return -1*(label.compareTo(o.label));
    }
    public boolean equals(final Atributo o)
    {
        if (label.equals(o.label))
            return true;
        return false;
    }
}
