/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_201504482;


import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 *
 * @author Jimbo
 */
public class Principal extends javax.swing.JFrame {
//Se Declaran las variables globales que se utilizaran en la ventana principal
    Aviones aviones = new Aviones();
    Pasajeros pasajeros = new Pasajeros();
    Servicios estaciones = new Servicios();
    Aviones reparacion = new Aviones();
    Aviones ventanillas = new Aviones();
    JLabel[] filas;
    JScrollPane[] contenedores;
    Pasajeros[] pasa=new Pasajeros[5];
    int contadora_turnos;
    int contador_pasajeros;
    int contador_servicio;
    int contador_turnos;
String mensaje="";
    public Principal() throws IOException {

        initComponents();
        contadora_turnos = 1;
        contador_pasajeros = 1;
        contador_servicio = 1;
        File graf = new File("archivo_avion.png");
        graf.delete();
        File graf2 = new File("archivo_pasajeros.png");
        graf.delete();
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        label_pasajeros = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        label_ventanillas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        label_servicios = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        label_aviones_servicio = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Pasar Turno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jScrollPane2.setViewportView(jLabel1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Numero de Aviones");

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Aviones");

        jLabel4.setText("Pasajeros");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jScrollPane1.setViewportView(label_pasajeros);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setForeground(new java.awt.Color(153, 153, 255));

        jScrollPane3.setViewportView(label_ventanillas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Escritorio de Registros");

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setForeground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        jLabel6.setText("Filas de Pasajeros");

        jPanel8.setBackground(new java.awt.Color(204, 255, 51));

        jScrollPane8.setViewportView(label_servicios);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setText("Mantenimiento");

        jPanel9.setBackground(new java.awt.Color(102, 255, 51));

        jScrollPane9.setViewportView(label_aviones_servicio);

        jScrollPane5.setViewportView(jScrollPane9);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Numero de Estaciones de Servicio");

        jLabel9.setText("Numero de Ventanillas");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel3)
                        .addGap(164, 164, 164)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(252, 252, 252)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(192, 192, 192)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(27, 27, 27)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(jTextField3)))
                                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(109, 109, 109)
                                            .addComponent(jLabel7))
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Se manda a llamar al evento que refresca las imagenes en los labels
        refrescar();
        try {
            //se llena el mensaje que se mostrara en consola
            mensaje=mensaje+"Turno: "+contador_turnos+"\n\n";
            try {
                if (!aviones.estavacio()) {
                    //Se Pregunta la dimension del avion
                    switch (aviones.ultimo.tamaño) {
                        case "1":
                            //se encola en el area de servicio
                            reparacion.alta(aviones.ultimo.dato, valor_random(3, 1), aviones.ultimo.tamaño);
                            reparacion.servicio();
                            mensaje=mensaje+"\n"+"Arribo Avion: "+aviones.ultimo.dato+"\n"+"Tamaño: Pequeño"+"\n"+"Numero de Pasajeros:"+aviones.ultimo.pasajeros+"\n"+"Estacion de Servicio: Avion:"+aviones.ultimo.dato;
                            //Se elimina de la cola el avion
                            aviones.delete(aviones.ultimo.dato);
                            //Se manda a escribir el documento para la grafica
                            aviones.imprimir();
                            System.out.println("El tamaño es pequeño");
                            //Se encolan los pasajeros
                            for (int con = 0; con < aviones.ultimo.pasajeros; con++) {
                                pasajeros.addLast(contador_pasajeros, valor_random(10, 1), valor_random(4, 1), valor_random(3, 1));
                                contador_pasajeros++;
                            }
                            //Se manda a escribir el documento para la grafica
                            pasajeros.imprimir();
                           
                            break;
                        case "2":
                            if (contadora_turnos == 2) {
                                reparacion.alta(aviones.ultimo.dato, valor_random(3, 1), aviones.ultimo.tamaño);
                                reparacion.servicio();
                                mensaje=mensaje+"\n"+"Arribo Avion: "+aviones.ultimo.dato+"\n"+"Tamaño: Mediano"+"\n"+"Numero de Pasajeros:"+aviones.ultimo.pasajeros+"\n"+"Estacion de Servicio: Avion:"+aviones.ultimo.dato;
                                aviones.delete(aviones.ultimo.dato);
                                aviones.imprimir();
                                System.out.println("El tamaño es mediano");
                                contadora_turnos = 0;
                                for (int con = 0; con < aviones.ultimo.pasajeros; con++) {
                                    pasajeros.addLast(contador_pasajeros, valor_random(10, 1), valor_random(4, 1), valor_random(3, 1));
                                    contador_pasajeros++;
                                }
                            }
                            contadora_turnos++;
                            pasajeros.imprimir();
                          
                            break;
                        case "3":
                            if (contadora_turnos == 3) {
                                reparacion.alta(aviones.ultimo.dato, valor_random(3, 1), aviones.ultimo.tamaño);
                                reparacion.servicio();
                               mensaje=mensaje+"\n"+"Arribo Avion: "+aviones.ultimo.dato+"\n"+"Tamaño: Grande"+"\n"+"Numero de Pasajeros:"+aviones.ultimo.pasajeros+"\n"+"Estacion de Servicio: Avion:"+aviones.ultimo.dato;
                                aviones.delete(aviones.ultimo.dato);
                                aviones.imprimir();
                                contadora_turnos = 0;
                                for (int con = 0; con < aviones.ultimo.pasajeros; con++) {
                                    pasajeros.addLast(contador_pasajeros, valor_random(10, 1), valor_random(4, 1), valor_random(3, 1));
                                    contador_pasajeros++;
                                }
                                System.out.println("El tamaño es grande");
                            }
                            contadora_turnos++;
                            break;
                        default:
                            break;
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e) {
                jLabel1.setText("No hay aviones");
            }
            try {
                if (aviones.estavacio()) {
                    //Si esta vacio deja de desencolar aviones
                    jLabel1.setText("No hay aviones");
                    jLabel1.setIcon(null);
                } else {
                    //manda a graficar la pila de aviones
                    dibujar("archivo_avion");
                    ImageIcon ico = new ImageIcon("archivo_avion.png");
                    ico.getImage().flush();
                    jLabel1.setIcon(ico);
                    dibujar("archivo_pasajeros");
                    ImageIcon ico_pasajeros = new ImageIcon("archivo_pasajeros.png");
                    ico_pasajeros.getImage().flush();
                    label_pasajeros.setIcon(ico_pasajeros);
                    dibujar("archivo_avion_servicio");
                    ImageIcon ico_avion_servicio = new ImageIcon("archivo_avion_servicio.png");
                    ico_avion_servicio.getImage().flush();
                    label_aviones_servicio.setIcon(ico_avion_servicio);
                }
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
        finally{
        contador_turnos++;
        jTextArea1.setText(mensaje);
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
filas=new JLabel[Integer.parseInt(jTextField3.getText())];        
contenedores= new JScrollPane[Integer.parseInt(jTextField3.getText())];
//Manda a dibujar la grafica de los pasajeros
        dibujar("archivo_pasajeros");
        int tipo, pasajeros = 0;
        Random rn = new Random();
        int range;
        //Llena la lista de aviones con sus datos correspondientes
        for (int cont = 1; cont <= Integer.parseInt(jTextField1.getText()); cont++) {
            tipo = (int) (Math.random() * 3) + 1;
            switch (tipo) {
                case 1:
                    range = 10 - 5 + 1;
                    pasajeros = rn.nextInt(range) + 5;
                    break;
                case 2:
                    range = 25 - 15 + 1;
                    pasajeros = rn.nextInt(range) + 15;
                    break;
                case 3:
                    range = 40 - 30 + 1;
                    pasajeros = rn.nextInt(range) + 30;
                    break;
                default:
                    break;
            }
            aviones.alta(cont, pasajeros, tipo + "");
        }
        try {
            aviones.imprimir();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Manda a dibujar la grafica de los aviones
        dibujar("archivo_avion");
        ImageIcon ico = new ImageIcon("archivo_avion.png");
        ico.getImage().flush();
        jLabel1.setIcon(ico);
        //Llena la cola de las estaciones de servicio
        for (int a = 1; a <= Integer.parseInt(jTextField2.getText()); a++) {
            estaciones.addLast(a);
        }
        //Llena la cola de las ventanillas
        for (int a = 1; a <= Integer.parseInt(jTextField3.getText()); a++) {
            ventanillas.alta(a, 0, null);
            mensaje=mensaje+"Ventanilla: "+ventanillas.primero.dato+" Libre\n";
        }
       for(int a=0;a<Integer.parseInt(jTextField3.getText());a++){
        filas[a]=new JLabel();
       
        filas[a].setIcon(new ImageIcon("archivo_ventanillas.png"));
        
       filas[a].setBounds(1, 1, 100, 100);
       contenedores[a]=new JScrollPane();
       contenedores[a].setViewportView(filas[a]);
       contenedores[a].setBounds(a*100, 5, 100, 100);
         jPanel4.add(contenedores[a]);
        }
    
  jPanel4.repaint();
        try {
            estaciones.imprimir();
            ventanillas.ventanillas();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
      //Manda a dibujar las graficas de Ventanillas y Servicios
        dibujar("archivo_ventanillas");
        dibujar("archivo_Servicios");
        refrescar();
  
    }//GEN-LAST:event_jButton2ActionPerformed
 
     
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Principal().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
   //Este metodo regresa un valor random en el rango que se le de
    public int valor_random(int maximo, int minimo) {
        int valor;
        Random rn = new Random();
        int range = maximo - minimo + 1;
        valor = rn.nextInt(range) + minimo;
        return valor;
    }
    //Es el metodo que grafica las listas
    public static void dibujar(String tipo) {
        try {
            ProcessBuilder pbuilder;
            pbuilder = new ProcessBuilder("dot", "-Tpng", tipo + ".dot", "-o", tipo + ".png");
            pbuilder.redirectErrorStream(true);
            //Ejecuta el proceso
            pbuilder.start();
        } catch (Exception e) {
        }
    }
//Este metodo refresca las imagenes de los Labels
    public static void refrescar() {
try{
        ImageIcon ico_servicios = new ImageIcon("archivo_Servicios.png");
        ico_servicios.getImage().flush();
        label_servicios.setIcon(ico_servicios);
        ImageIcon ico_ventanillas = new ImageIcon("archivo_ventanillas.png");
        ico_ventanillas.getImage().flush();
        label_ventanillas.setIcon(ico_ventanillas);
}catch(Exception e){}
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private static javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel label_aviones_servicio;
    private javax.swing.JLabel label_pasajeros;
    private static javax.swing.JLabel label_servicios;
    private static javax.swing.JLabel label_ventanillas;
    // End of variables declaration//GEN-END:variables
}
