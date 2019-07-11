package springpaket;

public class ProfesorLikovnog implements Profesor {
	
	private String ime;
	
	private Predmet predmet;
	
	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	
	@Override
	public String pozdrav() {
		return "Poz od: "  +ime;
	}
	
	@Override
	public String dajMiPredmetKojiPredajem() {
		return predmet.mojPredmet(predmet.getImePredmeta());
	}

}
