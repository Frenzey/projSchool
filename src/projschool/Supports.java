package project;

public class Supports {
	private int idSupports;
	private int idMatiere;
	private int idtypeDocs;
	private String libelMatiere;
	private String titreSupports;
	
	public Supports(int a,int b,int c,String d,String e) {
		this.idSupports = a;
		this.idMatiere = b;
		this.idtypeDocs = c;
		this.libelMatiere = d;
		this.titreSupports = e;
	}

	private int getIdSupports() {
		return idSupports;
	}

	private void setIdSupports(int idSupports) {
		this.idSupports = idSupports;
	}

	private int getIdMatiere() {
		return idMatiere;
	}

	private void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}

	private int getIdtypeDocs() {
		return idtypeDocs;
	}

	private void setIdtypeDocs(int idtypeDocs) {
		this.idtypeDocs = idtypeDocs;
	}

	private String getLibelMatiere() {
		return libelMatiere;
	}

	private void setLibelMatiere(String libelMatiere) {
		this.libelMatiere = libelMatiere;
	}

	private String getTitreSupports() {
		return titreSupports;
	}

	private void setTitreSupports(String titreSupports) {
		this.titreSupports = titreSupports;
	}
	
	

}
