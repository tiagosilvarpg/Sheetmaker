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
    protected int agravado;
    protected final static int VALOR_MAXIMO_PADRAO=7;
    public HpMundoDasTrevas() {
        super("Vitalidade",VALOR_MAXIMO_PADRAO,VALOR_MAXIMO_PADRAO);
    }
    public HpMundoDasTrevas(String nome,int i0,int i1) {
        super(nome,i0,i1);
    }
    public HpMundoDasTrevas(final HpMundoDasTrevas h) {
        super(h);
    }
    @Override
    public String toString(){
        return label+" "+valor+"("+agravado+")"+"/"+maximo+"("+modificadorDeSaude.getModificador(valor)+")";
    }
    @Override
    public void gastar(int i) {
        if (i>0){
            if (JOptionPane.showConfirmDialog(null,"agravated ?")==JOptionPane.OK_OPTION)
                agravado+=i;
            valor-=i;
            if (valor<0)
                JOptionPane.showMessageDialog(null,"life under 0,you cant act until you heal");
        }
        else valor-=i;
    }
    
}
