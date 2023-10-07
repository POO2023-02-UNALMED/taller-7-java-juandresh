package comunicacion;

public class Alfabeto extends Pictograma{
	
	private static String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras= letras;
		this.interpretacion = interpretacion;
	}

	public String[] getLetras() {
		return Alfabeto.letras;
	}
	public void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}
	
	public String getInterpretacion() {
		return this.interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String interprtacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		String alf = "" + Alfabeto.letras[0]; 
		for (int i=1; i<Alfabeto.letras.length; i++){
			alf += ", " + Alfabeto.letras[i];
		}
		return alf;
	}
}
