/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements._3DeT;

import rpgsheet.elements.CharacterInformation;

/**
 *
 * @author Tiago
 */
public class CharacterInformation3DeT extends CharacterInformation {

    public CharacterInformation3DeT(String personagem, String classe, String descricao) {
        super(personagem,classe,descricao);
    }

    public CharacterInformation3DeT(CharacterInformation informacao) {
        super(informacao);
    }
    @Override
    public String toString(){
        return "Nome: "+nome+"\nEstereotipo: "+classe+"\nDescricao:\n"+descricao;
    }
}
