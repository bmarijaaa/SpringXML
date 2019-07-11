package springpaket;

public class Predmet {
	
	private String imePredmeta;
	
	public String getImePredmeta() {
		return imePredmeta;
	}

	public void setImePredmeta(String imePredmeta) {
		this.imePredmeta = imePredmeta;
	}



	public String mojPredmet(String imePredmeta) {
		return "Ja predajem: " + imePredmeta;
	}
	
}
