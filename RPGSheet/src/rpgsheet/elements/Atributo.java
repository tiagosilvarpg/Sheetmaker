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
public class Atributo extends Caracteristica{
    protected  static int increaseCost=2;
    protected String descricao;
    
    public Atributo(String label,int valor,int maximo,String descricao){
        super(label,valor,maximo);
        this.descricao=descricao;
    }
    public Atributo(){
        super("atributo",0,5);
        this.descricao="nao fornecida";
    }
    public Atributo(Atributo i){
        super(i);
        this.descricao=i.descricao;
    }
    
    public void rename(String input){
        label=input;
    }
    @Override
    public String toString(){
        return (label+" "+valor+"/"+maximo);        
    }
    static void setCost(int i){
        increaseCost=i;
    }

    
}
