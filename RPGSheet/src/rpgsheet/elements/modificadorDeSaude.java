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
public enum modificadorDeSaude{
    SAUDAVEL(0),ESCORIADO(0),MACHUCADO(-1),FERIDO(-1),FERIDO_GRAVEMENTE(-2),ESPANCADO(-2),ALEIJADO(-2),INCAPACITADO(-5);
    private final int modificador;
    
    modificadorDeSaude(int valor) {
		modificador=valor;
    }
    public int getModificador(){
        return modificador;
    }
    
}
