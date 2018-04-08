package project;

public class evaluations {
	private int idEvaluation;
	private int idAssiduite;
	private int idExamen;
	//private individu auteurEvaluation;
	private int noteEvaluation;
	private String apprecEvaluation;
	
	private evaluations(int idEvaluation, int idAssiduite, int idExamen, int noteEvaluation, String apprecEvaluation) {
		super();
		this.idEvaluation = idEvaluation;
		this.idAssiduite = idAssiduite;
		this.idExamen = idExamen;
		this.noteEvaluation = noteEvaluation;
		this.apprecEvaluation = apprecEvaluation;
	}

	private int getIdEvaluation() {
		return idEvaluation;
	}

	private void setIdEvaluation(int idEvaluation) {
		this.idEvaluation = idEvaluation;
	}

	private int getIdAssiduite() {
		return idAssiduite;
	}

	private void setIdAssiduite(int idAssiduite) {
		this.idAssiduite = idAssiduite;
	}

	private int getIdExamen() {
		return idExamen;
	}

	private void setIdExamen(int idExamen) {
		this.idExamen = idExamen;
	}

	private int getNoteEvaluation() {
		return noteEvaluation;
	}

	private void setNoteEvaluation(int noteEvaluation) {
		this.noteEvaluation = noteEvaluation;
	}

	private String getApprecEvaluation() {
		return apprecEvaluation;
	}

	private void setApprecEvaluation(String apprecEvaluation) {
		this.apprecEvaluation = apprecEvaluation;
	}
	
	
}
