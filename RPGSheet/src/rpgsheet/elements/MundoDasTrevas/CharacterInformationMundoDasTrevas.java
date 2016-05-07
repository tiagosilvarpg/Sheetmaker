/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements.MundoDasTrevas;

import rpgsheet.elements.CharacterInformation;

/**
 *
 * @author Tiago
 */
public class CharacterInformationMundoDasTrevas extends CharacterInformation {
    
    public CharacterInformationMundoDasTrevas(String personagem, String classe, String descricao) {
        super(personagem,classe,descricao);
        
    }
    public CharacterInformationMundoDasTrevas(CharacterInformationMundoDasTrevas informacao) {
        super(informacao);
        
    }
    public CharacterInformationMundoDasTrevas() {
        super("Desconhecido","Caitif","Sigiloso");
        
    }
    @Override
    public String toString(){
        return "Nome: "+nome+
               "\nClã: "+classe+
               "\nDescricao:\n"+descricao;
    }
}
