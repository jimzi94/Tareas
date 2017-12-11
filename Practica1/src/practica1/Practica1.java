/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Jimbo
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    
    static Scanner leer=new Scanner(System.in);
  
    static String nombre_jugador="";
    static String[][] mapa=new String[71][37];
    public static void main(String[] args) {
      menu();
    }
     public static void mapa(){
         mapa[0][0]="#";
      for(int controladora=0;controladora<70;controladora++){
         mapa[controladora][0]="#";
       
      }
      System.out.println();
      for(int controladora=0;controladora<35;controladora++)
      {
          mapa[0][controladora]="#";
          
          
      }
      for(int controladora=0;controladora<35;controladora++)
      {
          mapa[69][controladora]="#";
          
      }
      for(int controladora_filas=1;controladora_filas<35;controladora_filas++){
      for(int controladora_columnas=1;controladora_columnas<69;controladora_columnas++){
          mapa[controladora_columnas][controladora_filas]=" ";
      }}
      for(int controladora=0;controladora<70;controladora++){
         mapa[controladora][35]="#";
 
      }
      for(int pared_aleatoria=0;pared_aleatoria<20;pared_aleatoria++)
      {
          int pared_x=(int)(Math.random()*69)+1;
          int pared_y=(int)(Math.random()*34)+1;
          mapa[pared_x][pared_y]="#";
      }
       for(int comida_aleatoria=0;comida_aleatoria<40;comida_aleatoria++)
      {
          int pared_x=(int)(Math.random()*69)+1;
          int pared_y=(int)(Math.random()*34)+1;
          mapa[pared_x][pared_y]="%";
      }
       for(int daño_aleatoria=0;daño_aleatoria<30;daño_aleatoria++)
      {
          int pared_x=(int)(Math.random()*69)+1;
          int pared_y=(int)(Math.random()*34)+1;
          mapa[pared_x][pared_y]="$";
      }
      
     
      for(int mapeo_y=0;mapeo_y<36;mapeo_y++)
      {
      for(int mapeo_x=0;mapeo_x<70;mapeo_x++)
      {
          System.out.print(mapa[mapeo_x][mapeo_y]);
      }
      System.out.println();
      }
      
    }
    public static void menu(){
          String selector_menu = "";
        System.out.println("1)Iniciar Juego");
        System.out.println("2)Regresar Juego");
        System.out.println("3)Historial");
        System.out.println("4)Salir");
        System.out.println("Ingrese una Opcion:");
          try{
        selector_menu=leer.next();
          }
        catch(Exception e){
                  
                  
                    menu();
                }
        switch(selector_menu){
            case "1": 
                System.out.print("Ingrese su nombre: ");
              
                nombre_jugador=leer.next();
                
                
                  mapa();
                break;
              
            case "2": 
                 
                break;
            case "3": break;
            case "4":System.exit(0); break;
            default:   
                  System.out.println("");
                System.out.println("Opcion no valida porfavor intente de nuevo");menu();
        }
    }
   
  
}
