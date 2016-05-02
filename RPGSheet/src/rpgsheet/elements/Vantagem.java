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
public class Vantagem extends Caracteristica {

    public Vantagem(String label,String descricao){
        super(label,descricao);
    }
     public Vantagem(){
        super("Vantagem","Descricao da Vantagem");
    }
      public Vantagem(Vantagem v){
        super(v);
    } 
    @Override
    public int compareTo(Caracteristica o) {
        return -1*(label.compareTo(o.label));
    }
    @Override
    public String toString(){
        return (label);        
    }    
}
