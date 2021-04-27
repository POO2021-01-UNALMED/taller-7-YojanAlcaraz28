package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen,String titulo,String autor,int paginas,String ensenanza, String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
		
	}

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int palabrasTotales) {
		return palabrasTotales*1*getPaginas();
	}

	/*@Override
	String interpretacion() {
		return null;
	}*/

	@Override
	/*public String toString() {
		return null;
	}*/
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		return "" + getOrigen()+
				"\n" + getTitulo()+
				"\n" + getAutor()+
				"\n" + getPaginas()+
				"\n" + getEnsenanza()+ "";
				
	}

}
