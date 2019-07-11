package springpaket;

public class ProfesorMatematike implements Profesor{
	
	private String ime;
	
	private Predmet predmet;
	
/*	public ProfesorMatematike() {
		//prazan kostruktor (no arg constructor)
	}   */
	
	public ProfesorMatematike(Predmet predmet) {
		this.predmet = predmet;
	} //konstruktor koji ima samo predmet
	
	public ProfesorMatematike(Predmet predmet, String ime) {
		this.predmet = predmet;
		this.ime = ime;
	}// full constructor
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	
	@Override
	public String pozdrav() {
		return "Poz od: " + this.ime;
	}

	@Override
	public String dajMiPredmetKojiPredajem() {
		return predmet.mojPredmet(predmet.getImePredmeta());
	}
	
	

}
