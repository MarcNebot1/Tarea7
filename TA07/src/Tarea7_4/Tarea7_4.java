package Tarea7_4;

import java.util.Hashtable;

public class Tarea7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hashtable<String,Integer> articlesactivitat2=new Hashtable();
		Hashtable<Integer,Double> articlesactivitat3=new Hashtable<Integer,Double>();
		
		articlesactivitat2.put("iva",22); //iva
		articlesactivitat2.put("Precio bruto",4); //precio bruto
		articlesactivitat2.put("IVA inclu",2);  //precio iva
		articlesactivitat2.put("numart",30);  //numero articulos
		articlesactivitat2.put("cantidad",32); //cantidad
		articlesactivitat2.put("cambio",23);  //cambio
		
		articlesactivitat3.put(2344555,34.5);
		articlesactivitat3.put(1111111,23.4);
		articlesactivitat3.put(4564545,16.5);
		articlesactivitat3.put(6655544,45.8);
		articlesactivitat3.put(5555555,90.6);
		articlesactivitat3.put(6776454,45.2);
		articlesactivitat3.put(4554545,11.1);
		articlesactivitat3.put(8776555,14.4);
		articlesactivitat3.put(3445545,23.8);
		articlesactivitat3.put(3434334,44.8);
		
	//vamos a interactuar con las dos listas 
	//cantidad de items por el precio de estos suponiendo qe la cantidad es de un producto solo
		
		Float x=(float) (articlesactivitat2.get("numart")*articlesactivitat3.get(1111111));
		System.out.println(x);
		
		//precio bruto 
	
		
		
		
	}

	}


