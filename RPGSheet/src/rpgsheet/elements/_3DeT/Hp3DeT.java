/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements._3DeT;

import rpgsheet.elements.Hp;

/**
 *
 * @author Tiago
 */
public class Hp3DeT extends Hp {

    public Hp3DeT() {
        super("Pontos de Vida",10,10);
    }
    public Hp3DeT(String hp, int i, int i0) {
        super(hp,i,i0);
    }
    public Hp3DeT(Hp3DeT h) {
        super(h);
    }
    
}
