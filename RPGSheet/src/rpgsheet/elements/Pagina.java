/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tiago
 */
public class Pagina implements Serializable{
    protected String label;
    List<Caracteristica> caracteristica;
    
    public Pagina(String label){
        this.label=label;
        caracteristica=new ArrayList();
    }
     public Pagina(){
        this("pagina qualquer");
    }
   
    public Pagina(Pagina p){
        this(p.label);
         for (Caracteristica c:p.caracteristica)
        {
            if (c instanceof Atributo)
                caracteristica.add(new Atributo((Atributo) c));
            if (c instanceof Habilidade)
                caracteristica.add(new Habilidade((Habilidade) c));
            if (c instanceof Vantagem)
                caracteristica.add(new Vantagem((Vantagem) c));            
        }
    }
    public void add(Caracteristica c){        
        caracteristica.add(c);
    }
    public void remove(Caracteristica c){
        caracteristica.remove(c);
    }
     public void remove(int i){
        caracteristica.remove(i);
    }
    public String getLabel(){
         return label;
     }
    public void setLabel(String nome){
        this.label=nome;
    }
    public Caracteristica getElement(int index){
         return caracteristica.get(index);
     }
    public int getSize(){
        return caracteristica.size();
    }
    @Override
     public String toString(){
         String temp=label;
         for(Caracteristica c:caracteristica)
            temp+="\n"+c;
         return temp;
     }
}
