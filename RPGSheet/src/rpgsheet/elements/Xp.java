/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements;

import rpgsheet.elements.interfaces.Gerenciavel;
import java.io.Serializable;

/**
 *
 * @author Tiago
 */
public abstract class Xp implements Gerenciavel,Serializable{
    protected int total,proximoNivel,pontos;
    
    public Xp (int total,int proximoNivel,int pontos){
        super();
        this.total=total>0 ? total : 0 ;
        this.proximoNivel=proximoNivel >0 ? total : 0;
        this.pontos=pontos>0 ? total : 0;
    }
    public Xp(){
        this(0,10,0);
    }
    public Xp(Xp x){
        this.total=x.total;
        this.proximoNivel=x.proximoNivel;
        this.pontos=x.pontos;
    }
    @Override
    public String toString(){
        return "experiencia "+total+"/"+proximoNivel+"("+pontos+" pontos)";
    }
    @Override
    abstract public void increase(int xp);

    public int getPontos() {
        return this.pontos;
    }

    public void setTotal(int i) {
        total=(i>0)
            ? i
            :0;
    }
    public void setProximoNivel(int i) {
        proximoNivel=(i>total)
            ? i
            :total+1;
    }
    public int getTotal() {
        return total;
    }
    public int getProximoNivel() {
        return proximoNivel;
    }

    public void spendPoints(int i) {
        if (pontos>=i) pontos-=i;
    }
}
