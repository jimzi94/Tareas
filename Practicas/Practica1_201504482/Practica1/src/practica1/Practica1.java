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
    static Scanner leer = new Scanner(System.in);
    static Integer[][] movimientos = new Integer[500][3];
    static String nombre_jugador = "";
    static String[][] mapa = new String[71][37];
    static int tamaño = 0;
    static int puntuacion;
    static int posicion_x = 35;
    static int posicion_y = 17;
    static String[][] usuarios=new String[10][3];
    static String fecha_de_nacimiento;
    static int contador_user=0;
    public static void main(String[] args) {
        movimientos[0][0] = 35;
        movimientos[0][1] = 17;
        puntuacion = 10;
        menu();
    }
    public static void mapa() {
        mapa[0][0] = "#";
        for (int controladora = 0; controladora < 70; controladora++) {
            mapa[controladora][0] = "#";
        }
        System.out.println();
        for (int controladora = 0; controladora < 35; controladora++) {
            mapa[0][controladora] = "#";
        }
        for (int controladora = 0; controladora < 35; controladora++) {
            mapa[69][controladora] = "#";
        }
        for (int controladora_filas = 1; controladora_filas < 35; controladora_filas++) {
            for (int controladora_columnas = 1; controladora_columnas < 69; controladora_columnas++) {

                mapa[controladora_columnas][controladora_filas] = " ";
            }
        }
        for (int controladora = 0; controladora < 70; controladora++) {
            mapa[controladora][35] = "#";
        }
        for (int pared_aleatoria = 0; pared_aleatoria < 20; pared_aleatoria++) {
            int pared_x = (int) (Math.random() * 69) + 1;
            int pared_y = (int) (Math.random() * 34) + 1;
            if (!mapa[pared_x][pared_y].equals("O")) {
                mapa[pared_x][pared_y] = "#";
            }
        }
        for (int comida_aleatoria = 0; comida_aleatoria < 40; comida_aleatoria++) {
            int pared_x = (int) (Math.random() * 69) + 1;
            int pared_y = (int) (Math.random() * 34) + 1;
            if (!mapa[pared_x][pared_y].equals("O")) {
                mapa[pared_x][pared_y] = "%";
            }
        }
        for (int daño_aleatoria = 0; daño_aleatoria < 30; daño_aleatoria++) {
            int pared_x = (int) (Math.random() * 69) + 1;
            int pared_y = (int) (Math.random() * 34) + 1;
            if (!mapa[pared_x][pared_y].equals("O")) {
                mapa[pared_x][pared_y] = "$";
            }
        }
        mapa[35][17] = "0";
    }
    public static void refresh_map() {
        for (int mapeo_y = 0; mapeo_y < 36; mapeo_y++) {
            for (int mapeo_x = 0; mapeo_x < 70; mapeo_x++) {
                System.out.print(mapa[mapeo_x][mapeo_y]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Puntuacion: " + puntuacion);
    }
    public static void rastreo(int new_x, int new_y) {
        movimientos[1][0] = new_x;
        movimientos[1][1] = new_y;
        mapa[movimientos[0][0]][movimientos[0][1]] = " ";
        movimientos[0][0] = movimientos[1][0];
        movimientos[0][1] = movimientos[1][1];
    }
    public static void menu() {
        String selector_menu;
        System.out.println("1)Iniciar Juego");
        System.out.println("2)Regresar Juego");
        System.out.println("3)Historial");
        System.out.println("4)Salir");
        System.out.println("Ingrese una Opcion:");
        selector_menu = leer.next();
        switch (selector_menu) {
            case "1":
                String movimiento;
                System.out.print("Ingrese su nombre: ");
                nombre_jugador = leer.next();
                System.out.println("Ingrese su fecha de nacimiento: ");
                fecha_de_nacimiento=leer.next();
                mapa();
                refresh_map();
                boolean ciclo = true;
                while (ciclo) {
                    System.out.println("Escriba su comando porfavor");
                    movimiento = leer.next();
                    switch (movimiento) {
                        case "a":
                    switch (mapa[posicion_x - 1][posicion_y]) {
                        case " ":
                            mapa[posicion_x - 1][posicion_y] = "0";
                            rastreo((posicion_x - 1) + tamaño, posicion_y);
                            refresh_map();
                            posicion_x--;
                            break;
                        case "%":
                            mapa[posicion_x - 1][posicion_y] = "0";
                            mapa[posicion_x][posicion_y] = "0";
                            rastreo(posicion_x + 1, posicion_y);
                            refresh_map();
                            posicion_x--;
                            puntuacion = puntuacion + 10;
                            tamaño = tamaño + 1;
                            refresh_map();
                            if(puntuacion>=100){
                                System.out.println("Felicidades");
                                 System.out.println("Ha llegado a los 100 puntos");
                                  usuarios[contador_user][0]=nombre_jugador;
                                  usuarios[contador_user][1]=fecha_de_nacimiento;
                                      contador_user++;
                                 leer.next();
                                  menu();
                            }
                            break;
                        case "$":
                            mapa[posicion_x - 1][posicion_y] = "0";
                            rastreo((posicion_x + 1) - tamaño, posicion_y);
                            refresh_map();
                            posicion_x--;
                            puntuacion = puntuacion - 10;
                            tamaño--;
                            refresh_map();
                            break;
                        default:
                            break;
                    }
                            break;
                        case "d":
                    switch (mapa[posicion_x + 1][posicion_y]) {
                        case " ":
                            mapa[posicion_x + 1][posicion_y] = "0";
                            rastreo((posicion_x + 1) - tamaño, posicion_y);
                            posicion_x++;
                            refresh_map();
                            break;
                        case "%":
                            mapa[posicion_x + 1][posicion_y] = "0";
                            mapa[posicion_x][posicion_y] = "0";
                            rastreo(posicion_x - 1, posicion_y);
                            posicion_x++;
                            puntuacion = puntuacion + 10;
                            tamaño = tamaño + 1;
                            refresh_map();
                            if(puntuacion>=100){
                                System.out.println("Felicidades");
                                 System.out.println("Ha llegado a los 100 puntos");
                                  usuarios[contador_user][0]=nombre_jugador;
                                  usuarios[contador_user][1]=fecha_de_nacimiento;
                                      contador_user++;
                                 leer.next();
                                  menu();
                            }
                            break;
                        case "$":
                            mapa[posicion_x + 1][posicion_y] = "0";
                            rastreo((posicion_x + 1) - tamaño, posicion_y);
                            refresh_map();
                            posicion_x++;
                            puntuacion = puntuacion - 10;
                            tamaño--;
                            refresh_map();
                            break;
                        default:
                            break;
                    }
                            break;
                        case "s":
                    switch (mapa[posicion_x][posicion_y + 1]) {
                        case " ":
                            mapa[posicion_x][posicion_y + 1] = "0";
                            rastreo((posicion_x), (posicion_y + 1) - tamaño);
                            refresh_map();
                            posicion_y++;
                            break;
                        case "%":
                            mapa[posicion_x][posicion_y + 1] = "0";
                            mapa[posicion_x][posicion_y] = "0";
                            rastreo(posicion_x, posicion_y - 1);
                            posicion_y++;
                            puntuacion = puntuacion + 10;
                            tamaño = tamaño + 1;
                            refresh_map();
                            if(puntuacion>=100){
                                System.out.println("Felicidades");
                                 System.out.println("Ha llegado a los 100 puntos");
                                  usuarios[contador_user][0]=nombre_jugador;
                                  usuarios[contador_user][0]=fecha_de_nacimiento;
                                      contador_user++;
                                 leer.next();
                                  menu();
                            }
                            break;
                        case "$":
                            mapa[posicion_x][posicion_y + 1] = "0";
                            rastreo((posicion_x) - tamaño, posicion_y - 1);
                            refresh_map();
                            posicion_y++;
                            puntuacion = puntuacion - 10;
                            tamaño--;
                            refresh_map();
                            break;
                        default:
                            break;
                    }
                            break;
                        case "w":
                    switch (mapa[posicion_x][posicion_y - 1]) {
                        case " ":
                            mapa[posicion_x][posicion_y - 1] = "0";
                            rastreo((posicion_x), posicion_y - 1 + tamaño);
                            refresh_map();
                            posicion_y--;
                            break;
                        case "%":
                            mapa[posicion_x][posicion_y - 1] = "0";
                            mapa[posicion_x][posicion_y] = "0";
                            rastreo(posicion_x, posicion_y + 1);
                            posicion_y--;
                            puntuacion = puntuacion + 10;
                            tamaño = tamaño + 1;
                            refresh_map();
                            if(puntuacion>=100){
                                System.out.println("Felicidades");
                                 System.out.println("Ha llegado a los 100 puntos");
                                  usuarios[contador_user][0]=nombre_jugador;
                                  usuarios[contador_user][1]=fecha_de_nacimiento;
                                      contador_user++;
                                 leer.next();
                                  menu();
                            }
                            break;
                        case "$":
                            mapa[posicion_x][posicion_y - 1] = "0";
                            rastreo((posicion_x) - tamaño, posicion_y + 1);
                            refresh_map();
                            posicion_y--;
                            puntuacion = puntuacion - 10;
                            refresh_map();
                            break;
                        default:
                            break;
                    }
                            break;
                        case "m":
                            menu();
                            ciclo = false;
                            break;
                    }
                    if(puntuacion==0){
                    System.out.println("Usted ha perdido");
                     usuarios[contador_user][0]=nombre_jugador;
                                  usuarios[contador_user][1]=fecha_de_nacimiento;
                                      contador_user++;
                                    ciclo = false;
                    leer.next();
                     mapa();
                    menu();
                   
                    }
                }
                break;
            case "2":
                String movi;
                refresh_map();
                ciclo = true;
                while (ciclo) {
                    System.out.println("Escriba su comando porfavor");
                    movi = leer.next();
                    switch (movi) {
                        case "a":
                    switch (mapa[posicion_x - 1][posicion_y]) {
                        case " ":
                            mapa[posicion_x - 1][posicion_y] = "0";
                            rastreo((posicion_x - 1) + tamaño, posicion_y);
                            refresh_map();
                            posicion_x--;
                            break;
                        case "%":
                            mapa[posicion_x - 1][posicion_y] = "0";
                            mapa[posicion_x][posicion_y] = "0";
                            rastreo(posicion_x + 1, posicion_y);
                            refresh_map();
                            posicion_x--;
                            puntuacion = puntuacion + 10;
                            tamaño = tamaño + 1;
                            refresh_map();
                            if(puntuacion>=100){
                                System.out.println("Felicidades");
                                 System.out.println("Ha llegado a los 100 puntos");
                                  usuarios[contador_user][0]=nombre_jugador;
                                  usuarios[contador_user][1]=fecha_de_nacimiento;
                                      contador_user++;
                                 leer.next();
                                  menu();
                            }
                            break;
                        case "$":
                            mapa[posicion_x - 1][posicion_y] = "0";
                            rastreo((posicion_x + 1) - tamaño, posicion_y);
                            refresh_map();
                            posicion_x--;
                            puntuacion = puntuacion - 10;
                            tamaño--;
                            refresh_map();
                            break;
                        default:
                            break;
                    }
                            break;
                        case "d":
                    switch (mapa[posicion_x + 1][posicion_y]) {
                        case " ":
                            mapa[posicion_x + 1][posicion_y] = "0";
                            rastreo((posicion_x + 1) - tamaño, posicion_y);
                            posicion_x++;
                            refresh_map();
                            break;
                        case "%":
                            mapa[posicion_x + 1][posicion_y] = "0";
                            mapa[posicion_x][posicion_y] = "0";
                            rastreo(posicion_x - 1, posicion_y);
                            posicion_x++;
                            puntuacion = puntuacion + 10;
                            tamaño = tamaño + 1;
                            refresh_map();
                            if(puntuacion>=100){
                                System.out.println("Felicidades");
                                 System.out.println("Ha llegado a los 100 puntos");
                                  usuarios[contador_user][0]=nombre_jugador;
                                  usuarios[contador_user][1]=fecha_de_nacimiento;
                                      contador_user++;
                                 leer.next();
                                  menu();
                            }
                            break;
                        case "$":
                            mapa[posicion_x + 1][posicion_y] = "0";
                            rastreo((posicion_x + 1) - tamaño, posicion_y);
                            refresh_map();
                            posicion_x++;
                            puntuacion = puntuacion - 10;
                            tamaño--;
                            refresh_map();
                            break;
                        default:
                            break;
                    }
                            break;
                        case "s":
                    switch (mapa[posicion_x][posicion_y + 1]) {
                        case " ":
                            mapa[posicion_x][posicion_y + 1] = "0";
                            rastreo((posicion_x), (posicion_y + 1) - tamaño);
                            refresh_map();
                            posicion_y++;
                            break;
                        case "%":
                            mapa[posicion_x][posicion_y + 1] = "0";
                            mapa[posicion_x][posicion_y] = "0";
                            rastreo(posicion_x, posicion_y - 1);
                            posicion_y++;
                            puntuacion = puntuacion + 10;
                            tamaño = tamaño + 1;
                            refresh_map();
                            if(puntuacion>=100){
                                System.out.println("Felicidades");
                                 System.out.println("Ha llegado a los 100 puntos");
                                  usuarios[contador_user][0]=nombre_jugador;
                                  usuarios[contador_user][1]=fecha_de_nacimiento;
                                      contador_user++;
                                 leer.next();
                                 menu();
                            }
                            break;
                        case "$":
                            mapa[posicion_x][posicion_y + 1] = "0";
                            rastreo((posicion_x) - tamaño, posicion_y - 1);
                            refresh_map();
                            posicion_y++;
                            puntuacion = puntuacion - 10;
                            tamaño--;
                            refresh_map();
                            break;
                        default:
                            break;
                    }
                            break;
                        case "w":
                    switch (mapa[posicion_x][posicion_y - 1]) {
                        case " ":
                            mapa[posicion_x][posicion_y - 1] = "0";
                            rastreo((posicion_x), posicion_y - 1 + tamaño);
                            refresh_map();
                            posicion_y--;
                            break;
                        case "%":
                            mapa[posicion_x][posicion_y - 1] = "0";
                            mapa[posicion_x][posicion_y] = "0";
                            rastreo(posicion_x, posicion_y + 1);
                            posicion_y--;
                            puntuacion = puntuacion + 100;
                            tamaño = tamaño + 1;
                            refresh_map();
                            if(puntuacion>=100){
                                System.out.println("Felicidades");
                                 System.out.println("Ha llegado a los 100 puntos");
                                 usuarios[contador_user][0]=nombre_jugador;
                                  usuarios[contador_user][1]=fecha_de_nacimiento;
                                      contador_user++;
                                 leer.next();
                                  menu();
                            }
                            break;
                        case "$":
                            mapa[posicion_x][posicion_y - 1] = "0";
                            rastreo((posicion_x) - tamaño, posicion_y + 1);
                            refresh_map();
                            posicion_y--;
                            puntuacion = puntuacion - 10;
                            refresh_map();
                            break;
                        default:
                            break;
                    }

                            break;
                        case "m":
                            menu();
                            ciclo = false;
                            break;
                    }
                    if(puntuacion==0){
                    System.out.println("Usted ha perdido");
                     usuarios[contador_user][0]=nombre_jugador;
                                  usuarios[contador_user][1]=fecha_de_nacimiento;
                                  contador_user++;
                    leer.next();
                      ciclo = false;
                     mapa();
                    menu();
                   
                    }
                }
            case "3":
                try{
               for(int cont=0;cont<=contador_user;cont++)
               {
                   if(!usuarios[cont][0].equals("null"))
                   {
               System.out.println("Nombre:"+ usuarios[cont][0]+ "  fecha de nacimiento: "+usuarios[cont][1]);
                   
                   
                   }
               }}
                catch(Exception e){
                System.out.println("Presione cualquier tecla para continuar");
                leer.next();
                menu();
                }
                break;
            case "4":
                System.exit(0);
                break;
            default:
                System.out.println("");
                System.out.println("Opcion no valida porfavor intente de nuevo");
                menu();
        }
    }
}
