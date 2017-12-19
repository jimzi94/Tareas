/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja_de_trabajo_1_201504482;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Jimbo
 */

public class boton extends JButton implements ActionListener {
    private static int turno=0;
    private Tablero tab;
    public boton(int x,int y,int ancho,int largo ){
    super.setBounds(x,y,ancho,largo);
    addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(turno==0){
        super.setText("X");
        turno=1;
        }
        else{
        super.setText("O");
        turno=0;
        }
        super.setEnabled(false);
        System.out.println(this.getName());
       if((Tablero.tablero[1][1].getText().equals("X"))&&(Tablero.tablero[1][2].getText().equals("X"))&&(Tablero.tablero[1][3].getText().equals("X")))
       {
                       JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado","Informacion", JOptionPane.INFORMATION_MESSAGE);

       }
       else if((Tablero.tablero[2][1].getText().equals("X"))&&(Tablero.tablero[2][2].getText().equals("X"))&&(Tablero.tablero[2][3].getText().equals("X")))
       {
                              JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado","Informacion", JOptionPane.INFORMATION_MESSAGE);
       }
        else if((Tablero.tablero[3][1].getText().equals("X"))&&(Tablero.tablero[3][2].getText().equals("X"))&&(Tablero.tablero[3][3].getText().equals("X")))
       {
                              JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado","Informacion", JOptionPane.INFORMATION_MESSAGE);
       }
        else if((Tablero.tablero[1][1].getText().equals("X"))&&(Tablero.tablero[2][1].getText().equals("X"))&&(Tablero.tablero[3][1].getText().equals("X")))
       {
                              JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado","Informacion", JOptionPane.INFORMATION_MESSAGE);
       }
          else if((Tablero.tablero[2][1].getText().equals("X"))&&(Tablero.tablero[2][2].getText().equals("X"))&&(Tablero.tablero[2][3].getText().equals("X")))
       {
                              JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado","Informacion", JOptionPane.INFORMATION_MESSAGE);
       }
          else if((Tablero.tablero[3][1].getText().equals("X"))&&(Tablero.tablero[3][2].getText().equals("X"))&&(Tablero.tablero[3][3].getText().equals("X")))
       {
                              JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado","Informacion", JOptionPane.INFORMATION_MESSAGE);
       }
       
       
       
       
          else if((Tablero.tablero[1][1].getText().equals("O"))&&(Tablero.tablero[1][2].getText().equals("O"))&&(Tablero.tablero[1][3].getText().equals("O")))
       {
                       JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado","Informacion", JOptionPane.INFORMATION_MESSAGE);

       }
       else if((Tablero.tablero[2][1].getText().equals("O"))&&(Tablero.tablero[2][2].getText().equals("O"))&&(Tablero.tablero[2][3].getText().equals("O")))
       {
                              JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado","Informacion", JOptionPane.INFORMATION_MESSAGE);
       }
        else if((Tablero.tablero[3][1].getText().equals("O"))&&(Tablero.tablero[3][2].getText().equals("O"))&&(Tablero.tablero[3][3].getText().equals("O")))
       {
                              JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado","Informacion", JOptionPane.INFORMATION_MESSAGE);
       }
        else if((Tablero.tablero[1][1].getText().equals("O"))&&(Tablero.tablero[2][1].getText().equals("O"))&&(Tablero.tablero[3][1].getText().equals("O")))
       {
                              JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado","Informacion", JOptionPane.INFORMATION_MESSAGE);
       }
          else if((Tablero.tablero[2][1].getText().equals("O"))&&(Tablero.tablero[2][2].getText().equals("O"))&&(Tablero.tablero[2][3].getText().equals("O")))
       {
                              JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado","Informacion", JOptionPane.INFORMATION_MESSAGE);
       }
          else if((Tablero.tablero[3][1].getText().equals("O"))&&(Tablero.tablero[3][2].getText().equals("O"))&&(Tablero.tablero[3][3].getText().equals("O")))
       {
                              JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado","Informacion", JOptionPane.INFORMATION_MESSAGE);
       }
    }
}
