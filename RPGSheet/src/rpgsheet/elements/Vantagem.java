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
public class Vantagem extends Caracteristica{
    protected  static int increaseCost=2;
    protected  String descricao;
    
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public String getDescricao(){
        return descricao;
    } 
    public Vantagem(String label,int valor,int maximo,String descricao){
        super(label,valor,maximo);
        this.descricao=descricao;
    }
    public Vantagem(){
        super("Vantagem",0,5);
    }
    public Vantagem(Vantagem i){
        super(i);        
    }
    
    public void rename(String input){
        label=input;
    }
    @Override
    public String toString(){
        return (label+" "+valor+"/"+maximo+" "+descricao);        
    }

    
}
