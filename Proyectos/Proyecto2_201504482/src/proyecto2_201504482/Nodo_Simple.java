
package proyecto2_201504482;

/**
 *
 * @author Jimbo
 */
public class Nodo_Simple {
    Nodo_Simple nodoDer;
    int dato;
    int documentos;
    int maletas;
    int turnos;
    public Nodo_Simple(int dato, int documentos, int maletas, int turnos) {
        this.dato = dato;
        this.nodoDer = null;
        this.documentos=documentos;
        this.maletas=maletas;
        this.turnos=turnos;
    }
}
