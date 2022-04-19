package Tarea7;

import java.util.ArrayList;


public class Tarea7_Class {
	
	
public static float media(ArrayList<Float> lista) {
	
	float suma = 0;
	int numnotes=5;
	
	for(int i=0;i<=numnotes-1;i++) {
		suma=suma+lista.get(i);
	}
	 float media=suma/numnotes;
	return(media);
	 
}
	

}
