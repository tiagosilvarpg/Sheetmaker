/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tiago
 */
public class Page implements Serializable{
    String title;
    List<Element> elements;
    public Page(String nome){
        title=nome;
        elements=new ArrayList();
    }
    public void add(Element element){
    elements.add(element);
        System.out.println("adicionou alguma coisa");
    }
    public void remove(Element element){
    elements.remove(element);        
    }
    @Override
    public String toString(){
        String string =("["+title+"]\n");
        for(int i=0;i<elements.size();i++){
            string+="       "+elements.get(i)+"\n";
        }
        return string;    
    }
    public int getElementsSize(){
        return elements.size();
    }
    public Element getElement(int i){
        return elements.get(i);
    }
    public String getTitle(){
     return this.title;   
    }
    
}
