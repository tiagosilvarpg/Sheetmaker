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
    public Item(String nome,String descricao, int quantidade){
        this.nome=nome;
        this.descricao=descricao;
        this.quantidade=quantidade;
    }
    public String toString(){
        return nome+" ("+quantidade+")";
    }
}
