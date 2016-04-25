package rpgsheet.elements.MundoDasTrevas;

import rpgsheet.elements.Atributo;
import rpgsheet.elements.Data;
import rpgsheet.elements.Ficha;
import rpgsheet.elements.Habilidade;
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
public class FichaMundoDasTrevas extends Ficha{
    
    public FichaMundoDasTrevas(){
        super();
        addPage("Atributos");
         for (String nome:new String[]{ "Forca","Destreza",  "Vigor","Carisma","Manipulacao","Aparencia",  
                                        "Perceção", "Raciocinio",  "Inteligencia"})
         {
             addCaracteristica(new Atributo(nome,1,5,""),0);
         }        
         addPage("Talento");
         for (String nome:new String[]{ "Prontidão","Esportes",  "Briga","Esquiva","Empatia","Expressão",  
                                        "Intimidação", "Liderança",  "Manha","Lábia"})
         {
             addCaracteristica(new Habilidade(nome,0,5,"Talento"),1);
         }
         addPage("Pericia");
         for (String nome:new String[] { "Empatia c/Animais","Ofícios","Condução","Etiqueta","Armas de Fogo",  
                                         "Armas Brancas",  "Performance", "Segurança",  "Furtividade",  "Sobrevivência"})
         {
             addCaracteristica(new Habilidade(nome,0,5,"Pericia"),2);
         }
         addPage("Conhecimento");
         for (String nome:new String[]{ "Acadêmicos",  "Computador",  "Finanças",  "Investigação",  "Direito",  
                                        "Lingüística",  "Medicina",  "Ocultismo", "Política",  "Ciência"})
         {
             addCaracteristica(new Habilidade(nome,0,5,"Conhecimento"),3);
         }
         addPage("Vantagens");
         this.life=new HpMundoDasTrevas();
         this.experiencia=new XpMundoDasTrevas();
    }
     public FichaMundoDasTrevas(FichaMundoDasTrevas ficha){
         super(ficha);
    }
     public FichaMundoDasTrevas(String criador,String sistema,Data data){
         this();
         this.creator=criador;
         this.system=sistema;
         this.data=data;
         
}
    
}
