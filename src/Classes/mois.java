package Classes;

public class mois {
	private int idMois;
	private String nomMois;
	
	private mois(int idMois, String nomMois) {
		super();
		this.idMois = idMois;
		this.nomMois = nomMois;
	}
	private int getIdMois() {
		return idMois;
	}
	private void setIdMois(int idMois) {
		this.idMois = idMois;
	}
	private String getNomMois() {
		return nomMois;
	}
	private void setNomMois(String nomMois) {
		this.nomMois = nomMois;
	}
	
	
}
