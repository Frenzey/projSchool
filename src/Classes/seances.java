package Classes;

public class seances {

	private int idSeance;
	private int idGroupe;
	private int idHoraire;
	//* private individu remplacantSeance; faire la classe individu
	private seances rattrapageSeance;
	private seances annulationSeance;
	private seances reportSeance;
	
	private seances(int idSeance, int idGroupe, int idHoraire, seances rattrapageSeance, seances annulationSeance,
			seances reportSeance) {
		super();
		this.idSeance = idSeance;
		this.idGroupe = idGroupe;
		this.idHoraire = idHoraire;
		this.rattrapageSeance = rattrapageSeance;
		this.annulationSeance = annulationSeance;
		this.reportSeance = reportSeance;
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

	private seances getRattrapageSeance() {
		return rattrapageSeance;
	}

	private void setRattrapageSeance(seances rattrapageSeance) {
		this.rattrapageSeance = rattrapageSeance;
	}

	private seances getAnnulationSeance() {
		return annulationSeance;
	}

	private void setAnnulationSeance(seances annulationSeance) {
		this.annulationSeance = annulationSeance;
	}

	private seances getReportSeance() {
		return reportSeance;
	}

	private void setReportSeance(seances reportSeance) {
		this.reportSeance = reportSeance;
	}
	
	
}
