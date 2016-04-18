/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago
 */
public class Xp implements Gerenciavel,Serializable{
    int total,proximoNivel,level,pontos;
    @Override
    public void increase(int xp){
        total+=xp;
        if (total>=proximoNivel) 
        {
           int temp;
           do {
               temp=Integer.parseInt((JOptionPane.showInputDialog("total de xp para o proximo nivel",proximoNivel)).trim());
           }
           while (temp<=proximoNivel);
           proximoNivel=temp;
        }
    
    }
}
