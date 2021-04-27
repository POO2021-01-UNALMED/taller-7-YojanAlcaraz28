package comunicacion;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<String> lista1 = new ArrayList<String>();
		lista1.add("a");
		lista1.add("b");
		lista1.add("c");
		
		String a = "";
		for(String i : lista1) {
			a +=  i + ", ";
		}
		System.out.println(a);

	}
	
	Fabula fabula = new Fabula("pensamiento", "La tortuga y la liebre", "Esopo", 2, 
			"no se debe uno burlar de los demas, ni presumir o ser vanidoso", "Cuento corto");
	
	

}
