package Tarea7_2;


import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Tarea7_2 {

	public static void main(String[] args) {
		
		
		Hashtable<String,Integer> llistarticle= new Hashtable();
		Hashtable<String,Integer> llistarticle1=new Hashtable();
		 
		 llistarticle.put("iva",21); //iva
		 llistarticle.put("Precio bruto",2); //precio bruto
		 llistarticle.put("IVA incluido",3);  //precio iva
		 llistarticle.put("numart",10);  //numero articulos
		 llistarticle.put("cantidad",8); //cantidad
		 llistarticle.put("cambio",1);  //cambio

		 llistarticle1.put("iva",22); //iva
		 llistarticle1.put("Precio bruto",4); //precio bruto
		 llistarticle1.put("IVA inclu",2);  //precio iva
		 llistarticle1.put("numart",30);  //numero articulos
		 llistarticle1.put("cantidad",33); //cantidad
		 llistarticle1.put("cambio",23);  //cambio
		
		 Hashtable[] hashArray= {llistarticle,llistarticle1};
		
		 for(int i = 0; i<hashArray.length; i++){
	         System.out.println(hashArray[i]);
	      }
	}
		   
}

