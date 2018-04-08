package Classes;

public class Cours {
	private int idCours;
	private int idSupport;
	private typeDocs  typeDocCours;
	private int nbrTypeDocCours;
	private Supports []Cours;
	private String libelCours;
	private int niveauCours;
	private int partieCours;
	private String volHorCours;
	private String descriptifCours;
	private String effetMaxCours;
	private Cours(int idCours, int idSupport, typeDocs typeDocCours, int nbrTypeDocCours, Supports[] cours,
			String libelCours, int niveauCours, int partieCours, String volHorCours, String descriptifCours,
			String effetMaxCours) {
		super();
		this.idCours = idCours;
		this.idSupport = idSupport;
		this.typeDocCours = typeDocCours;
		this.nbrTypeDocCours = nbrTypeDocCours;
		Cours = cours;
		this.libelCours = libelCours;
		this.niveauCours = niveauCours;
		this.partieCours = partieCours;
		this.volHorCours = volHorCours;
		this.descriptifCours = descriptifCours;
		this.effetMaxCours = effetMaxCours;
	}
	private int getIdCours() {
		return idCours;
	}
	private void setIdCours(int idCours) {
		this.idCours = idCours;
	}
	private int getIdSupport() {
		return idSupport;
	}
	private void setIdSupport(int idSupport) {
		this.idSupport = idSupport;
	}
	private typeDocs getTypeDocCours() {
		return typeDocCours;
	}
	private void setTypeDocCours(typeDocs typeDocCours) {
		this.typeDocCours = typeDocCours;
	}
	private int getNbrTypeDocCours() {
		return nbrTypeDocCours;
	}
	private void setNbrTypeDocCours(int nbrTypeDocCours) {
		this.nbrTypeDocCours = nbrTypeDocCours;
	}
	private Supports[] getCours() {
		return Cours;
	}
	private void setCours(Supports[] cours) {
		Cours = cours;
	}
	private String getLibelCours() {
		return libelCours;
	}
	private void setLibelCours(String libelCours) {
		this.libelCours = libelCours;
	}
	private int getNiveauCours() {
		return niveauCours;
	}
	private void setNiveauCours(int niveauCours) {
		this.niveauCours = niveauCours;
	}
	private int getPartieCours() {
		return partieCours;
	}
	private void setPartieCours(int partieCours) {
		this.partieCours = partieCours;
	}
	private String getVolHorCours() {
		return volHorCours;
	}
	private void setVolHorCours(String volHorCours) {
		this.volHorCours = volHorCours;
	}
	private String getDescriptifCours() {
		return descriptifCours;
	}
	private void setDescriptifCours(String descriptifCours) {
		this.descriptifCours = descriptifCours;
	}
	private String getEffetMaxCours() {
		return effetMaxCours;
	}
	private void setEffetMaxCours(String effetMaxCours) {
		this.effetMaxCours = effetMaxCours;
	}
	
	
}
