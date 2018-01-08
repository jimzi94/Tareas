/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_201504482;

/**
 *
 * @author Jimbo
 */
public class Nodo_Doble {
    int dato;
    int pasajeros;
    String tamaño;
	Nodo_Doble next;
	Nodo_Doble ant;
	Nodo_Doble(int a,int pasajeros, String tamaño)
	{
		this.dato=a;
                this.pasajeros=pasajeros;
                this.tamaño=tamaño;
		this.next=null;
		this.ant=null;
	}
}
