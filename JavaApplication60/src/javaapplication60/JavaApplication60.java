/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication60;

/**
 *
 * @author Jimbo
 */
public class JavaApplication60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Hola Mundo");
    try {
      
      String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
      
      String fileInputPath = "c:\\graf.dot";
      String fileOutputPath = "c:\\graf.png";
      
      String tParam = "-Tpng";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      
      rt.exec( cmd );
      
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
    }

        
    }
    
    
}
