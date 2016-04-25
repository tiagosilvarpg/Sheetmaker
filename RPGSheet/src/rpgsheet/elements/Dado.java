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
    private int quantidade,faces;
    public Dado(){
        faces=6;
        quantidade=1;
    }
    public int getFaces() {
        return  faces;
    }
    public void setFaces(int i) {
        faces=(i>=2)?i:2;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int i){
        quantidade=(i>=1)?i:1;
    }
    public String getResultado() {           
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
