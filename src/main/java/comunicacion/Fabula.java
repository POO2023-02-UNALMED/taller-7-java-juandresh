package comunicacion;

public class Fabula extends Escrito{
	
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
		
	public String getEnseñanza() {
		return this.ensenanza;
	}
	public void setEnseñanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		return (this.getOrigen()+"\n"+
				this.getTitulo()+"\n"+
				this.getAutor()+"\n"+
				this.getPaginas()+"\n"+
				this.ensenanza);
	}
	
	public int palabrasTotales(int pi) {
		return (this.getPaginas()*pi); 
	}
}
