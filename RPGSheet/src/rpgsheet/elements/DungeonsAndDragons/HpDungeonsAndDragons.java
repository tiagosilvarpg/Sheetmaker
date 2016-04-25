/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements.DungeonsAndDragons;

import rpgsheet.elements.Hp;

/**
 *
 * @author Tiago
 */
public class HpDungeonsAndDragons extends Hp {

    public HpDungeonsAndDragons(String nome, int i, int i0) {
        super(nome,i,i0);
    }
    public HpDungeonsAndDragons(){
        super("Vida",10,10);
    }
    public HpDungeonsAndDragons(HpDungeonsAndDragons h){
        super(h);
    }
    
}
