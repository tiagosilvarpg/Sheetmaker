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
public abstract class CharacterInformation implements Serializable{
    protected String nome,classe,descricao;
    
    public CharacterInformation(){
        this("sem nome","sem classe","sem descricao");
        
    }
    public CharacterInformation(final CharacterInformation c){
        this(c.nome,c.classe,c.descricao);
    }
    public CharacterInformation(String nome,String classe,String descricao){
        super();
        this.nome=(nome==null)?"nome":nome;
        this.classe=classe==null?"classe":classe;
        this.descricao=descricao==null?"sem descricao":descricao;
    }
    public String getNome(){
        return nome;
    }
    public String getClasse  (){
        return classe;
    }
     public String getDescricao(){
        return descricao;
    }
    @Override
    public String toString(){
        return "Nome: "+nome+"\nClasse: "+classe+"\nDescricao:\n"+descricao;
    }
}   
