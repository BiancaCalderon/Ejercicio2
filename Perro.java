package ejercicio2.model;
//import ejercicio2.Controller.*;
import java.util.ArrayList;

public class Perro {
	private String Name;
	private String Raza;
	private String Color;
	private String Tamano;
	private int Edad;
	private int Salud;
    public ArrayList<String> razasPeligrosas;
//Cosntructor
public Perro(String name,String raza, String color, String tamano, int edad, int salud ) {
this.Name = name;
this.Raza = raza;
this.Color = color;
this.Tamano = tamano;
this.Edad = edad;
this.Salud = salud;
this.razasPeligrosas =  new ArrayList<String>();

//Agregamos todas las razas peligrosas posibles
razasPeligrosas.add("Pit bull terrier");
razasPeligrosas.add("American Staffordshire terrier");
razasPeligrosas.add("Tosa Inu");
razasPeligrosas.add("Dogo Argentino");
razasPeligrosas.add("Dogo Guatemalteco");
razasPeligrosas.add("Fila brasileño");
razasPeligrosas.add("Presa canario");
razasPeligrosas.add("Dóberman");
razasPeligrosas.add("Gran perro japonés");
razasPeligrosas.add("Mastín napolitano");
razasPeligrosas.add("Presa Mallorqui");
razasPeligrosas.add("Dogo de burdeos");
razasPeligrosas.add("Bullmastiff");
razasPeligrosas.add("Bull terrier inglés");
razasPeligrosas.add("Bulldog americano");
razasPeligrosas.add("Rhodesiano");
razasPeligrosas.add("Rottweiler");
}

//Getters

public  ArrayList<String> getrazasPeligrosas() {
	return this.razasPeligrosas;
}

/**
 * @param set razas
 */
public void setrazasPeligrosas(ArrayList<String> razas) {
	this.razasPeligrosas = razas;
}

/**
 * Verficar que la raza se encuentre en la lista
 * @param _razaRaza
 * @return
 */
//public boolean Verrazas(String _pRaza) {
	
	//for (String searchString: razasPeligrosas) {
		//if (searchString.getRaza().toUpperCase().equals(_pRaza.getRaza.toUpperCase())) {
			//return true;
		//}
	//}
	
	//return false;
//}
/**
 * Obtenemos que nombre se le asigna al perro
 * @return nombre del perro
 */
public String getname() {
	return Name;
}
/**
 * Asignamos la raza, si no se sabe se coloca que es Mestizo
 * @return regresa la raza del perro
 */
public String getraza() {
	return Raza;
}
/**
 * Preguntamos por el color del perro
 * @return regresa el color
 */
public String getcolor() {
	return Color;
}
/**
 * Preguntamos el tamaño
 * @return regresa el tamaño, grande si nos indicaron que hijos=false
 */
public String gettamano() {
	return Tamano;
}
/**
 * preguntamos por la edad del perro
 * @return la edad actual del perro
 */
public int getedad() {
	return Edad;
}
/**
 * preguntamos por las condiciones del perro
 * @return la salud actual del perro
 */
public int getsalud() {
	return Salud;

}
public ArrayList<String> razasPeligrosas() {
	return razasPeligrosas;
}

/**
 * Verificamos si la raza existe en la lista
 * @param _nameRaza el nombre de la raza
 * @return true si se encuentra en la lista, false de no ser asi
 */
/**public boolean recordExists(String _nameRaza) {
	
	for (String searchString: razasPeligrosas) {
		if (searchString.getrazaPeligrosas().toUpperCase().equals(_nameRaza.toUpperCase())) {
			return true;
		}
	}
	
	return false;
*/
//}
{
}
}




