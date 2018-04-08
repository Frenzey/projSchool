package Classes;

public class repartition {

	private int idGroupe;
	private int idSession;
	private int idPlanning;
	private int idSalle;
	private int idModule;
	private int idInscription;
	private int idEtudiant;
	
	private int getIdGroupe() {
		return idGroupe;
	}

	private void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}

	private int getIdSession() {
		return idSession;
	}

	private void setIdSession(int idSession) {
		this.idSession = idSession;
	}

	private int getIdPlanning() {
		return idPlanning;
	}

	private void setIdPlanning(int idPlanning) {
		this.idPlanning = idPlanning;
	}

	private int getIdSalle() {
		return idSalle;
	}

	private void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}

	private int getIdModule() {
		return idModule;
	}

	private void setIdModule(int idModule) {
		this.idModule = idModule;
	}

	private int getIdInscription() {
		return idInscription;
	}

	private void setIdInscription(int idInscription) {
		this.idInscription = idInscription;
	}

	private int getIdEtudiant() {
		return idEtudiant;
	}

	private void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	private repartition(int idGroupe, int idSession, int idPlanning, int idSalle, int idModule, int idInscription,
			int idEtudiant) {
		super();
		this.idGroupe = idGroupe;
		this.idSession = idSession;
		this.idPlanning = idPlanning;
		this.idSalle = idSalle;
		this.idModule = idModule;
		this.idInscription = idInscription;
		this.idEtudiant = idEtudiant;
	}
}
