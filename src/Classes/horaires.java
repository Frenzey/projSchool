package Classes;

public class horaires {
	private int idHoraire;
    private int	idSession;
	private int idJours;
	private int idDebut;
	private int idFin;
	private String libelHoraire;
	
	private horaires(int idHoraire, int idSession, int idJours, int idDebut, int idFin, String libelHoraire) {
		super();
		this.idHoraire = idHoraire;
		this.idSession = idSession;
		this.idJours = idJours;
		this.idDebut = idDebut;
		this.idFin = idFin;
		this.libelHoraire = libelHoraire;
	}

	private int getIdHoraire() {
		return idHoraire;
	}

	private void setIdHoraire(int idHoraire) {
		this.idHoraire = idHoraire;
	}

	private int getIdSession() {
		return idSession;
	}

	private void setIdSession(int idSession) {
		this.idSession = idSession;
	}

	private int getIdJours() {
		return idJours;
	}

	private void setIdJours(int idJours) {
		this.idJours = idJours;
	}

	private int getIdDebut() {
		return idDebut;
	}

	private void setIdDebut(int idDebut) {
		this.idDebut = idDebut;
	}

	private int getIdFin() {
		return idFin;
	}

	private void setIdFin(int idFin) {
		this.idFin = idFin;
	}

	private String getLibelHoraire() {
		return libelHoraire;
	}

	private void setLibelHoraire(String libelHoraire) {
		this.libelHoraire = libelHoraire;
	}
	
	
	
}
