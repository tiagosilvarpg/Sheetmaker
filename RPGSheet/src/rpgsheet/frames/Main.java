/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.frames;

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
    static Janela frame;
    public static void main(String[] args) {
        
        ficha=new Ficha();
        String resposta=JOptionPane.showInputDialog("o que quer fazer ?","(novo,exibir)");
        if (resposta!=null){
            if (resposta.equals("novo"))
                    {
                List<JTextPane>frame=new ArrayList();
                frame.add(new JTextPane());
                frame.add(new JTextPane());
                frame.add(new JTextPane());
                frame.add(new JTextPane());
                JOptionPane.showInputDialog(frame);
                //Main.ficha=new Ficha(frame.getComponent(0).toString(),frame.getComponent(1).toString(),new Data(Integer.parseInt(frame.getComponent(2).toString().trim())));
            }
        }
        //frame =new Janela();
        //frame.setVisible(true);        
    }
    static void newFicha(){
        String nome,sistema;        
        nome = JOptionPane.showInputDialog("nome do personagem","personagem");
        sistema = JOptionPane.showInputDialog("sistema","sistema");
        ficha = new Ficha(nome,sistema,new Data(15,04,2016));
        System.out.println(ficha);
        refresh();
    }
    static void save(){//
         FileOutputStream arquivo;
         String filename;
         filename = JOptionPane.showInputDialog("Digite um tamanho para a piramide","nome do arquivo");
         if (filename!=null)
         {
            try 
            {
                arquivo = new FileOutputStream("C:\\Users\\Tiago\\Desktop\\"+filename+".ficha");
                 try (ObjectOutputStream stream = new ObjectOutputStream(arquivo)) {
                     stream.writeObject(ficha);
                 }
                System.out.println("Done");

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Ficha.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Ficha.class.getName()).log(Level.SEVERE, null, ex);
            }
         
         }
    }
    static void refresh(){
        frame.dispose();
        frame=new Janela();
        frame.setVisible(true);
        System.out.println(ficha);
        
    }
    
    static void load() {//le uma ficha salva
        FileInputStream finput = null;
        String filename;
         filename = JOptionPane.showInputDialog("Digite um tamanho para a piramide","nome do arquivo");
         if (filename!=null)
         {
            try {
                finput = new FileInputStream("C:\\Users\\Tiago\\Desktop\\"+filename+".ficha");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            try (ObjectInputStream ois = new ObjectInputStream(finput)) {
                ficha = (Ficha) ois.readObject();

            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } 
         }
         refresh();
    }    
}
    