package project;

public class examens {

private int	idExamen;
private int	idSupport;
private String typeExamen;
private String formeExamen;
private int baremExamen;
private String descrExam;

private examens(int idExamen, int idSupport, String typeExamen, String formeExamen, int baremExamen, String descrExam) {
	super();
	this.idExamen = idExamen;
	this.idSupport = idSupport;
	this.typeExamen = typeExamen;
	this.formeExamen = formeExamen;
	this.baremExamen = baremExamen;
	this.descrExam = descrExam;
}

private int getIdExamen() {
	return idExamen;
}

private void setIdExamen(int idExamen) {
	this.idExamen = idExamen;
}

private int getIdSupport() {
	return idSupport;
}

private void setIdSupport(int idSupport) {
	this.idSupport = idSupport;
}

private String getTypeExamen() {
	return typeExamen;
}

private void setTypeExamen(String typeExamen) {
	this.typeExamen = typeExamen;
}

private String getFormeExamen() {
	return formeExamen;
}

private void setFormeExamen(String formeExamen) {
	this.formeExamen = formeExamen;
}

private int getBaremExamen() {
	return baremExamen;
}

private void setBaremExamen(int baremExamen) {
	this.baremExamen = baremExamen;
}

private String getDescrExam() {
	return descrExam;
}

private void setDescrExam(String descrExam) {
	this.descrExam = descrExam;
}

}
