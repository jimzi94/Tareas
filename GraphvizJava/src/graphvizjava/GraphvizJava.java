/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphvizjava;

/**
 *
 * @author Jimbo
 */
public class GraphvizJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    dibujar();
    }
    public GraphvizJava( ){
		
	}
	
	public static void dibujar( ){
		try
		{       
			ProcessBuilder pbuilder;
		    
			/*
			 * Realiza la construccion del comando    
			 * en la linea de comandos esto es: 
			 * dot -Tpng -o archivo.png archivo.dot
			 */
			pbuilder = new ProcessBuilder( "dot", "-Tpng", "graf.dot","-o" ,"graf.png");
			pbuilder.redirectErrorStream( true );
			//Ejecuta el proceso
			pbuilder.start();
		    
		} catch (Exception e) { e.printStackTrace(); }
	}
}

