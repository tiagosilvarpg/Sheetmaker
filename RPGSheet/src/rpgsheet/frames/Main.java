/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.frames;

import java.io.*;
import javax.swing.*;
import rpgsheet.elements.Caracteristica;
import rpgsheet.elements.Data;
import rpgsheet.elements.Ficha;
import rpgsheet.elements.MundoDasTrevas.FichaMundoDasTrevas;
import rpgsheet.elements.Recurso;


/**
 *
 * @author Tiago
 */
public class Main {
    static Ficha ficha;
    static Janela mainFrame;
    
    public static void main(String[] args) {
        
        ficha=new FichaMundoDasTrevas();
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
               System.out.println(filename+".ficha salvo com sucesso");
            } catch (FileNotFoundException ex) {
                System.out.println("arquivo nao encontrado");
            } catch (IOException ex) {
                System.out.println("problema de entrada e saida");
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
                System.out.println(filename+" carregado com sucesso");
                
            } catch (FileNotFoundException ex) {
                System.out.println("arquivo "+filename+" nao encontrado");

            } catch (IOException | ClassNotFoundException ex) {
                System.out.println("arquivo "+filename+" nao pode ser lido,pode estar corrompido ou pertence a uma versao diferente");
                System.out.println("usando ficha em branco");
                ficha=new FichaMundoDasTrevas(); 
            } catch (NullPointerException ex){
                System.out.println("nome inserido invalido");
                System.out.println("usando ficha em branco");
                ficha=new FichaMundoDasTrevas(); 
            } finally {
                refresh();
            }
            
         }
    }
    static void refresh(){        
        System.out.println(ficha);
        mainFrame.refresh();
    }
    static void newFicha(){
        String nome,sistema;        
        nome = JOptionPane.showInputDialog("criador","criador");
        sistema = JOptionPane.showInputDialog("sistema","sistema");
        ficha = new FichaMundoDasTrevas(nome,sistema,new Data());
        refresh();
    }
    
    static void newInfo() {
        newInfo frame=new newInfo(ficha.getInfo());
        frame.setVisible(true);
    }
    static void newResource() {
        newRecurso frame=new newRecurso();
        frame.setVisible(true);        
    }
    static void newItem() {
        newItem frame=new newItem();
        frame.setVisible(true);
    }
    static void newPage(){
        String name = JOptionPane.showInputDialog("titulo da pagina","pagina "+(ficha.getPaginas().size()+1));
        if (name!=null)
            ficha.addPage(name);
        refresh();
    }
    static void newAtribute() {
        newAtributo frame=new newAtributo();
        frame.setVisible(true);
    }
    static void newHability() {
        newHabilidade frame=new newHabilidade();
        frame.setVisible(true);
    }
    static void newAdvantage() {
        newVantagem frame=new newVantagem();
        frame.setVisible(true);
    }
    static void diceRoll() {
        RollDice frame=new RollDice();
        frame.setVisible(true);    
    }

    static void manageExperience() {
        ManageExperience frame= new ManageExperience(ficha.getExperiencia());
        frame.setVisible(true);
    }

    static void renamePagina() {
        int pagina=currentpage;
        String text = JOptionPane.showInputDialog("Nome da pagina",Main.ficha.getPagina(pagina).getLabel());
        if (text!=null)
            Main.ficha.getPagina(pagina).setLabel(text);
        else
            System.out.println("nome invalido");
        Main.refresh();
    }
    static private int currentpage;
    static public int getCurrentPage(){
        currentpage= mainFrame.getCurrentPage();
        return currentpage;
    }
    static public void setCurrentPage(int i){
        currentpage=i;
    }

    static void editCaracteristica(Caracteristica caracteristica) {
        CaracteristicaEdit frame=new CaracteristicaEdit(caracteristica);
        frame.setVisible(true);
        //frame.setVisible(true);
    }

    static void removeCaracteristica(Caracteristica caracteristica) {        
        ficha.removeCaracteristica(caracteristica,getCurrentPage());
    }

    static void removeRecurso(Recurso recurso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void editRecurso(Recurso recurso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
    