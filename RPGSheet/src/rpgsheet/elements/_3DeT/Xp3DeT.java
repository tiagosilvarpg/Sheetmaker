/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements._3DeT;

import rpgsheet.elements.Xp;

/**
 *
 * @author Tiago
 */
public class Xp3DeT extends Xp {

    public Xp3DeT(Xp3DeT x) {
        super(x);
    }
    public Xp3DeT() {
        super(0,10,0);
    }
    public Xp3DeT(int i, int i0, int i1) {
        super(i,i0,i1);
    }
    @Override
    public void increase(int xp) {
        // nao pode ser negativo
        total =(total+xp>0) 
            ? total+=xp
            : 0;
        // a cada 10 de experiencia ganha 1 ponto
        if (total>10)
            pontos+=total/10;
        total=total % 10;
    }
    
}
