package Tarea7_3;

import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Tarea7_3 {

	public static void main(String[] args) {
		
		Hashtable<Integer,Double> llistarticle=new Hashtable<Integer,Double>();
		 Hashtable<Integer,Integer> llistarticlenous=new Hashtable<Integer,Integer>();
		   llistarticle.put(2344555,34.5);
		   llistarticle.put(1111111,23.4);
		   llistarticle.put(4564545,16.5);
		   llistarticle.put(6655544,45.8);
		   llistarticle.put(5555555,90.6);
		   llistarticle.put(6776454,45.2);
		   llistarticle.put(4554545,11.1);
		   llistarticle.put(8776555,14.4);
		   llistarticle.put(3445545,23.8);
		   llistarticle.put(3434334,44.8);
		   
		   
		   String numarticulos =JOptionPane.showInputDialog("Numero de articulos nuevos: ");
		   int numart=Integer.parseInt(numarticulos);
		   
		   for(int i=0;i<numart;i++) {   
		   
		   String article =JOptionPane.showInputDialog("Insertar articulos nuevos: ");
		   int articulo=Integer.parseInt(article);
		   
		   String cantidadarticle =JOptionPane.showInputDialog("Insertar cantidad articulos: ");
		   int cantidad=Integer.parseInt(cantidadarticle);
		   
		  
		   
		   llistarticlenous.put(articulo,cantidad);
		   }
		   //usario consulta a partir del codigo del producto su precio o la cantidad de articulos
		   
		   String cantidadarticlee =JOptionPane.showInputDialog("consultar article:  ");
		   
		   int codi=Integer.parseInt(cantidadarticlee);
		  
		   if (llistarticle.get(codi) != null) {
			   System.out.println("el codi es 1" +llistarticle.get(codi));  //exemple codi trobat 1111111
		   }else {
			   System.out.println("no existeix el codi del article");
		   }
		  
		  // System.out.println("no existeix aquest producte");
		   
		      Enumeration<Integer> llaves= llistarticle.keys();
		      Enumeration<Double> enumeration= llistarticle.elements();
		      while(llaves.hasMoreElements()) {
			   System.out.println(""+llaves.nextElement() +" "+ enumeration.nextElement());
			   
		      }
		    

	}


	}
