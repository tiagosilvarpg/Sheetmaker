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
             addCaracteristica(new Atributo(nome,0,20,"",1),0);
         }
         addPage("Pericias");//1
         for (String nome:new String[]{ "Animais","Arte","Ciencia","Crime","Esportes","Idiomas","Investigacao","manipulacao","Maquinas","Medicina","Sobrevivencia"})
         {
             addCaracteristica(new Atributo(nome,1,5,"",1),1);
         }         
         this.life=new Hp3DeT("Hp",10,10);
    }
     public Ficha3DeT(final Ficha3DeT ficha){
         super(ficha);
    }
     public Ficha3DeT(String criador,String sistema,Data data){
         this();
         this.creator=criador;
         this.system=sistema;
         this.data=data;
         
}
    
}
