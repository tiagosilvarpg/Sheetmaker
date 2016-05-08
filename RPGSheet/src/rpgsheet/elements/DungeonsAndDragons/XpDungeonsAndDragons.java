/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements.DungeonsAndDragons;

import rpgsheet.elements.Xp;

/**
 *
 * @author Tiago
 */
public class XpDungeonsAndDragons extends Xp{
    int level;
    
    public XpDungeonsAndDragons(){
        super();
        proximoNivel=1;//cada xp vale 1 ponto;
        level=1;
    }
    public XpDungeonsAndDragons(final XpDungeonsAndDragons xp){
        super(xp);
        level=1;
    }
    public XpDungeonsAndDragons(int total,int proximoNivel,int pontos){
        super(total,1,pontos);
        level=1;
    }
    public int getLevel(){
        return level;
    }
    @Override
    public void increase(int xp) {
        total =(total+xp>0) 
            ? total+=xp
            : 0;
        while (total>proximoNivel)
        {
            level+=1;
            proximoNivel=(level-1)*1000+1000;
            
        }
    }
    @Override
    public void setProximoNivel(int i) {
        proximoNivel=(i>total)? i:total+1;
    }
    @Override
    public String toString(){
        return "experiencia "+total+"/"+proximoNivel+"("+pontos+" pontos)LVL "+level;
    }
    
    
}
