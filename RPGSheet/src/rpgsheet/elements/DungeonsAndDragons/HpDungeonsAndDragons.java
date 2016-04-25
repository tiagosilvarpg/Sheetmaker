/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements.DungeonsAndDragons;

import javax.swing.JOptionPane;
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
    @Override
    public void gastar(int i) {
        valor-=i;
        if (valor<(-maximo))
            JOptionPane.showMessageDialog(null,"instant death");
        else if (valor<0)
            JOptionPane.showMessageDialog(null,"inconcient roll a dead dice");
    }
    
}
