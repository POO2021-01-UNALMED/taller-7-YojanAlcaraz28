package comunicacion;

import java.util.ArrayList;


public class Alfabeto extends Pictograma{
	/*private static ArrayList<Alfabeto> letras = new ArrayList<Alfabeto>();*/
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen,String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
		
	}
	
	
	/*public static ArrayList<Alfabeto> getLetras() {
		return letras;
	}



	public static void setLetras(ArrayList<Alfabeto> letras) {
		Alfabeto.letras = letras;
	}*/



	public String getInterpretacion() {
		return interpretacion;
	}



	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}



	public int cantidadLetras() {
		return letras.length;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String a = "";
		String b = "";
		for(String i : letras) {
			a +=  i + ", ";
			b = a.substring(0, a.length()-2);
		}
		return b;
	}

}
