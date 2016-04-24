/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import rpgsheet.elements.Caracteristica;

/**
 *
 * @author Tiago
 */
public class AtributoBotao extends JButton implements ActionListener{
    Caracteristica caracteristica;
    
    public AtributoBotao(String nome,final Caracteristica c){
        super(nome);
        this.caracteristica=c;
        this.setToolTipText(caracteristica.getDescricao());
        addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                AtributePanel frame=new AtributePanel(caracteristica);
                    frame.setVisible(true);
            }
        }
        );

    }
    @Override
            public void actionPerformed(ActionEvent e)
            {
                AtributePanel frame=new AtributePanel(caracteristica);
                    frame.setVisible(true);
            }
}
