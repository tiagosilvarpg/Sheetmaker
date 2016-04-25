package rpgsheet.elements._3DeT;

import rpgsheet.elements.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago
 */
public class Ficha3DeT extends Ficha{
    
    public Ficha3DeT(){
        super();
        addPage("Caracteristicas");//0
         for (String nome:new String[]{ "Forca","Habilidade","Armadura","Resistencia","Poder de Fogo"})
         {
             addCaracteristica(new Atributo(nome,0,20,""),0);
         }
         addPage("Pericias");//1
         for (String nome:new String[]{ "Animais","Arte","Ciencia","Crime","Esportes","Idiomas","Investigacao","manipulacao","Maquinas","Medicina","Sobrevivencia"})
         {
             addCaracteristica(new Habilidade(nome,1,5,""),1);
         }
         addPage("Bonus racial");//2
         addPage("Habilidades de classe");//3
         addPage("Pericias");//4
         for (String nome:new String[]{ "Deslocamento","Fortitude","Reflexos","Vontade","Classe de Armadura","Iniciativa"})
         {
             addCaracteristica(new Atributo(nome,1,5,""),4);
         }         
         this.life=new Hp3DeT("Hp",10,10);
    }
     public Ficha3DeT(Ficha3DeT ficha){
         super(ficha);
    }
     public Ficha3DeT(String criador,String sistema,Data data){
         this();
         this.creator=criador;
         this.system=sistema;
         this.data=data;
         
}
    
}
