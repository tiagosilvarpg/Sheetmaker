/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements.MundoDasTrevas;

import javax.swing.JOptionPane;
import rpgsheet.elements.Xp;

/**
 *
 * @author Tiago
 */
public class XpMundoDasTrevas extends Xp{
    
    public XpMundoDasTrevas(){
        super();
        proximoNivel=1;//cada xp vale 1 ponto;        
    }
    public XpMundoDasTrevas(XpMundoDasTrevas xp){
        super(xp);     
    }
    public XpMundoDasTrevas(int total,int proximoNivel,int pontos){
        super(total,1,pontos);     
    }
    @Override
    public void increase(int xp) {        
        pontos=pontos+total+xp;//qualquer xp vale um ponto logo tanto o que ja tem quanto o que vai adicionar viram pontos
        total=0;
    }
            
    
}
