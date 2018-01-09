/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_201504482;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Jimbo
 */
public class Servicios {
  private Nodo_Servicios primero;
    private Nodo_Servicios ultimo;
    private int tamano;
    public Servicios() {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }
    public boolean siVacio() {
        return (this.primero == null);
    }
    public Servicios addLast(int datos) {
        if(siVacio()) {
            Nodo_Servicios nuevo = new Nodo_Servicios(datos);
            primero = nuevo;
            ultimo = nuevo;
            nuevo.nodoDer = nuevo;
        }
        else {
            Nodo_Servicios nuevo = new Nodo_Servicios(datos);
            nuevo.nodoDer = null;
            ultimo.nodoDer = nuevo;
            ultimo = nuevo;
        }
        this.tamano++;
        return this;
    }

//Metodo para borrar al final de la lista.
    public Nodo_Servicios deleteLast() {
        Nodo_Servicios eliminar = null;
        if(siVacio()) {
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
            return null;
        }
        if(primero == ultimo) {
            primero = null;
            ultimo = null;
        }
        else {
            Nodo_Servicios actual = primero;
            while(actual.nodoDer != ultimo) {
                actual = actual.nodoDer;
            }
            eliminar = actual.nodoDer;
            actual.nodoDer = null;

            ultimo = actual;
        }
        this.tamano--;
        return eliminar;
    }
//Metodo que imprime el tamaño de la lista.
    public void tamano() {
        JOptionPane.showMessageDialog(null, "El tamaño es:\n " + this.tamano);
    }
//Metodo que imprime la lista y los valores ingresados.
    public void imprimir() throws FileNotFoundException, IOException {
        
             File fout = new File("archivo_Servicios.dot");
FileOutputStream fos = new FileOutputStream(fout,false);

BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
  bw.write("digraph {rankdir=LR");
        if(tamano != 0) {
            Nodo_Servicios temp = primero;
            String str = "";
            for(int i = 0; i < this.tamano-1; i++) {
                 bw.newLine();
                bw.write("Estacion_"+temp.dato+"->");          
                str = str + temp.dato + "\n";
                temp = temp.nodoDer;        
            }
              bw.write("Estacion_"+temp.dato);
               bw.write("}");
                bw.close();
        }
    } 
}
