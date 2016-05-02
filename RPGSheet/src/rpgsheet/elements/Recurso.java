/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements;

import java.io.Serializable;
import javax.swing.JOptionPane;
import rpgsheet.elements.interfaces.Escalavel;

/**
 *
 * @author Tiago
 */
public class Recurso implements Serializable,Escalavel{
     protected int valor,maximo;
     protected String label;
 public Recurso(){
     valor=0;
     maximo=0;
     label="recurso";
 }
 public Recurso(String label,int valor,int maximo){
     this.valor=(valor>=0)?valor:0;
     this.maximo=maximo>valor?maximo:valor;
     this.label=label==null?"recurso":label;
 }
 public Recurso(final Recurso r){
     this.valor=r.valor;
     this.maximo=r.maximo;
     this.label=r.label;
 }
     @Override
 public String toString(){
     return label+" "+valor+"/"+maximo;
 }
     @Override
    public void setValor(int i){
        if (i>=0)
            valor=i;
        if(valor>maximo)
            valor=maximo;
    }
     @Override
     public int getValor(){
         return valor;
     }
     @Override
     public void setMaximo(int i){
         if (i>valor) maximo=i;
     }
     @Override
     public int getMaximo(){
         return maximo;
     }
    public void gastar(int i) {
        System.out.println(valor+" "+maximo+" "+i);   
        if (valor>=i)
        {
            valor-=i;
        }
        else
            JOptionPane.showMessageDialog(null,"not enough "+label);
    }
    public String getLabel() {
        return label;
    }
}
