/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201504482;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Jimbo
 */
public class boton extends JButton implements ActionListener {
  
    public boton(int x,int y,int ancho,int largo ){
    super.setBounds(x,y,ancho,largo);
    addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
    }
}
