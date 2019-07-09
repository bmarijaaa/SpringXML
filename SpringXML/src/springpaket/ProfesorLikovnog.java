package springpaket;

public class ProfesorLikovnog implements Profesor {
	
	private String ime;
	
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	
	@Override
	public String pozdrav() {
		return "Poz od Pikasa!";
	}

}
