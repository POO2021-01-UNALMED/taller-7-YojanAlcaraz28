package comunicacion;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		/*ArrayList<String> lista1 = new ArrayList<String>();
		lista1.add("a");
		lista1.add("b");
		lista1.add("c");
		
		String a = "";
		for(String i : lista1) {
			a +=  i + ", ";
		}
		System.out.println(a);*/
		
		Fabula fabula = new Fabula("pensamiento", "La tortuga y la liebre", "Esopo", 2, 
				"no se debe uno burlar de los demas, ni presumir o ser vanidoso", "Cuento corto");
		Periodico periodico = new Periodico("Investigacion", "Se encontro la solucion", "Colombiano", 6, "20/12/2020", "Cura del covid", "Escrito informativo");
		
		Alfabeto alfabeto = new Alfabeto("alfabeto griego, occidente",
				new String [] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
				"Alfabeto latino");
		Libro libro = new Libro("Creacion", "El resplandor", "Stephen King", 599, "N/A", "Doubleday", "Primera", "Escrito largo");
		Tesis tesis = new Tesis("Pensamiento expansivo", "Recomendador", "Alejandro", 20, "Recomendar asignaturas", new String [] {"Primero", "Segundo"},
				"Se hace trabajo futuro", "[1] Maquinaria",  "Escrito investigativo");
		
		//System.out.println(fabula.toString());
		//System.out.println(periodico.toString());
		//System.out.println(alfabeto.toString());
		//System.out.println(libro.toString());
		//System.out.println(fabula.interpretacion());
		//System.out.println(libro.palabrasTotales(140));
		System.out.println(tesis.toString());
		//System.out.println(tesis.getArgumentos());
		
		String comp = "pensamiento\n" +
				"La tortuga y la liebre\n" + 
				"Esopo\n" + 
				"2\n" + 
				"no se debe uno burlar de los demas, ni presumir o ser vanidoso";
		
		//System.out.println(comp);
		

	}
	
	
	
	
	

}
