package ejercicio2.Controller;
import ejercicio2.model.*;

import java.util.ArrayList;

/**
 * 
 * Programación Orientada a Objetos
 * Profesor: Moises ALonso
 * Sección: 30
 * Ejercicio 2.Arreglos de Objetos
 * @author Bianca Calderón
 *
 */

import java.util.Scanner;
//import java.util.ArrayList;
public class HTC {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
			
        Familias familia = new Familias(null, 0, false); //creamos nueva familia
        Perro can = new Perro(null, null, null, null, 0, 0); //creamos nuevo perro
	    Scanner in = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; //Para guardar la opción

	        while (!salir) {
	        	
	        	System.out.println("1. Agregar perro nuevo");
	        	System.out.println("2. Agregar Familia");
	            System.out.println("3. Asignar perro a Familia");
	            System.out.println("4. Salir");
	       
	            try { 
	 
	                System.out.println("Elige la opción a seguir");
	                opcion = in.nextInt();
	 
	                if (opcion==1) {//Agregar Perro
	                	System.out.println("Seleccionaste la opcion 1");
  	                	System.out.println("Inserte el nombre del perro: ");
  	                	String Name = scan.nextLine();
  	                	
  	                	System.out.println("Inserte la raza del perro: ");
  	                	String Raza = scan.nextLine();
  	                	
  	                	System.out.println("Inserte el color del perro: ");
  	                	String Color = scan.nextLine();
  	                	
  	                	System.out.println("Inserte el tamano del perro: ");
  	                	String tamano = scan.nextLine();
  	                	
  	                	System.out.println("Inserte la edad del perro: ");
  	                	int Edad = Integer.parseInt(scan.nextLine()); //recuperado de: https://stackoverflow.com/questions/26586489/integer-parseintscanner-nextline-vs-scanner-nextint
  	                	
  	                	System.out.println("Inserte la salud del perro: ");
  	                	int Salud = Integer.parseInt(scan.nextLine());
  	                	can = new Perro(Name, Raza, Color, tamano, Edad, Salud);
  	                	ArrayList<String> Perrera = new ArrayList<String>();
  	                	Perrera.add(Name);
  	                	Perrera.add(Raza);
  	                	Perrera.add(Color);
  	                	Perrera.add(tamano);
  	                	Perrera.add(String.valueOf(Edad));
  	                	Perrera.add(String.valueOf(Salud)); //Recuperado de: https://emirodgar.com/pasar-de-int-a-string-y-de-string-a-int-en-java
  	                	System.out.println("Perro agregado");
  	                	//break;
	                	
	                	
	                }
	                	else if (opcion==2) {//Agregar familia
	                		System.out.println("Seleccionaste la opcion 2");
		                	//familia = new Familias()
		                	System.out.println("Inserte los apellidos de la familia: ");
		                	String Apellidos = scan.nextLine();
		                	
	                    	System.out.println("Inserte la cantidad de miembros en la familia: ");
		                	int Miembros = Integer.parseInt(scan.nextLine());
		                	
		                	System.out.println("Tiene hijos? ");
		                	boolean Hijos = scan.nextBoolean();// Recuperado de: http://ayudaitver.blogspot.com/2014/06/lectura-por-teclado-uso-basico-de-el.html
		                
		                	System.out.println("Familia Agregada");
		                	familia = new Familias(Apellidos, Miembros, Hijos);
		                	ArrayList<String> misFamilia = new ArrayList<String>();
		                	misFamilia.add(Apellidos);
		                	misFamilia.add(String.valueOf(Hijos));
		                	misFamilia.add(String.valueOf(Miembros));
		                	
	                	}
	                	else if (opcion==3) {//Asignar perro a familia
	  	                	System.out.println("Seleccionaste la opcion 3");
	  	                	 //Si hijos = false
	  	                	familia.EdadHijos();
	  	                	familia.edad();
	  	                	can.razasPeligrosas();
	  	            
	  	                	break;
	  	                	}
	  	              
	                	else if (opcion==4) {//Salir
	  	                	System.out.println("Gracias por visitarnos! :)");
	  	                	salir = true;
                            break; 
	        }
	            }finally{
	        }
	}
	}
}

