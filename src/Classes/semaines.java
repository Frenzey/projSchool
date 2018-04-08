package Classes;

public class semaines {
	private int idSemaine;
	private String noSemaine;
	
	private semaines(int idSemaine, String noSemaine) {
		super();
		this.idSemaine = idSemaine;
		this.noSemaine = noSemaine;
	}

	private int getIdSemaine() {
		return idSemaine;
	}

	private void setIdSemaine(int idSemaine) {
		this.idSemaine = idSemaine;
	}

	private String getNoSemaine() {
		return noSemaine;
	}

	private void setNoSemaine(String noSemaine) {
		this.noSemaine = noSemaine;
	}
	
	
	
	
}
