/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201504482;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jimbo
 */

public class proceso extends Thread{
    private int minutos=0;
    public proceso(){
       
       
        
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
}
