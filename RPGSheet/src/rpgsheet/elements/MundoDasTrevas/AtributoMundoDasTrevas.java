/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements.MundoDasTrevas;

import Exceptions.MaximumReached;
import Exceptions.NoPoints;
import rpgsheet.elements.Atributo;
import rpgsheet.elements.Xp;

/**
 *
 * @author Tiago
 */
public class AtributoMundoDasTrevas extends Atributo{
    protected final static int VALOR_MAXIMO_PADRAO=5;
    public AtributoMundoDasTrevas(String label,int valor,int maximo,String descricao,int custo){
        super(label,valor,maximo,descricao,custo);
    }
    public AtributoMundoDasTrevas(){
        super("Atributo",1,VALOR_MAXIMO_PADRAO,"Atributo sem descricao",1);        
    }
    public AtributoMundoDasTrevas(final AtributoMundoDasTrevas i){
        super(i);
    }
    @Override
    public void upgrade(final Xp experiencia)throws MaximumReached,NoPoints{
        if (valor<maximo)
        {
            if (experiencia.getPontos()>=getCost())
            {
                valor+=1;
                experiencia.increase(-getCost());
            }
            else throw new NoPoints();          
        }
        else throw new MaximumReached();
    }
}
