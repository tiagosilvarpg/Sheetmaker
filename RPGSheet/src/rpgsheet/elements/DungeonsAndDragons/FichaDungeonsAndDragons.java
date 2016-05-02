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
    
     public FichaDungeonsAndDragons(String criador,String sistema,final Data data){
         this();
         this.creator=criador;
         this.system=sistema;
         this.data=data;    
    }
     public FichaDungeonsAndDragons(){
        super();
        addPage("Atributos");//0
         for (String nome:new String[]{ "Forca","Destreza","Constituicao","Inteligencia","Sabedoria","Carisma"})
         {
             addCaracteristica(new Atributo(nome,1,20,"",1),0);
         }
         addPage("Atributos Secundarios");//1
         for (String nome:new String[]{"Iniciativa","Deslocamento","Fortitude","Reflexos","Vontade","Classe de Armadura"})
         {
             addCaracteristica(new Atributo(nome,0,20,"",1),1);
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
