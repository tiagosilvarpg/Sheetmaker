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
public enum modificadorDeSaude {
    SAUDAVEL(7,0,"saudavel"),ESCORIADO(6,0,"escoriado"),MACHUCADO(5,-1,"machucado"),
    FERIDO(4,-1,"ferido"),FERIDO_GRAVEMENTE(3,-2,"ferido gravemente"),ESPANCADO(2,-2,"espancado"),
    ALEIJADO(1,-2,"aleijado"),INCAPACITADO(0,-5,"incapacitado");

    private final int modificador,ordem;
    private final String nome;
    
    modificadorDeSaude(int ordem1,int valor,String nome1) {
		modificador=valor;
                ordem=ordem1;
                nome=nome1;
    }
    public static modificadorDeSaude getModificador(int i){
        for (modificadorDeSaude m: modificadorDeSaude.values())
        {
            if (m.ordem==(i))
                {
                    return m;
                }
        }
        return null;
    }
    @Override
    public String toString(){
    return (nome+" "+modificador);
        
    }
}
