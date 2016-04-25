/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements;

/**
 *
 * @author Tiago
 */
public class Habilidade extends Caracteristica{
    protected  static int increaseCost=1;
    
    public Habilidade(String label,int valor,int maximo,String descricao){
        super(label,valor,maximo);
        this.descricao=descricao;
    }
    public Habilidade(){
        super("Habilidade",0,5);
    }
    public Habilidade(Habilidade i){
        super(i);        
    }
    
    public void rename(String input){
        label=input;
    }
    @Override
    public String toString(){
        return (label+"\n "+valor+"/"+maximo);        
    }
    static void setCost(int i){
        increaseCost=i;
    }
    static int getCost(){
        return increaseCost;
    }

    @Override
    public boolean upgrade(Xp experiencia) {
         if (valor+1>=0 && valor+1<=maximo)
        {
            if (experiencia.getPontos()>=Habilidade.getCost())
            {
                valor+=1;
                return true;
            }
            else System.out.println("sem pontos suficientes");                
        }
        else System.out.println("valor fora dos limites");
        return false;
    }
    
}
