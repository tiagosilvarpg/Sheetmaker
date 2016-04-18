/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import rpgsheet.frames.Data;


/**
 *
 * @author Tiago
 */
public class Ficha implements Serializable{
    String creator,system;
    Data data;
    String nome,classe,descricao;
    int nivel;
    List<Caracteristica> caracteristicas;
    List<Item> inventory;
    Hp life;
    Resource resource;
    Xp experiencia;

    public Ficha(){
     this.creator="tiago mendes";
     this.system="unknown";
     caracteristicas=new ArrayList();
     data=new Data(1,1,2016);
    }
    
    public Ficha(String creator, String system, Data data) {
     this();
     this.creator=creator;
     this.system=system;
     this.data=data;        
    }
    public Ficha(Ficha r){
     this();
     this.creator=r.creator;
     this.system=r.system;
     this.data=r.data;
     for(int i=0;i<r.inventory.size();i++)
        this.inventory.add(new Item(r.inventory.get(i)));
     for(int i=0;i<r.caracteristicas.size();i++)
     {
         Caracteristica temp =r.caracteristicas.get(i);
         if (temp instanceof Atribute)
            this.caracteristicas.add(new Atribute((Atribute)temp));
         else
             if (temp instanceof Habilidade)
            this.caracteristicas.add(new Habilidade((Habilidade)temp));
     }
        
    }


    public void addCaracteristica(Caracteristica c) {
     caracteristicas.add(c);
    }

    public void removeCaracteristica(Caracteristica c) {
        caracteristicas.remove(c);        
    }
    @Override
    public String toString(){
        String string ="";
        string  +="["+creator+","+system+"]\n"
                +life+"\n"
                +resource+"\n"
                +experiencia+"\n"               
                ;
        for (int i=0;i<caracteristicas.size();i++){
            string+=caracteristicas.get(i)+"\n";
        }
        for (int i=0;i<inventory.size();i++){
            string+=inventory.get(i)+"\n";
        }
        return string;
    }
    
}
