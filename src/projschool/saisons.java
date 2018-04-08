package project;

public class saisons {
	private int idSaison;
	private String nomSaison;
	
	private saisons(int idSaison, String nomSaison) {
		super();
		this.idSaison = idSaison;
		this.nomSaison = nomSaison;
	}

	private int getIdSaison() {
		return idSaison;
	}

	private void setIdSaison(int idSaison) {
		this.idSaison = idSaison;
	}

	private String getNomSaison() {
		return nomSaison;
	}

	private void setNomSaison(String nomSaison) {
		this.nomSaison = nomSaison;
	}
	
	

}
