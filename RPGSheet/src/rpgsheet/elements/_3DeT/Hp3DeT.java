/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements._3DeT;

import javax.swing.JOptionPane;
import rpgsheet.elements.Hp;

/**
 *
 * @author Tiago
 */
public class Hp3DeT extends Hp {
    protected static int VALOR_MAXIMO_PADRAO=10;
    public Hp3DeT() {
        super("Pontos de Vida",VALOR_MAXIMO_PADRAO,VALOR_MAXIMO_PADRAO);
    }
    public Hp3DeT(String hp, int i, int i0) {
        super(hp,i,i0);
    }
    public Hp3DeT(final Hp3DeT h) {
        super(h);
    }
    @Override
    public void gastar(int i) {
        valor-=i;
        if (valor<0)
            JOptionPane.showMessageDialog(null,"life under 0, roll de death dice");
    }
    
}
