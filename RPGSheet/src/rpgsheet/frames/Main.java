/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.frames;

import java.io.*;
import javax.swing.*;
import rpgsheet.elements.Atributo;
import rpgsheet.elements.Caracteristica;
import rpgsheet.elements.Dado;
import rpgsheet.elements.Ficha;
import rpgsheet.elements.Item;
import rpgsheet.elements.MundoDasTrevas.FichaMundoDasTrevas;
import rpgsheet.elements.Recurso;
import rpgsheet.elements.Vantagem;


/**
 *
 * @author Tiago
 */
public class Main {
    static Ficha ficha;
    static Janela mainFrame;
    static Dado dado;
    
    public static void main(String[] args) {
        
        ficha=new FichaMundoDasTrevas();
        mainFrame=new Janela();
        mainFrame.setVisible(true);
        dado= new Dado();
        load("Last");
    }
    //METODOS DE SERIALIZACAO
    static void save(){//
        String filename = JOptionPane.showInputDialog("Digite o nome do arquivo","nome do arquivo");
        if (filename!=null)
        {
            new File("C:\\fichas\\").mkdir();
            try 
            {   FileOutputStream arquivo = new FileOutputStream("C:\\fichas\\"+filename+".ficha");
                ObjectOutputStream stream = new ObjectOutputStream(arquivo);
                stream.writeObject(ficha);
                System.out.println(filename+".ficha salvo com sucesso");            
            } catch (IOException ex) {
                System.out.println("problema de entrada e saida");
                System.out.println(ex);
            }
        }
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
       mainFrame.refresh();
    }
    static void newFicha(){
        NewFicha frame= new NewFicha();
        frame.setVisible(true);
    }    
    static void newInfo() {
        NewInfo frame=new NewInfo(ficha.getInfo());
        frame.setVisible(true);
    }
    static void newResource() {
        NewRecurso frame=new NewRecurso();
        frame.setVisible(true);        
    }
    static void newItem() {
        NewItem frame=new NewItem();
        frame.setVisible(true);
    }
    static void newPage(){
        String name = JOptionPane.showInputDialog("titulo da pagina","pagina "+(ficha.getPaginas().size()+1));
        if (name!=null)
            ficha.addPage(name);
        refresh();
    }
    static void newAtribute() {
        NewAtributo frame=new NewAtributo();
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
        if (caracteristica instanceof Atributo){
            EditCaracteristica frame=new EditCaracteristica((Atributo)caracteristica);
            frame.setVisible(true);
       }
        if (caracteristica instanceof Vantagem){
            EditVantagem frame=new EditVantagem((Vantagem)caracteristica);
            frame.setVisible(true);
        }
        
    }

    static void removeCaracteristica(Caracteristica caracteristica) {        
        ficha.removeCaracteristica(caracteristica,getCurrentPage());
    }

    static void removeRecurso(Recurso recurso) {
        ficha.removeRecurso(recurso);
    }

    static void editRecurso(Recurso recurso) {
        EditRecurso frame=new EditRecurso(recurso);
        frame.setVisible(true);
    }

    static void editItem(Item item) {
        EditItem frame=new EditItem(item);
        frame.setVisible(true);
    }

    static void sortPage(int currentPage) {
        ficha.getPagina(currentPage).sortPage();
    }
    public static void wizard(){
        if (ficha instanceof FichaMundoDasTrevas){
            WizardMundoDasTrevas frame=new WizardMundoDasTrevas();
            frame.setVisible(true);
        }
        else JOptionPane.showMessageDialog(mainFrame,"Desculpe,somente Mundo Das Trevas tem Wizard");
    }

    static void newVantagem() {
        NewVantagem frame=new NewVantagem();
        frame.setVisible(true);
    }

    static void editVantagem(Caracteristica caracteristica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
    