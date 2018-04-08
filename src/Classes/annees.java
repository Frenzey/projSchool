package Classes;

public class annees {
	private int idAnnee;
	private String nomAnnee;
	
	private annees(int idAnnee, String nomAnnee) {
		super();
		this.idAnnee = idAnnee;
		this.nomAnnee = nomAnnee;
	}

	private int getIdAnnee() {
		return idAnnee;
	}

	private void setIdAnnee(int idAnnee) {
		this.idAnnee = idAnnee;
	}

	private String getNomAnnee() {
		return nomAnnee;
	}

	private void setNomAnnee(String nomAnnee) {
		this.nomAnnee = nomAnnee;
	}
	
	
}
