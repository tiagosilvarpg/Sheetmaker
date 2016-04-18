/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements;

import rpgsheet.frames.AtributeClick;

/**
 *
 * @author Tiago
 */
public class Habilidade extends Caracteristica{
    static int increaseCost=1;
    String descricao;
    
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public String getDescricao(){
        return descricao;
    } 
    public Habilidade(String label,int valor,int maximo){
        super(label,valor,maximo);
    }
    public Habilidade(){
        super("atributo",0,5);
    }
    public Habilidade(Habilidade i){
        super(i);        
    }
    
    public void rename(String input){
        label=input;
    }
    @Override
    public void click(){
        AtributeClick frame = new AtributeClick();
        frame.setVisible(true);  
    }
    @Override
    public String toString(){
        return (label+" "+valor+"/"+maximo+" "+descricao);        
    }

    
}
