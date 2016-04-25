/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import rpgsheet.elements.DungeonsAndDragons.HpDungeonsAndDragons;
import rpgsheet.elements.DungeonsAndDragons.XpDungeonsAndDragons;
import rpgsheet.elements.MundoDasTrevas.HpMundoDasTrevas;
import rpgsheet.elements.MundoDasTrevas.XpMundoDasTrevas;
import rpgsheet.elements._3DeT.*;
import rpgsheet.frames.CharacterInformation;
;


/**
 *
 * @author Tiago
 */
public abstract class Ficha implements Serializable{
    protected  String creator,system;
    protected  Data data;
    protected  CharacterInformation informacao;    
    protected  Hp life;
    protected  Xp experiencia;
    protected  List<Pagina> paginas;
    protected  List<Recurso> recursos;
    protected  List<Item> inventario;
    /*
    CONSTRUTORES
    */
    public Ficha(){
     super();
     creator="tiago mendes";
     system="unknown";
     data=new Data();     
     informacao=new CharacterInformation("personagem","classe","descricao");     
     life=new Hp3DeT();
     experiencia=new Xp3DeT();
     recursos=new ArrayList();     
     paginas=new ArrayList();     
     inventario=new ArrayList();
    }
    
    public Ficha(String creator, String system, Data data) {
     this();
     this.creator=creator;
     this.system=system;
     this.data=data;        
    }
    public Ficha(Ficha r){
     this();
     //copia as informacoes do criador
     this.creator=r.creator;
     this.system=r.system;
     this.data=new Data(r.data);
     //COPIA O HP
     if (r.life instanceof Hp3DeT)
        this.life=new Hp3DeT((Hp3DeT)r.life);
     else
        if (r.life instanceof HpDungeonsAndDragons)
            this.life=new HpDungeonsAndDragons((HpDungeonsAndDragons)r.life);
        else
            if (r.life instanceof HpMundoDasTrevas)
                this.life=new HpMundoDasTrevas((HpMundoDasTrevas)r.life);
     //COPIA O XP
     if (r.experiencia instanceof XpMundoDasTrevas)
        this.experiencia=new XpMundoDasTrevas((XpMundoDasTrevas)r.experiencia);
     else
        if (r.experiencia instanceof Xp3DeT)
            this.experiencia=new Xp3DeT((Xp3DeT)r.experiencia);
        else 
            if (r.experiencia instanceof XpDungeonsAndDragons)
                this.experiencia=new XpDungeonsAndDragons((XpDungeonsAndDragons)r.experiencia);
     
     //COPIA INFORMACOS DO PERSONAGEM
     this.informacao=new CharacterInformation(r.informacao);
     for (Pagina paginaTemp:r.paginas)
        this.paginas.add(new Pagina(paginaTemp));
     for (Recurso recursoTemp:r.recursos)
        this.recursos.add(new Recurso(recursoTemp));
     for (Item itemTemp:r.inventario)
        this.inventario.add(new Item(itemTemp));
    }
    /*
    Caracteristicas
    */
    public void addPage(String nome){
        paginas.add(new Pagina(nome));
        System.out.println("pagina \""+nome+"\" adicionada");
    }
    public void addCaracteristica(Caracteristica c,int p) {        
        try{
            Pagina pagina=paginas.get(p);
            pagina.add(c);
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("pagina nao existe");
        }
        
    }
    public void addRecurso(Recurso r){
        recursos.add(r);
    }
    public void addItem(Item i){
        inventario.add(i);
    }
    
    /*
    metodos que mexem com as operacoes de info
    */
    public CharacterInformation getInfo(){
        return informacao;
    }
    public void addInfo(CharacterInformation c) {
        this.informacao=new CharacterInformation(c);
    }
    @Override
    public String toString(){
        String string ="";
        string  +="["+creator+","+system+","+data+"]\n"
                +" "+informacao+"\n"
                +" "+experiencia+"\n" 
                +" "+life+"\n";
        for (Recurso x:recursos)
            string+=" "+x+"\n";        
        for (Item x:inventario)
            string+=" "+x+"\n";
        for(Pagina p:paginas)
            string+=" "+p+"\n";
        return string;       
    }

    public List<Pagina> getPaginas() {
        return paginas;
    }
    public Pagina getPagina(int index) {
        return paginas.get(index);
    }

    public Iterable<Recurso> getResources() {
        return recursos;
    }
    public Iterable<Item> getItems(){
        return inventario;
    }

    public Xp getExperiencia() {
        return experiencia;
    }

    public void removeCaracteristica(Caracteristica caracteristica,int  i) {
        paginas.get(i).remove(caracteristica);
    }

    public int getPontos() {
        return experiencia.getPontos();    
    }

    public void removeRecurso(Recurso recurso) {
        recursos.remove(recurso);
    }
    public Hp getLife(){
        return life;
    }
    
}
