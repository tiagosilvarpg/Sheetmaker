/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements;

import java.util.Random;

/**
 *
 * @author Tiago
 */
 public class Dado {
    static private int quantidade=6,faces=1;
    
    static public String getFaces() {
        return  faces+"";
    }
    static public void setFaces(int i) {
        faces=(i>=2)?i:2;
    }
    static public String getQuantidade() {
        return quantidade+"";
    }
    static public void setQuantidade(int i){
        quantidade=(i>=1)?i:1;
    }
    static public String getResultado() {           
        String result="";
        int temp,total=0;
        int diceNumber=quantidade;
        do
        {
            temp=(1+(new Random()).nextInt(faces));
            total+=temp;
            result+=temp+", ";
            diceNumber-=1;
        }while (diceNumber>0);
        
        return(result+"total="+total);
    }
    @Override
    public String toString(){
        return (quantidade+" D"+faces);        
    }
    
}
