/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements.MundoDasTrevas;

import rpgsheet.elements.Hp;
import rpgsheet.elements.modificadorDeSaude;

/**
 *
 * @author Tiago
 */
public class HpMundoDasTrevas extends Hp {
    private modificadorDeSaude modificador;
    int agravado;

    public HpMundoDasTrevas() {
        super("Vitalidade",7,7);
        modificador=modificadorDeSaude.SAUDAVEL;
    }
    public HpMundoDasTrevas(String nome,int i0,int i1) {
        super(nome,i0,i1);
        modificador=modificadorDeSaude.SAUDAVEL;
    }
    public HpMundoDasTrevas(HpMundoDasTrevas h) {
        super(h);
        modificador=modificadorDeSaude.SAUDAVEL;
    }
    @Override
    public String toString(){
        if (valor==maximo-1)
            modificador=modificadorDeSaude.ESCORIADO;
        return label+" "+valor+"("+agravado+")"+"/"+maximo+"("+modificador.getModificador()+")";
    }
    
}
