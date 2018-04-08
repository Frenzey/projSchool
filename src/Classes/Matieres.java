package Classes;

import java.util.ArrayList;

public class Matieres {
	private String libelMatiere;
	private int idMatiere;
	private ArrayList idModule = new ArrayList() ;
	
	public void Matieres(String lib, int id, ArrayList l) {
		this.libelMatiere = lib;
		this.idMatiere = id;
		this.idModule = l;
	}

	private String getLibelMatiere() {
		return libelMatiere;
	}

	private void setLibelMatiere(String libelMatiere) {
		this.libelMatiere = libelMatiere;
	}

	private int getIdMatiere() {
		return idMatiere;
	}

	private void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}

	private ArrayList getIdModule() {
		return idModule;
	}

	private void setIdModule(ArrayList idModule) {
		this.idModule = idModule;
	}

}