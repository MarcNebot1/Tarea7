package Tarea7;

import java.util.ArrayList;


import java.util.Hashtable;

import javax.swing.JOptionPane;


public class Tarea7_Main {

	public static void main(String[] args) {
		
		Hashtable<String,Float> llista=new Hashtable<String,Float>();
		
		
		ArrayList<Float> lista=new ArrayList<Float>();
		int numalumnes=0;
		
		while(numalumnes<=2) {
		   
		   String nom =JOptionPane.showInputDialog("Introduce nombre del alumno: ");
		
		   for(int i=0;i<=4;i++) {
		   String nota =JOptionPane.showInputDialog("Introduce nota del alumno: ");
		   float not=Float.parseFloat(nota);
		   lista.add(not);
		   }  
		       float media= Tarea7_Class.media(lista);
		       
		       lista.clear();
		
		       llista.put(nom,media);
		
		       System.out.println(llista.toString());
		       
		numalumnes++;
		}
		
	   
	}

}
