
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
public class Pasajeros {
       private Nodo_Simple primero;
    private Nodo_Simple ultimo;
    private int tamano;
    public Pasajeros() {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }
    public boolean siVacio() {
        return (this.primero == null);
    }
    public Pasajeros addLast(int dato, int documentos, int maletas, int turnos) {
        if(siVacio()) {
            Nodo_Simple nuevo = new Nodo_Simple(dato,documentos,maletas,turnos);
            primero = nuevo;
            ultimo = nuevo;
            nuevo.nodoDer = nuevo;
        }
        else {
            Nodo_Simple nuevo = new Nodo_Simple(dato,documentos,maletas,turnos);
            nuevo.nodoDer = null;
            ultimo.nodoDer = nuevo;
            ultimo = nuevo;
        }
        this.tamano++;
        return this;
    }


    public Nodo_Simple deleteLast() {
        Nodo_Simple eliminar = null;
        if(siVacio()) {
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
            return null;
        }
        if(primero == ultimo) {
            primero = null;
            ultimo = null;
        }
        else {
            Nodo_Simple actual = primero;
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

    public void Size() {
        JOptionPane.showMessageDialog(null, "El tamaño es:\n " + this.tamano);
    }

    public void imprimir() throws FileNotFoundException, IOException {
        
             File fout = new File("archivo_pasajeros.dot");
FileOutputStream fos = new FileOutputStream(fout,false);

BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
  bw.write("digraph {");
        if(tamano != 0) {
            Nodo_Simple temp = primero;
            String str = "";
            for(int i = 0; i < this.tamano-1; i++) {
                 bw.newLine();
                bw.write("Pasajero_"+temp.dato+"->");          
                str = str + temp.dato + "\n";
                temp = temp.nodoDer;        
            }
              bw.write("Pasajero_"+temp.dato);
               bw.write("}");
                bw.close();
          
        }
    } 
}
