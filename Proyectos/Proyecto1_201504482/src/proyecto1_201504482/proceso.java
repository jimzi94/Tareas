/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201504482;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jimbo
 */

public class proceso extends Thread{
    private int minutos=0;
    private int punteo1,punteo2;
    public proceso(){
       punteo1=0;
       punteo2=0;
       
        
    }
    @Override
    public void run(){
        tablero_frame.jLabel3.setText(minutos+"");
     for(int a=0;a<60;a++){
        tablero_frame.jLabel2.setText(a+"");
         try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(proceso.class.getName()).log(Level.SEVERE, null, ex);
        }
         if(a==59){
         minutos++;
             tablero_frame.jLabel3.setText(minutos+"");
         a=0;
         }
         if(minutos==5)
         {
             a=100;
                JOptionPane.showMessageDialog(null, "Se ha acabado el tiempo");
                
                 
         }
         
        }
     
       
    }
    public void ganar() throws IOException{
     if(tablero_frame.jButton7.isEnabled()){
                punteo1=5;
                }
                else if(tablero_frame.jButton6.isEnabled())
                {
                    punteo1=4;
                }
                 else if(tablero_frame.jButton5.isEnabled())
                {
                    punteo1=3;
                }
                 else if(tablero_frame.jButton4.isEnabled())
                {
                    punteo1=3;
                }
                 if(tablero_frame.jButton12.isEnabled()){
                punteo1=5;
                }
                else if(tablero_frame.jButton11.isEnabled())
                {
                    punteo1=4;
                }
                 else if(tablero_frame.jButton10.isEnabled())
                {
                    punteo1=3;
                }
                 else if(tablero_frame.jButton9.isEnabled())
                {
                    punteo1=3;
                }
                 tablero_frame  fr;
                 if(punteo1>punteo2){
                 tablero_frame.guardar(menu.jTextField1.getText());
                 }
                 else if(punteo1<punteo2)
                 { tablero_frame.guardar(menu.jTextField2.getText());
                 }
                 else if(punteo1==punteo2){
                 tablero_frame.guardar("empate");
                 }
     
     
     }
     
}
