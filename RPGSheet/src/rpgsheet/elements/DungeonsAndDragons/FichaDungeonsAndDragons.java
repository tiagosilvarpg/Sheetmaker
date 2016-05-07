package rpgsheet.elements.DungeonsAndDragons;

import rpgsheet.elements.Atributo;
import rpgsheet.elements.Caracteristica;
import rpgsheet.elements.Data;
import rpgsheet.elements.Ficha;
import rpgsheet.elements.Hp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago
 */
public class FichaDungeonsAndDragons extends Ficha{
     private final static int VALOR_MAXIMO_PADRAO=20;
     private final static int CUSTO_PADRAO=1;
     public FichaDungeonsAndDragons(String criador,String sistema,final Data data){
         this();
         this.creator=criador;
         this.system=sistema;
         this.data=data;    
    }
     public FichaDungeonsAndDragons(){
        super();
        int valorInicial;
        addPage("Atributos");//0
         for (String nome:new String[]{ "Forca","Destreza","Constituicao","Inteligencia","Sabedoria","Carisma"})
         {
             valorInicial=1;
             addCaracteristica(new Atributo(nome,valorInicial,VALOR_MAXIMO_PADRAO,"",CUSTO_PADRAO),0);
         }
         addPage("Atributos Secundarios");//1
         for (String nome:new String[]{"Iniciativa","Deslocamento","Fortitude","Reflexos","Vontade","Classe de Armadura"})
         {
             valorInicial=0;
             addCaracteristica(new Atributo(nome,valorInicial,VALOR_MAXIMO_PADRAO,"",CUSTO_PADRAO),1);
         }
         addPage("Bonus racial");//2
         addPage("Habilidades de classe");//3
         addPage("Pericias");//4           
         this.life=new HpDungeonsAndDragons();
    }
     public FichaDungeonsAndDragons(final FichaDungeonsAndDragons ficha){
         super(ficha);
    }
    
}
