/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpgsheet.elements;

import java.io.Serializable;

/**
 *
 * @author FACOMP
 */
public class Item implements Serializable{
    protected String nome,descricao;
    protected int quantidade;
    
    public int getQuantidade(){
        return quantidade;
    }
    public Item(final Item i){
        this(i.nome,i.descricao,i.quantidade);
    }
    public Item(){
        this("pedra","é uma pedra dã",1);
    }
    public Item(String nome,String descricao, int quantidade){
        this.nome=nome==null?"item":nome;
        this.descricao=descricao==null?"descricao do item":descricao;
        this.quantidade=quantidade>0?quantidade:1;
    }
    @Override
    public String toString(){
        return nome+" ("+quantidade+")";
    }

    public String getDescricao() {
        return descricao;
    }

    public void gastar(int i) {
        quantidade=(i<quantidade)?quantidade-i:0;
    }
    
}
