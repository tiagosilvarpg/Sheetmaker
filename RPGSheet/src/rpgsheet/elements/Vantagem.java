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
public class Vantagem extends Caracteristica{
    protected  static int increaseCost=2;
    protected  String descricao;
    
    public Vantagem(String label,int valor,int maximo,String descricao){
        super(label,valor,maximo);
        this.descricao=descricao;
    }
    public Vantagem(){
        super("Vantagem",0,5);
    }
    public Vantagem(Vantagem i){
        super(i);        
    }
    
    public void rename(String input){
        label=input;
    }
    @Override
    public String toString(){
        return (label+"\n "+valor+"/"+maximo);        
    }
    public void increase(int incremento,int points){
        if (valor+incremento>=0 && valor+incremento<=maximo)
        {
            if (points>=Vantagem.getCost())
                valor+=incremento;
            else System.out.println("sem pontos suficientes");                
        }
        else System.out.println("valor fora dos limites");
    }
    static void setCost(int i){
        increaseCost=i;
    }
    static int getCost(){
        return increaseCost;
    }

    
}
