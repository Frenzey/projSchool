package project;

public class programme {
	
	private int idLecon;
	private int idSupport;
	private int idSeance;
	private int idGroupe;
	private int idHoraire;
	
	private int getIdLecon() {
		return idLecon;
	}

	private void setIdLecon(int idLecon) {
		this.idLecon = idLecon;
	}

	private int getIdSupport() {
		return idSupport;
	}

	private void setIdSupport(int idSupport) {
		this.idSupport = idSupport;
	}

	private int getIdSeance() {
		return idSeance;
	}

	private void setIdSeance(int idSeance) {
		this.idSeance = idSeance;
	}

	private int getIdGroupe() {
		return idGroupe;
	}

	private void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}

	private int getIdHoraire() {
		return idHoraire;
	}

	private void setIdHoraire(int idHoraire) {
		this.idHoraire = idHoraire;
	}

	private programme(int idLecon, int idSupport, int idSeance, int idGroupe, int idHoraire) {
		super();
		this.idLecon = idLecon;
		this.idSupport = idSupport;
		this.idSeance = idSeance;
		this.idGroupe = idGroupe;
		this.idHoraire = idHoraire;
	}

	
}
