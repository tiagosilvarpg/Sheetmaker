package rpgsheet.elements.MundoDasTrevas;
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
public class FichaMundoDasTrevas extends Ficha{
    
    public FichaMundoDasTrevas(){
        super();
        informacao=new CharacterInformationMundoDasTrevas();
        life=new HpMundoDasTrevas();
        experiencia=new XpMundoDasTrevas();
        addRecurso(new Recurso("Humanidade", 0, 10));
        addRecurso(new Recurso("Forca de Vontade", 0, 10));
        addRecurso(new Recurso("Pontos de Sangue", 0, 50));
        addPage("Fisicos");
         for (String nome:new String[]{ "Forca","Destreza",  "Vigor"})
         {
             addCaracteristica(new AtributoMundoDasTrevas(nome,1,5,"Fisicos",5),0);
         }
         addPage("Socias");
         for (String nome:new String[]{ "Carisma","Manipulacao","Aparencia"})
         {
             addCaracteristica(new AtributoMundoDasTrevas(nome,1,5,"Sociais",5),1);
         }   
         addPage("Mentais");
         for (String nome:new String[]{ "Perceção", "Raciocinio",  "Inteligencia"})
         {
             addCaracteristica(new AtributoMundoDasTrevas(nome,1,5,"Mentais",5),2);
         }   
         addPage("Talento");
         for (String nome:new String[]{ "Prontidão","Esportes",  "Briga","Esquiva","Empatia","Expressão",  
                                        "Intimidação", "Liderança",  "Manha","Lábia"})
         {
             addCaracteristica(new AtributoMundoDasTrevas(nome,0,5,"Talento",2),3);
         }
         addPage("Pericia");
         for (String nome:new String[] { "Empatia c/Animais","Ofícios","Condução","Etiqueta","Armas de Fogo",  
                                         "Armas Brancas",  "Performance", "Segurança",  "Furtividade",  "Sobrevivência"})
         {
             addCaracteristica(new AtributoMundoDasTrevas(nome,0,5,"Pericia",2),4);
         }
         addPage("Conhecimento");
         for (String nome:new String[]{ "Acadêmicos",  "Computador",  "Finanças",  "Investigação",  "Direito",  
                                        "Lingüística",  "Medicina",  "Ocultismo", "Política",  "Ciência"})
         {
             addCaracteristica(new AtributoMundoDasTrevas(nome,0,5,"Conhecimento",2),5);
         }         
         
         addPage("Disciplinas");
          for (String nome:new String[]{ "Animalismo","Auspícios","Dominação","Fortitude","Ofuscação","Metamorfose","Potência","Presença","Rapidez","Quimerismo","Demencia","Viscicitude","Taumaturgia","Tenebrosidade","Quietus","Serpentis"})
         {
             addCaracteristica(new AtributoMundoDasTrevas(nome,0,5,"Virtudes",7),6);
         }
         addPage("Virtudes");
          for (String nome:new String[]{ "Conciencia",  "Auto-Controle",  "Coragem"})
         {
             addCaracteristica(new AtributoMundoDasTrevas(nome,1,5,"Virtudes",2),7);
         }
         addPage("Antecedentes");
         addCaracteristica(new AtributoMundoDasTrevas("Aliados",0,5,"Companheiros humanos, normalmente amigos ou membros da família mortal do personagem.",1),8);
         addCaracteristica(new AtributoMundoDasTrevas("Contatos",0,5,"O número de fontes de informação que o personagem tem.",1),8);
         addCaracteristica(new AtributoMundoDasTrevas("Fama",0,5,"Quão bem conhecido o personagem é entre os mortais.",1),8);
         addCaracteristica(new AtributoMundoDasTrevas("Geração",0,5,"Quão distante o personagem se encontra de Caim.",1),8);
         addCaracteristica(new AtributoMundoDasTrevas("Influência",0,5,"O poder político dentro da sociedade mortal.",1),8);
         addCaracteristica(new AtributoMundoDasTrevas("Lacaios",0,5,"Seguidores, guardas e servos",1),8);
         addCaracteristica(new AtributoMundoDasTrevas("Mentor",0,5,"O conselheiro Membro do personagem,aquele que o guia e o mantém.",1),8);
         addCaracteristica(new AtributoMundoDasTrevas("Rebanho",0,5,"Fontes às quais o personagem possui acesso livre e seguro.",1),8);
         addCaracteristica(new AtributoMundoDasTrevas("Recursos",0,5,"Riquezas, pertences e renda mensal.",1),8);
         addCaracteristica(new AtributoMundoDasTrevas("Status",0,5,"A posição do personagem dentro da sociedade dos mortos-vivos.",1),8);
         addPage("Qualidades");
         addPage("Defeitos");
         
         
                  
         
    }
     public FichaMundoDasTrevas(final FichaMundoDasTrevas ficha){
         super(ficha);
    }
     public FichaMundoDasTrevas(String criador,String sistema,Data data){
         this();
         this.creator=criador;
         this.system=sistema;
         this.data=data;
         
    }
     public void reset(){
         
        
     }
    
}
