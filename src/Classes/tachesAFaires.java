package Classes;

public class tachesAFaires {
	private int idTacheAFaire;
	private int idReunion;
	private String libelTacheAFaire;
	private String echTacheAFaire;
	private String emettTacheAFaire;
	private String commTacheAFaire;
	private String ficheTacheAFaire;
	
	private int getIdTacheAFaire() {
		return idTacheAFaire;
	}

	private void setIdTacheAFaire(int idTacheAFaire) {
		this.idTacheAFaire = idTacheAFaire;
	}

	private int getIdReunion() {
		return idReunion;
	}

	private void setIdReunion(int idReunion) {
		this.idReunion = idReunion;
	}

	private String getLibelTacheAFaire() {
		return libelTacheAFaire;
	}

	private void setLibelTacheAFaire(String libelTacheAFaire) {
		this.libelTacheAFaire = libelTacheAFaire;
	}

	private String getEchTacheAFaire() {
		return echTacheAFaire;
	}

	private void setEchTacheAFaire(String echTacheAFaire) {
		this.echTacheAFaire = echTacheAFaire;
	}

	private String getEmettTacheAFaire() {
		return emettTacheAFaire;
	}

	private void setEmettTacheAFaire(String emettTacheAFaire) {
		this.emettTacheAFaire = emettTacheAFaire;
	}

	private String getCommTacheAFaire() {
		return commTacheAFaire;
	}

	private void setCommTacheAFaire(String commTacheAFaire) {
		this.commTacheAFaire = commTacheAFaire;
	}

	private String getFicheTacheAFaire() {
		return ficheTacheAFaire;
	}

	private void setFicheTacheAFaire(String ficheTacheAFaire) {
		this.ficheTacheAFaire = ficheTacheAFaire;
	}

	private tachesAFaires(int idTacheAFaire, int idReunion, String libelTacheAFaire, String echTacheAFaire,
			String emettTacheAFaire, String commTacheAFaire, String ficheTacheAFaire) {
		super();
		this.idTacheAFaire = idTacheAFaire;
		this.idReunion = idReunion;
		this.libelTacheAFaire = libelTacheAFaire;
		this.echTacheAFaire = echTacheAFaire;
		this.emettTacheAFaire = emettTacheAFaire;
		this.commTacheAFaire = commTacheAFaire;
		this.ficheTacheAFaire = ficheTacheAFaire;
	}
}
