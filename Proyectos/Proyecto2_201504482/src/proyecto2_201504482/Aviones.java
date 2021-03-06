
package proyecto2_201504482;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author Jimbo
 */
public class Aviones {
    Nodo_Doble primero;
	Nodo_Doble ultimo;
	Aviones()
	{
		primero=null;
		ultimo=null;
	}

	public boolean estavacio()
	{
		if(primero==null) return true;
		else return false;
	}

	public Aviones alta(int dat,int pasajeros,String tamaño)
	{
		if(estavacio())
		{
			Nodo_Doble nuevo=new Nodo_Doble(dat,pasajeros,tamaño);
			primero=nuevo;
			ultimo=nuevo;
		}
		else
		{
			Nodo_Doble nuevo=new Nodo_Doble(dat,pasajeros,tamaño);
			ultimo.next=nuevo;
			nuevo.ant=ultimo;
			ultimo=nuevo;
		}
		return this;
	}

	public Aviones borrar(int a)
	{
		Nodo_Doble w=primero;
		Nodo_Doble y;
		for(int i=0;i<a;i++)
		{
			y=w.ant;
			w=w.next;
		}
		y=w.ant;
		return this;
	}

	public boolean delete(int num)
	{
            try{
		Nodo_Doble anterior=null;
		Nodo_Doble actual=primero;
		while(actual!=ultimo)
		{
			if(actual.dato==num)
			{
				if(anterior==null)
				{
					primero=actual.next;
					primero.ant=null;
				}
				else{
					anterior.next=actual.next;
					Nodo_Doble temporal;
					temporal=actual.next;
					temporal.ant=anterior;
				}
				return true;
			}
			anterior=actual;
			actual=actual.next;
		}
		if(num==ultimo.dato)
		{
			ultimo=actual.ant;
			return true;
		}
            }
            catch(Exception e){
            
            }
		return false;
	}
        public Nodo_Doble retornar(){
        return ultimo;
        }

        public void imprimir2()
	{
           
           
		Nodo_Doble actual;
		actual=ultimo;
                
		while(actual!=primero)
		{
                  
			System.out.println(actual.dato);
			actual=actual.ant;
                        
  
		}
                  
                System.out.println(actual.dato);

	}
        public void imprimir() throws FileNotFoundException, IOException
	{
            try{
             File fout = new File("archivo_avion.dot");
FileOutputStream fos = new FileOutputStream(fout,false);

BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
  bw.write("digraph {");
		Nodo_Doble actual;
		actual=primero;
                
		while(actual!=ultimo)
		{ bw.write("Avion_"+actual.dato+"_"+actual.tamaño+"->"+"Avion_"+actual.next.dato+"_"+actual.next.tamaño);
                           bw.newLine();
                          bw.write("Avion_"+actual.next.dato+"_"+actual.next.tamaño+"->"+"Avion_"+actual.dato+"_"+actual.tamaño);
			System.out.println(actual.dato);
			actual=actual.next;
                         
      bw.newLine();
		}
               
               bw.write("Avion_"+actual.dato+"_"+actual.tamaño);
                System.out.println(actual.dato);
                  bw.write("}");
                bw.close();
            }
            catch(Exception e){}
	}
           public void servicio() throws FileNotFoundException, IOException
	{
            try{
             File fout = new File("archivo_avion_servicio.dot");
FileOutputStream fos = new FileOutputStream(fout,false);

BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
  bw.write("digraph {");
		Nodo_Doble actual;
		actual=primero;
                
		while(actual!=ultimo)
		{ bw.write("Avion_"+actual.dato+"_"+actual.tamaño+"->"+"Avion_"+actual.next.dato+"_"+actual.next.tamaño);
                           bw.newLine();
                          bw.write("Avion_"+actual.next.dato+"_"+actual.next.tamaño+"->"+"Avion_"+actual.dato+"_"+actual.tamaño);
			System.out.println(actual.dato);
			actual=actual.next;
                         
      bw.newLine();
		}
               
               bw.write("Avion_"+actual.dato+"_"+actual.tamaño);
                System.out.println(actual.dato);
                  bw.write("}");
                bw.close();
            }
            catch(Exception e)
            {
            
            }
	}
           
           
           public void ventanillas() throws FileNotFoundException, IOException
	{
            try{
             File fout = new File("archivo_ventanillas.dot");
FileOutputStream fos = new FileOutputStream(fout,false);

BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
  bw.write("digraph {rankdir=LR ");
		Nodo_Doble actual;
		actual=primero;
                
		while(actual!=ultimo)
		{ bw.write("Ventanilla_"+actual.dato+"->"+"Ventanilla_"+actual.next.dato);
                           bw.newLine();
                          bw.write("Ventanilla_"+actual.next.dato+"->"+"Ventanilla_"+actual.dato);
			System.out.println(actual.dato);
			actual=actual.next;
                         
      bw.newLine();
		}
               
               bw.write("Ventanilla_"+actual.dato);
                System.out.println(actual.dato);
                  bw.write("}");
                bw.close();}
            catch(Exception e){
            
            }
	}
}
