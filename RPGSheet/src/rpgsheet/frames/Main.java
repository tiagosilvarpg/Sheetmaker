/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.frames;

import rpgsheet.elements.Data;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;
import javax.swing.*;

import rpgsheet.elements.*;

/**
 *
 * @author Tiago
 */
public class Main {
    static Ficha ficha;
    static Janela mainFrame;
    static int currentPage=0;
    
    public static void main(String[] args) {
        
        ficha=new Ficha();
        mainFrame=new Janela();
        mainFrame.setVisible(true);
        load("Last");
    }
    //METODOS DE SERIALIZACAO
    static void save(){//
         FileOutputStream arquivo;
         String filename;
         filename = JOptionPane.showInputDialog("Digite o nome do arquivo","nome do arquivo");
         if (filename!=null)
         {
            try 
            {
                new File("C:\\fichas\\").mkdir();
                arquivo = new FileOutputStream("C:\\fichas\\"+filename+".ficha");
                ObjectOutputStream stream = new ObjectOutputStream(arquivo);
                stream.writeObject(ficha);
                mainFrame.print(filename+".ficha salvo com sucesso");
            } catch (FileNotFoundException ex) {
                mainFrame.print("arquivo nao encontrado");
            } catch (IOException ex) {
                mainFrame.print("problema de entrada e saida");
            }
         }
    }
    static void load(){
        load(null);
    }
    static void load(String filename) {//le uma ficha salva
         FileInputStream finput;
         if (filename==null) filename = JOptionPane.showInputDialog("Digite o nome do arquivo a ser carregado","nome do arquivo");
         {
            try {             
                finput = new FileInputStream("C:\\fichas\\"+filename+".ficha");
                ObjectInputStream ois = new ObjectInputStream(finput);
                
                ficha = (Ficha) ois.readObject();
                mainFrame.print(filename+" carregado com sucesso");
                
            } catch (FileNotFoundException ex) {
                mainFrame.print("arquivo "+filename+" nao encontrado");

            } catch (IOException | ClassNotFoundException ex) {
                mainFrame.print("arquivo "+filename+" nao pode ser lido,pode estar corrompido ou pertence a uma versao diferente");
                mainFrame.print("usando ficha em branco");
                ficha=new Ficha(); 
            } catch (NullPointerException ex){
                mainFrame.print("nome inserido invalido");
                mainFrame.print("usando ficha em branco");
                ficha=new Ficha(); 
            } finally {
                refresh();
            }
            
         }
    }
    static void refresh(){        
        mainFrame.print(ficha.toString());
        mainFrame.refresh();
    }
    static void newFicha(){
        String nome,sistema;        
        nome = JOptionPane.showInputDialog("criador","criador");
        sistema = JOptionPane.showInputDialog("sistema","sistema");
        ficha = new Ficha(nome,sistema,new Data());

        refresh();
    }
    static void newItem() {
        newItem frame=new newItem();
        frame.setVisible(true);
    }

    static void newResource() {
        newRecurso frame=new newRecurso();
        frame.setVisible(true);        
    }

    static void newAtribute() {
        newAtributo frame=new newAtributo();
        System.out.println("Main abriu a janela");
        frame.setVisible(true);
    }
    static void newInfo() {
        newInfo frame=new newInfo(ficha.getInfo());
        frame.setVisible(true);
    }

    static void diceRoll() {
        RollDice frame=new RollDice();
        frame.setVisible(true);
    }
    static void newPage(){
        String name = JOptionPane.showInputDialog("titulo da pagina","pagina "+(ficha.getPaginas().size()+1));
        if (name!=null)
            ficha.addPage(name);
        refresh();
    }
    static void setCurrentPage(int i){
        if (i>=0)
        {
            Main.currentPage=i;
        }
        else
            Main.currentPage=0;
    }
    static int getCurrentPage(){
        return Main.currentPage;
    }
}
    