/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rpgsheet.elements.MundoDasTrevas.AtributoMundoDasTrevas;

/**
 *
 * @author Tiago
 */
public class Pagina implements Serializable{
    protected String label;
    List<Caracteristica> caracteristica;
    
    public Pagina(String label){
        this.label=label==null?"pagina":label;
        caracteristica=new ArrayList();
    }
     public Pagina(){
        this("pagina qualquer");
    }
   
    public Pagina(final Pagina p){
        this(p.label);
         for (Caracteristica c:p.caracteristica)
        {
            if (c instanceof AtributoMundoDasTrevas)
                caracteristica.add(new AtributoMundoDasTrevas((AtributoMundoDasTrevas) c));
            else if (c instanceof Atributo)
                caracteristica.add(new Atributo((Atributo) c)); 
        }
    }
    public void add(final Caracteristica c){        
        caracteristica.add(c);
    }
    public void remove(final Caracteristica c){
        caracteristica.remove(c);
    }
     public void remove(int i){
        caracteristica.remove(i);
    }
    public String getLabel(){
         return label;
     }
    public void setLabel(String nome){
        this.label=label==null?label:nome;
    }
    public Caracteristica getElement(int index){
         return caracteristica.get(index);
     }
    public int getSize(){
        return caracteristica.size();
    }
    public void sortPage(){
        Collections.sort(caracteristica);
        Collections.reverse(caracteristica);        
    }
    @Override
     public String toString(){
         String temp=label;
         for(Caracteristica c:caracteristica)
            temp+="\n"+c;
         return temp;
     }
     public Caracteristica findCaracteristica(String label) {
        for (Caracteristica c:caracteristica)
            if (c.getLabel().equals(label))
                    return c;
        return null;
    }
}
