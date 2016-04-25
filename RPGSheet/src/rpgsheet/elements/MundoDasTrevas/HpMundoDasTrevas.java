/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements.MundoDasTrevas;

import javax.swing.JOptionPane;
import rpgsheet.elements.Hp;
import rpgsheet.elements.modificadorDeSaude;

/**
 *
 * @author Tiago
 */
public class HpMundoDasTrevas extends Hp {
    int agravado;

    public HpMundoDasTrevas() {
        super("Vitalidade",0,7);
    }
    public HpMundoDasTrevas(String nome,int i0,int i1) {
        super(nome,i0,i1);
    }
    public HpMundoDasTrevas(HpMundoDasTrevas h) {
        super(h);
    }
    @Override
    public String toString(){
        return label+" "+valor+"("+agravado+")"+"/"+maximo+"("+modificadorDeSaude.getModificador(valor)+")";
    }
    @Override
    public void gastar(int i) {
        valor-=i;
        if (valor<0)
            JOptionPane.showMessageDialog(null,"life under 0 check the rules for death");
    }
    
}
