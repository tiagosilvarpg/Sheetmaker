/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements;

import Exceptions.MaximumReached;
import Exceptions.NoPoints;
import rpgsheet.elements.interfaces.Escalavel;
import rpgsheet.elements.interfaces.Melhoravel;

/**
 *
 * @author Tiago
 */
public class Atributo extends Caracteristica implements Escalavel,Melhoravel{    
    private final static int VALOR_MAXIMO_PADRAO=5;
    protected  int valor=0,maximo=5;
    protected int custo;
    public Atributo(String label,int valor,int maximo,String descricao,int custo){
        super(label,descricao);
        this.valor=valor>0?valor:0;
        this.maximo=maximo>0?maximo:5;      
        this.custo=custo>0?custo:1;
    }
    public Atributo(){
        super("Atributo","Descricao do atributo");
        valor=0;
        maximo=VALOR_MAXIMO_PADRAO;
        custo=1;
    }
    public Atributo(final Atributo i){
        super(i);
        valor=i.valor;
        maximo=i.maximo;
        custo=i.custo;
    }
    
    public void rename(String input){
        label=input;
    }
    @Override
    public boolean equals(final Atributo o)
    {
        if (valor==o.valor)
            if (maximo==o.maximo)
                if (label.equals(o.label))
                    return true;
        return false;
    }    
    @Override
    public int compareTo(final Caracteristica o) {
        if (o instanceof Atributo){
             if (valor<((Atributo)o).valor) return -1;
             if (valor==((Atributo)o).valor) return -1*(label.compareTo(o.label));             
        }
        return 1;
       
    }
    @Override
    public String toString(){
        return (valor+"/"+maximo);        
    }    
    @Override
    public void upgrade(final Xp experiencia) throws MaximumReached,NoPoints{
        if (valor+1>=0 && valor+1<=maximo)
        {
            if (experiencia.getPontos()>=1)
            {
                valor+=1;
                experiencia.pontos-=custo;                
            }
            else throw new NoPoints();
        }
        else throw new MaximumReached();
    }
    public int getCost(){
        return custo;
    }
    @Override
     public void setValor(int i){
         if (0<i && i<maximo) valor=i;
     }
    @Override
     public int getValor(){
         return valor;
     }
    @Override
     public void setMaximo(int i){
         if (i> valor) maximo=i;
     }
    @Override
     public int getMaximo(){
         return maximo;
     }
   
}
