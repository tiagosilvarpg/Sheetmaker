/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements.DungeonsAndDragons;
import Exceptions.MaximumReached;
import Exceptions.NoPoints;
import rpgsheet.elements.Atributo;
import rpgsheet.elements.Xp;

/**
 *
 * @author Tiago
 */
public class AtributoDungeonsAndDragons extends Atributo{
    private final static int VALOR_MAXIMO_PADRAO=20;
    public AtributoDungeonsAndDragons(String label,int valor,int maximo,String descricao,int custo){
        super(label,valor,maximo,descricao,custo);
    }
    public AtributoDungeonsAndDragons(){
        super("Atributo",1,VALOR_MAXIMO_PADRAO,"Atributo sem descricao",1);
        
    }
    public AtributoDungeonsAndDragons(final AtributoDungeonsAndDragons i){
        super(i);
    }
    @Override
    public void upgrade(final Xp experiencia) throws MaximumReached,NoPoints{
        if (valor+1>=0 && valor+1<=maximo)
        {
            if (experiencia.getPontos()>=getCost())
            {
                experiencia.spendPoints(getCost()); 
                valor+=1;
            }
            else throw new NoPoints();
        }
        else throw new MaximumReached();
    }
    @Override
    public int getCost(){
        return custo;
    }
    
}
