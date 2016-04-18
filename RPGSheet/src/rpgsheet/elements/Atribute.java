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
public class Atribute extends Caracteristica{
    static int increaseCost=2;
    
    public Atribute(String label,int valor,int maximo){
        super(label,valor,maximo);
    }
    public Atribute(){
        super("atributo",0,5);
    }
    public Atribute(Atribute i){
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
        return (label+" "+valor+"/"+maximo);        
    }

    
}
