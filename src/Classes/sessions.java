package Classes;

import java.util.Date;

public class sessions {

	private	int idSession;
	private int idAnnee;
	private String libelSession;
	private Date dateDebutSession;
	private Date dateFinSession;
	private jours joursFerieSession;
	
	private sessions(int idSession, int idAnnee, String libelSession, Date dateDebutSession, Date dateFinSession,
			jours joursFerieSession) {
		super();
		this.idSession = idSession;
		this.idAnnee = idAnnee;
		this.libelSession = libelSession;
		this.dateDebutSession = dateDebutSession;
		this.dateFinSession = dateFinSession;
		this.joursFerieSession = joursFerieSession;
	}

	private int getIdSession() {
		return idSession;
	}

	private void setIdSession(int idSession) {
		this.idSession = idSession;
	}

	private int getIdAnnee() {
		return idAnnee;
	}

	private void setIdAnnee(int idAnnee) {
		this.idAnnee = idAnnee;
	}

	private String getLibelSession() {
		return libelSession;
	}

	private void setLibelSession(String libelSession) {
		this.libelSession = libelSession;
	}

	private Date getDateDebutSession() {
		return dateDebutSession;
	}

	private void setDateDebutSession(Date dateDebutSession) {
		this.dateDebutSession = dateDebutSession;
	}

	private Date getDateFinSession() {
		return dateFinSession;
	}

	private void setDateFinSession(Date dateFinSession) {
		this.dateFinSession = dateFinSession;
	}

	private jours getJoursFerieSession() {
		return joursFerieSession;
	}

	private void setJoursFerieSession(jours joursFerieSession) {
		this.joursFerieSession = joursFerieSession;
	}
	
	
	
}
