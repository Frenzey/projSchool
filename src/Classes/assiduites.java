package Classes;

import java.util.Date;

public class assiduites {
  private int idAssiduite;
  private int idInscription;
  private int idSeance;
  private String etatAssiduite;
  private Date datRelancAssiduite;
  private String commAssiduite;
  private Documents docAssiduite;
  
private assiduites(int idAssiduite, int idInscription, int idSeance, String etatAssiduite, Date datRelancAssiduite,
		String commAssiduite, Documents docAssiduite) {
	super();
	this.idAssiduite = idAssiduite;
	this.idInscription = idInscription;
	this.idSeance = idSeance;
	this.etatAssiduite = etatAssiduite;
	this.datRelancAssiduite = datRelancAssiduite;
	this.commAssiduite = commAssiduite;
	this.docAssiduite = docAssiduite;
}

private int getIdAssiduite() {
	return idAssiduite;
}

private void setIdAssiduite(int idAssiduite) {
	this.idAssiduite = idAssiduite;
}

private int getIdInscription() {
	return idInscription;
}

private void setIdInscription(int idInscription) {
	this.idInscription = idInscription;
}

private int getIdSeance() {
	return idSeance;
}

private void setIdSeance(int idSeance) {
	this.idSeance = idSeance;
}

private String getEtatAssiduite() {
	return etatAssiduite;
}

private void setEtatAssiduite(String etatAssiduite) {
	this.etatAssiduite = etatAssiduite;
}

private Date getDatRelancAssiduite() {
	return datRelancAssiduite;
}

private void setDatRelancAssiduite(Date datRelancAssiduite) {
	this.datRelancAssiduite = datRelancAssiduite;
}

private String getCommAssiduite() {
	return commAssiduite;
}

private void setCommAssiduite(String commAssiduite) {
	this.commAssiduite = commAssiduite;
}

private Documents getDocAssiduite() {
	return docAssiduite;
}

private void setDocAssiduite(Documents docAssiduite) {
	this.docAssiduite = docAssiduite;
}



}
