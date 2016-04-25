/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpgsheet.elements;

/**
 *
 * @author FACOMP
 */
public class Item {
    protected String nome,descricao;
    protected int quantidade;
    public Item(Item i){
        this(i.nome,i.descricao,i.quantidade);
    }
    public Item(){
        this("pedra","é uma pedra dã",1);
    }
    public Item(String nome,String descricao, int quantidade){
        this.nome=nome;
        this.descricao=descricao;
        this.quantidade=quantidade;
    }
    @Override
    public String toString(){
        return nome+" ("+quantidade+")";
    }
}
