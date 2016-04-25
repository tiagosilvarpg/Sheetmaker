/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago
 */
public abstract class Hp extends Recurso {
    //0,0,1,1,2,2,5
    public Hp(){       
    }
    public Hp(String label,int valor,int maximo){
        super(label,valor,maximo);        
    }
    public Hp(Hp outro){
        super(outro.label,outro.valor,outro.maximo);        
    }
    @Override
    public String toString(){
        return label+" "+valor+"/"+maximo;
    }
    @Override
    public void gastar(int i) {
        valor-=i;
        if (valor<0)
            JOptionPane.showMessageDialog(null,"life under 0 check the rules for death");
    }

    
}

