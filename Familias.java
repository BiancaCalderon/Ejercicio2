package ejercicio2.model;
import java.util.ArrayList;

import ejercicio2.Controller.*;
//import java.util.ArrayList;

public class Familias {
int Miembros;
boolean Hijos;
String Apellidos;

public Familias(String apellidos,int miembros, boolean hijos) {
	this.Miembros = miembros;
	this.Hijos = hijos;
	this.Apellidos = apellidos;
}
/**
* 
* @return nos indican la cantidad de miembros en la familia
*/
public int getmiembros() {
	return Miembros;
}
/**
* Verifica si tiene hijos, asi si es falso se puede asignar raza peligrosa
* @return si tiene o no hijos
*/
public boolean gethijos() {
	return Hijos;
}
/**
* Pide los apellidos, para mantener constancia de las familias
* @return los apellidos de la familia
*/
public String getapellidos() {
	return Apellidos;

}
/**
 * Pide la edad de hijos y se le asigna perro según esa edad
 * @return la edad 
 */
public void edad() {
	if (Hijos = true);	
	System.out.println("Si su hijo es menor a 10, elija un perro pequeño: ");
	
}

public void EdadHijos() {
    if(Hijos = false);
    System.out.println("Si no tiene hijos, puede elejir un perro de raza peligrosa: ");
    
	
}
}




