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
public class Hp extends Recurso {
    //0,0,1,1,2,2,5
    protected modificadorDeSaude modificador;
    public Hp(){
        modificador=modificadorDeSaude.SAUDAVEL;
    }
    public Hp(String label,int valor,int maximo){
        super(label,valor,maximo);
        modificador=modificadorDeSaude.SAUDAVEL;
    }
    public Hp(Hp outro){
        super(outro.label,outro.valor,outro.maximo);
        modificador=modificadorDeSaude.SAUDAVEL;
    }
    @Override
    public String toString(){
        if (valor==maximo-1)
            modificador=modificadorDeSaude.ESCORIADO;
        return label+" "+valor+"/"+maximo+"("+modificador.getModificador()+")";
    }

    
}

