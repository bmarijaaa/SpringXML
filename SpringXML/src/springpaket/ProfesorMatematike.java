package springpaket;

public class ProfesorMatematike implements Profesor{
	
	private String ime;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	
	@Override
	public String pozdrav() {
		return "Poz od profesora matematike!";
	}
	
	

}
