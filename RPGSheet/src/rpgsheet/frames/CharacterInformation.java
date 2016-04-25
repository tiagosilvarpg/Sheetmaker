/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.frames;

import rpgsheet.elements.Elemento;

/**
 *
 * @author Tiago
 */
public class CharacterInformation{
    protected String nome,classe,descricao;
    
    public CharacterInformation(){
        this("sem nome","sem classe","sem descricao");
        
    }
    public CharacterInformation(CharacterInformation c){
        this(c.nome,c.classe,c.descricao);
    }
    public CharacterInformation(String nome,String classe,String descricao){
        super();
        this.nome=nome;
        this.classe=classe;
        this.descricao=descricao;
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
