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
class Item {
    String nome,descricao;
    int quantidade;
    public Item(Item i){
        nome=i.nome;
        descricao=i.descricao;
        quantidade=i.quantidade;
    }
    
}
