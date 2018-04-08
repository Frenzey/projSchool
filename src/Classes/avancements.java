package Classes;

public class avancements {

private int	idAvencement;
private int	idSeance;
private lecons leconsCours;
private String commentCours;
private avancements avancemCours;

private avancements(int idAvencement, int idSeance, lecons leconsCours, String commentCours, avancements avancemCours) {
	super();
	this.idAvencement = idAvencement;
	this.idSeance = idSeance;
	this.leconsCours = leconsCours;
	this.commentCours = commentCours;
	this.avancemCours = avancemCours;
}

private int getIdAvencement() {
	return idAvencement;
}

private void setIdAvencement(int idAvencement) {
	this.idAvencement = idAvencement;
}

private int getIdSeance() {
	return idSeance;
}

private void setIdSeance(int idSeance) {
	this.idSeance = idSeance;
}

private lecons getLeconsCours() {
	return leconsCours;
}

private void setLeconsCours(lecons leconsCours) {
	this.leconsCours = leconsCours;
}

private String getCommentCours() {
	return commentCours;
}

private void setCommentCours(String commentCours) {
	this.commentCours = commentCours;
}

private avancements getAvancemCours() {
	return avancemCours;
}

private void setAvancemCours(avancements avancemCours) {
	this.avancemCours = avancemCours;
}


}
