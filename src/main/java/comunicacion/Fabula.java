package comunicacion;

public class Fabula extends Escrito{
	
	private String enseñanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String enseñanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.enseñanza = enseñanza;
		this.interpretacion = interpretacion;
	}
		
	public String getEnseñanza() {
		return this.enseñanza;
	}
	public void setEnseñanza(String enseñanza) {
		this.enseñanza = enseñanza;
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
}
